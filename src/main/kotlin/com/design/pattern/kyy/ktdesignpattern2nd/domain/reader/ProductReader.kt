package com.design.pattern.kyy.ktdesignpattern2nd.domain.reader

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.ProductEntity

interface ProductReader {
    fun getProduct(productId: Long): ProductEntity?
}