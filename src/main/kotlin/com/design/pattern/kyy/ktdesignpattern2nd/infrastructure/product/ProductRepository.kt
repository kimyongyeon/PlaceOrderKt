package com.design.pattern.kyy.ktdesignpattern2nd.infrastructure.product

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.ProductEntity
import jakarta.persistence.LockModeType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Lock
import java.util.*

interface ProductRepository: JpaRepository<ProductEntity, Long> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    fun findByIdOrderByCreateAt(productId: Long): ProductEntity?
}