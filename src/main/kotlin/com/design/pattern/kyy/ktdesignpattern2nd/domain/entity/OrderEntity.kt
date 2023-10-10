package com.design.pattern.kyy.ktdesignpattern2nd.domain.entity

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.util.Date

@Entity
class OrderEntity {

    @Id
    @GeneratedValue
    var id: Long? = 0

    var name: String? = ""

    var orderDate: Date? = null

    var orderState: OrderState? = null

    @OneToMany(mappedBy = "orderEntity", orphanRemoval = true, cascade = [CascadeType.ALL])
    var orderItems = mutableListOf<OrderItemEntity>()

    fun totalAmount(): Long {
        return orderItems.map { it.productEntity!!.amount!!.price.toLong() }.sum()
    }

    fun totalCount(): Int {
        return orderItems.size
    }

    fun addOrderItem(orderItemEntity: OrderItemEntity) {
        orderItems.add(orderItemEntity)
        orderItemEntity.orderEntity = this
    }

    companion object {
        fun createOrder(name: String, orderDate: Date): OrderEntity {
            val orderEntity = OrderEntity()
            orderEntity.name = name
            orderEntity.orderDate = orderDate
            return orderEntity
        }
    }
}