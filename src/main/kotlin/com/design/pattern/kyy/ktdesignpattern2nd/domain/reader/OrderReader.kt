package com.design.pattern.kyy.ktdesignpattern2nd.domain.reader

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.OrderEntity

interface OrderReader {
    fun getOrder(orderId: Long): OrderEntity
}