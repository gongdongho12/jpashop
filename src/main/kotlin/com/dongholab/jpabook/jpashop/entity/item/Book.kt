package com.dongholab.jpabook.jpashop.entity.item

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("B")
data class Book(
    val author: String,
    val isbn: String
): Item()
