package com.design.pattern.kyy.ktdesignpattern2nd.domain.entity

import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class MemberEntity  : BaseEntity() {
    @Id
    @GeneratedValue
    var id: Long? = 0;
    var name: String? = "";
    var age: Int? = 0;

    @Embedded
    var address: Address? = null;
}
