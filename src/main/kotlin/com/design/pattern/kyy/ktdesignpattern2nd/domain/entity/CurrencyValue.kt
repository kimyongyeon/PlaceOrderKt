package com.design.pattern.kyy.ktdesignpattern2nd.domain.entity

import jakarta.persistence.Embeddable
import java.math.BigDecimal
import java.util.Currency

@Embeddable
class CurrencyValue {
    var price: BigDecimal = BigDecimal.ZERO
    var currency: Currency = Currency.getInstance("KRW")

    private constructor(price: BigDecimal, currency: Currency) {
        this.price = price
        this.currency = currency
    }

    companion object {
        fun of(price: BigDecimal, currency: Currency): CurrencyValue {
            return CurrencyValue(price, currency)
        }
    }


}