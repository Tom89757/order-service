package com.polarbookshop.orderservice.order.event;

/**
 * @author Tom89757
 */
public record OrderDispatchedMessage(
        Long orderId
) {
}
