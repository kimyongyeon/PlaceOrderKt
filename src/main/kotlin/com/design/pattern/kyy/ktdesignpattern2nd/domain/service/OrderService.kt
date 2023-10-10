package com.design.pattern.kyy.ktdesignpattern2nd.domain.service

import com.design.pattern.kyy.ktdesignpattern2nd.common.exception.BusinessException
import com.design.pattern.kyy.ktdesignpattern2nd.domain.dto.OrderDTO
import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.*
import com.design.pattern.kyy.ktdesignpattern2nd.domain.reader.OrderReader
import com.design.pattern.kyy.ktdesignpattern2nd.domain.reader.ProductReader
import com.design.pattern.kyy.ktdesignpattern2nd.domain.store.OrderStore
import com.design.pattern.kyy.ktdesignpattern2nd.domain.store.ProductStore
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.util.*

interface OrderService {

    fun order(orderDTO: OrderDTO)

    fun getOrder(orderId: Long): OrderEntity

    @Service
    @Transactional
    class OrderServiceImpl (
        private val productReader: ProductReader,
        private val productStore: ProductStore,
        private val orderStore: OrderStore,
        private val orderReader: OrderReader
    ) : OrderService {

        init {
            println("OrderServiceImpl init")
            val productList = mutableListOf<ProductEntity>()
            for(i in 1..100) {
                productList.add(ProductEntity().apply {
                    name = "면티 : " + i
                    amount = CurrencyValue.of(BigDecimal.valueOf(1000), Currency.getInstance("KRW"))
                    stock = 1000 + i
                    address = Address.of("서울시," + i, "강남구", "123-123")
                })
            }
            productStore.regProducts(productList)
            println("OrderServiceImpl init end")
        }

        override fun order(orderDTO: OrderDTO) {

            productStore.regProduct(ProductEntity().apply {
                name = "면티"
                amount = CurrencyValue.of(BigDecimal.valueOf(10000), Currency.getInstance("KRW"))
                stock = 1000
                address = Address.of("서울시", "강남구", "123-123")
            })

            val productEntity = productReader.getProduct(orderDTO.productId) ?: throw BusinessException(BusinessException.ErrorCode.PRODUCT_OUT_OF_STOCK)

            val orderEntity = OrderEntity().apply {
                name = "면티"
                orderDate = Date()
                orderState = OrderState.ORDERED
            }

            val run = orderEntity.run { "Name: $name, orderDate: $orderDate" }
            println(run)

            val orderItemEntity = OrderItemEntity()
            orderItemEntity.stockCount = orderDTO.stock

            orderItemEntity.productEntity = productEntity
            orderEntity.addOrderItem(orderItemEntity)
            orderStore.createOrder(orderEntity)

            orderEntity.orderState = OrderState.PAYED

            productEntity.decreaseStock(orderItemEntity.stockCount)
            productStore.regProduct(productEntity)

            orderEntity.orderState = OrderState.DELIVERED
        }

        override fun getOrder(orderId: Long): OrderEntity {
            return orderReader.getOrder(orderId)
        }

    }
}
