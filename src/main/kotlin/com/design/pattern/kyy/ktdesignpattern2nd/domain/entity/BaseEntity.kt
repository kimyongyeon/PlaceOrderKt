package com.design.pattern.kyy.ktdesignpattern2nd.domain.entity

import jakarta.persistence.MappedSuperclass
import jakarta.persistence.PrePersist
import jakarta.persistence.PreUpdate
import java.util.Date

@MappedSuperclass
open class BaseEntity {
    var createAt: Date = Date()
    var creator: String = ""

    var updateAt: Date = Date()
    var updater: String = ""

    @PrePersist
    fun persist() {
        this.createAt = Date()
        this.creator = "SYSTEM_CREATE"
    }

    @PreUpdate
    fun update() {
        this.updateAt = Date()
        this.updater = "SYSTEM_UPDATE"
    }
}