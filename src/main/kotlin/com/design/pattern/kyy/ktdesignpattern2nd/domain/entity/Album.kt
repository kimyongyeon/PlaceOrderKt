package com.design.pattern.kyy.ktdesignpattern2nd.domain.entity

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("A")
class Album(

    var artist: String? = null,
    var genre: String? = null

) : Item()
