package com.design.pattern.kyy.ktdesignpattern2nd.domain.store

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.OrderEntity

interface OrderStore {
    fun createOrder(orderEntity: OrderEntity)
}