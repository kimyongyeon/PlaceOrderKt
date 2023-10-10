package com.design.pattern.kyy.ktdesignpattern2nd.domain.entity

import com.design.pattern.kyy.ktdesignpattern2nd.common.exception.BusinessException
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class ProductEntity : BaseEntity() {
    @Id
    @GeneratedValue
    var id: Long = 0
    var name: String = ""
    var amount: CurrencyValue? = null
    var stock: Int = 0

    fun decreaseStock(quantity: Int) {
        val restStock = stock - quantity
        if (restStock < 0) {
            throw BusinessException(BusinessException.ErrorCode.INVALID_STOCK)
        }
        this.stock = restStock
    }

    @Embedded
    var address: Address? = null

}