package com.design.pattern.kyy.ktdesignpattern2nd.infrastructure.product

import com.design.pattern.kyy.ktdesignpattern2nd.domain.entity.ProductEntity
import com.design.pattern.kyy.ktdesignpattern2nd.domain.reader.ProductReader
import org.springframework.stereotype.Component

@Component
class ProductReaderImpl (private val productRepository: ProductRepository) : ProductReader {
    override fun getProduct(productId: Long): ProductEntity? {
        return productRepository.findByIdOrderByCreateAt(productId)

    }
}