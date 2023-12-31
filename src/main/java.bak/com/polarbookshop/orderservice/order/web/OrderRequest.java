package com.polarbookshop.orderservice.order.web;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Tom89757
 */

public record OrderRequest(

        @NotBlank(message = "The book ISBN must be defined")
        String isbn,

        @NotNull(message = "The book quantity must be defined.")
        @Min(value = 1, message = "You must order at least a item.")
        @Max(value = 5, message = "You cannot order more than 5 item.")
        Integer quantity

) {
}
