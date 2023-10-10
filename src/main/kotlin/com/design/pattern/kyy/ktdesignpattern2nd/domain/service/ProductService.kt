package com.design.pattern.kyy.ktdesignpattern2nd.domain.service

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.ProductEntity
import com.design.pattern.kyy.ktdesignpattern2nd.domain.reader.ProductReader
import com.design.pattern.kyy.ktdesignpattern2nd.domain.store.ProductStore
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

interface ProductService {
    fun updateProductStock(productEntity: ProductEntity)

    fun findProduct(productId: Long): ProductEntity?
    @Service
    @Transactional
    class ProductServiceImpl (private val productReader: ProductReader,
                              private val productStore: ProductStore,) : ProductService {

        override fun updateProductStock(productEntity: ProductEntity) {
            productStore.regProduct(productEntity)
        }

        override fun findProduct(productId: Long): ProductEntity? {
            return productReader.getProduct(productId)
        }
    }
}