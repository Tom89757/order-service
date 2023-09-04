package com.polarbookshop.orderservice.order.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author Tom89757
 */
public interface OrderRepository extends ReactiveCrudRepository<Order, Long> {
}
