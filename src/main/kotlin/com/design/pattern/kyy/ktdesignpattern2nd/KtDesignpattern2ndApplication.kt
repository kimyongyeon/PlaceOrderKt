package com.design.pattern.kyy.ktdesignpattern2nd

import jakarta.persistence.*
import jakarta.transaction.Transactional
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@SpringBootApplication
class KtDesignpattern2ndApplication : CommandLineRunner {

    companion object {
        fun add(a: Int, b: Int) = a + b
    }

    override fun run(vararg args: String?) {

        val add = KtDesignpattern2ndApplication.add(1, 2)
        println(add)

        // 무한수 계속 출력하기 , 메모리가 허용하는 수준까지 계속 출력한다.
//        generateSequence(0) { it + 1 }.forEach(::println)

        println("hello, kotlin")
    }
}

//@Embeddable
//data class Address(val city: String, val street: String, val zipcode: String)
//
//@MappedSuperclass
//open class BaseEntity (
//    val createAt: Date = Date(),
//    val updateAt: Date = Date(),
//    val creator: String = "",
//    val updater: String = ""
//)
//
//@Entity
//data class Orders (
//    @Id @GeneratedValue val id: Long,
//    val name: String,
//    val price: Int,
//    val address: Address,
//    val stock: Int = 0
//) : BaseEntity()
//
//interface OrdersRepository : JpaRepository<Orders, Long> {
//}
//
//@Service
//@Transactional
//class OrderService (private val ordersRepository: OrdersRepository) {
//
//    init {
//        ordersRepository.save(Orders(1, "kyy", 1000, Address("seoul", "street", "zipcode")))
//        ordersRepository.save(Orders(2, "kyy2", 2000, Address("seoul", "street", "zipcode")))
//
//        val orders1 = Orders(3, "kyy3", 3000 , Address("seoul", "street", "zipcode"))
//        val orders2 = Orders(3, "kyy3", 3000, Address("seoul", "street", "zipcode"))
//
//        ordersRepository.save(orders1)
//        ordersRepository.save(orders2)
//
//        println("동등성 : ${orders1 == orders2}")
//        println("동일성 : ${orders1.equals(orders2)}")
//    }
//
//    fun getOrders(): List<Orders> {
//        return ordersRepository.findAll()
//    }
//
//    fun getGreeting() = "hello, kotlin"
//}
//
//@RestController
//class HelloController(private val orderService: OrderService) {
//
//
//    @GetMapping("/hello")
//    fun hello(): String {
//        val orders = orderService.getOrders()
//
//        orders.forEach(::println)
//
//        // 자바 스트림 개수가 적으면 더 속도가 느리다.
//        orders.stream().map { it.name + " : 차장 " }.forEach(::println)
//        orders.stream().filter { it.price > 1000 }.forEach(::println)
//
//        // 코틀린 스트림 개수가 적어도 빠르다.
//        orders.filter { it.price > 1000 }.forEach(::println)
//        orders.map { it.name + " : 차장 " }.forEach(::println)
//
//        // 큰 데이터인 경우 sequence를 사용한다.
//        orders.asSequence().filter { it.price > 1000 }.forEach(::println)
//        orders.asSequence().map { it.name + " : 차장 " }.forEach(::println)
//
//        return orders.toString()
//    }
//
//    @GetMapping("/hello2")
//    fun hello2() = orderService.getGreeting()
//}

fun main(args: Array<String>) {
    runApplication<KtDesignpattern2ndApplication>(*args)
}
