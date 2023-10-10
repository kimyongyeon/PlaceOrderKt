package com.design.pattern.kyy.ktdesignpattern2nd.domain.entity

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("M")
class Movie(

    var director: String? = null,
    var actor: String? = null

) : Item()
