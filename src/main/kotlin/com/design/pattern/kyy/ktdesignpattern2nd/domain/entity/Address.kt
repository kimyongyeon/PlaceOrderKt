package com.design.pattern.kyy.ktdesignpattern2nd.domain.entity

import jakarta.persistence.Embeddable

@Embeddable
class Address {
    var city: String = ""
    var street: String = ""
    var zipcode: String = ""

    private constructor(city: String, street: String, zipcode: String) {
        this.city = city
        this.street = street
        this.zipcode = zipcode
    }

    companion object {
        fun of(city: String, street: String, zipcode: String): Address {
            return Address(city, street, zipcode)
        }
    }
}