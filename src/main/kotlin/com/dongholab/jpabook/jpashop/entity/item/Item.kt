package com.dongholab.jpabook.jpashop.entity.item

import javax.persistence.Column
import javax.persistence.DiscriminatorColumn
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Inheritance
import javax.persistence.InheritanceType

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
abstract class Item {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    val id: Long = 0
    val name: String = ""
    val price: Int = 0
    val stockQuantity: Int = 0
}