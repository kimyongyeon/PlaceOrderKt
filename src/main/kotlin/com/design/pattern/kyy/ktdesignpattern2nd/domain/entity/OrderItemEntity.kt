package com.design.pattern.kyy.ktdesignpattern2nd.domain.entity

import jakarta.persistence.*

@Entity
class OrderItemEntity {
    @Id @GeneratedValue
    var id: Long? = 0

    @ManyToOne
    @JoinColumn(name = "product_id")
    var productEntity: ProductEntity? = null;

    @ManyToOne
    @JoinColumn(name = "order_id")
    var orderEntity: OrderEntity? = null;

    var stockCount: Int = 0


}