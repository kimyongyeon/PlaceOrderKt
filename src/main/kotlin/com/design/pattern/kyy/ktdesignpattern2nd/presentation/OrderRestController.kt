package com.design.pattern.kyy.ktdesignpattern2nd.presentation

import com.design.pattern.kyy.ktdesignpattern2nd.domain.dto.OrderDTO
import com.design.pattern.kyy.ktdesignpattern2nd.domain.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderRestController (private val orderService: OrderService) {
    @PostMapping("/order")
    fun order(orderDTO: OrderDTO) = orderService.order(orderDTO)

    @GetMapping("/order")
    fun order(orderId: Long) = orderService.getOrder(orderId)

}