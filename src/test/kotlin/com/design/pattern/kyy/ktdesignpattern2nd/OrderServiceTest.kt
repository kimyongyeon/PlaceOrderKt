package com.design.pattern.kyy.ktdesignpattern2nd

import com.design.pattern.kyy.ktdesignpattern2nd.domain.dto.OrderDTO
import com.design.pattern.kyy.ktdesignpattern2nd.domain.service.OrderService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class OrderServiceTest {

    @Autowired
    lateinit var orderService: OrderService

    @Test
    fun order() {
        val orderDTO = OrderDTO(1L, 100)
        orderService.order(orderDTO)
    }

}