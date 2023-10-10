package com.design.pattern.kyy.ktdesignpattern2nd.infrastructure.order

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.OrderEntity
import com.design.pattern.kyy.ktdesignpattern2nd.domain.store.OrderStore
import org.springframework.stereotype.Component

@Component
class OrderStoreImpl(private val orderRepository: OrderRepository) : OrderStore {
    override fun createOrder(orderEntity: OrderEntity) {
        orderRepository.save(orderEntity)
    }
}