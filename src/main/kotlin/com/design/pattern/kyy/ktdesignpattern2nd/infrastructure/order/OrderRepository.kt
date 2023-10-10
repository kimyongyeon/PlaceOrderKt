package com.design.pattern.kyy.ktdesignpattern2nd.infrastructure.order

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.OrderEntity
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository: JpaRepository<OrderEntity, Long> {
}