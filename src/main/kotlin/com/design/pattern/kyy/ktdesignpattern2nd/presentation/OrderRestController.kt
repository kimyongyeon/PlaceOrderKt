package com.design.pattern.kyy.ktdesignpattern2nd.presentation

import com.design.pattern.kyy.ktdesignpattern2nd.domain.dto.OrderDTO
import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.Album
import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.Movie
import com.design.pattern.kyy.ktdesignpattern2nd.domain.service.BrowserFileDownService
import com.design.pattern.kyy.ktdesignpattern2nd.domain.service.CurlFileDownService
import com.design.pattern.kyy.ktdesignpattern2nd.domain.service.FileDownService
import com.design.pattern.kyy.ktdesignpattern2nd.domain.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderRestController (
    private val orderService: OrderService,
    private val browserFileDownService: FileDownService,
    private val curlFileDownService: FileDownService
) {
    @PostMapping("/order")
    fun order(orderDTO: OrderDTO) = orderService.order(orderDTO)

    @GetMapping("/order")
    fun order(orderId: Long) = orderService.getOrder(orderId)

    @GetMapping("/order/files")
    fun getFiles() = browserFileDownService.getFiles()

    @GetMapping("/order/files2")
    fun getFiles2() = curlFileDownService.getFiles()

    @GetMapping("/order/files3")
    fun getFiles3() = browserFileDownService.getFilesByCurl()

    @GetMapping("/order/files4")
    fun getFiles4() = FileDownService.getFilesByCurl()

    @GetMapping("/order/item")
    fun getItem() {
        val movie = Movie()
        movie.actor = "actor"
        movie.director = "director"

        val album = Album()
        album.artist = "artist"
        album.genre = "genre"



    }

}