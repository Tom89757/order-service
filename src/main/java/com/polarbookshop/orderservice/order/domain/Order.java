package com.polarbookshop.orderservice.order.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

/**
 * @author Tom89757
 */

@Table("order")
public record Order(

        @Id
        Long id,

        String bokIsbn,
        String bookName,
        Double bookPrice,
        Integer quantity,
        OrderStatus status,

        @CreatedDate
        Instant createdDate,

        @LastModifiedDate
        Instant lastModifiedDate,

        @Version
        int version

) {
    public static Order of(
            String bookIsbn, String bookName, Double bookPrice,
            Integer quantity, OrderStatus status
    ) {
        return new Order(
                null, bookIsbn, bookName, bookPrice, quantity, status, null, null, 0
        );
    }

}
