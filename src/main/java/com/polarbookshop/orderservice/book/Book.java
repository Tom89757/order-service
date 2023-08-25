package com.polarbookshop.orderservice.book;

/**
 * @author Tom89757
 */
public record Book(
        String isbn,
        String title,
        String author,
        Double price
) {
}
