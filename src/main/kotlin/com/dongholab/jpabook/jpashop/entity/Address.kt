package com.dongholab.jpabook.jpashop.entity

import javax.persistence.Embeddable

@Embeddable
data class Address (
    var city: String,
    var street: String,
    var zipcode: String
)