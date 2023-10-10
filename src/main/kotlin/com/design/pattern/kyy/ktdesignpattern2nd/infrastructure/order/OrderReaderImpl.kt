package com.design.pattern.kyy.ktdesignpattern2nd.infrastructure.order

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.OrderEntity
import com.design.pattern.kyy.ktdesignpattern2nd.domain.reader.OrderReader
import org.springframework.stereotype.Component

@Component
class OrderReaderImpl (private val orderRepository: OrderRepository) : OrderReader {
    override fun getOrder(orderId: Long): OrderEntity {
        orderRepository.findById(orderId).let {
            return it.get()
        }
    }
}