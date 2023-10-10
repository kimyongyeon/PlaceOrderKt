package com.design.pattern.kyy.ktdesignpattern2nd.domain.store

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.ProductEntity

interface ProductStore {
    fun regProduct(productEntity: ProductEntity)

    fun regProducts(productEntities: List<ProductEntity>)
}