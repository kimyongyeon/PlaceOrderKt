package com.design.pattern.kyy.ktdesignpattern2nd.domain.entity

import jakarta.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
abstract class Item(

    @Id
    @GeneratedValue
    var id: Long? = null,

    var name: String? = null,
    var price: Double = 0.0

)
