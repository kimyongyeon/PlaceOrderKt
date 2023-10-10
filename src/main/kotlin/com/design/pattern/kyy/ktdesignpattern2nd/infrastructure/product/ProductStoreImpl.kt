package com.design.pattern.kyy.ktdesignpattern2nd.infrastructure.product

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.ProductEntity
import com.design.pattern.kyy.ktdesignpattern2nd.domain.store.ProductStore
import org.springframework.stereotype.Component

@Component
class ProductStoreImpl(private val productRepository: ProductRepository) : ProductStore {
    override fun regProduct(productEntity: ProductEntity) {
        productRepository.save(productEntity)
    }

    override fun regProducts(productEntities: List<ProductEntity>) {
        productRepository.saveAll(productEntities)
    }
}