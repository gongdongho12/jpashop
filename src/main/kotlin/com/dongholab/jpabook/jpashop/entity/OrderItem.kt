package com.dongholab.jpabook.jpashop.entity

import com.dongholab.jpabook.jpashop.entity.item.Item
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "orders")
data class OrderItem(
    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    val id: Long,
    val item: Item,
    @ManyToOne
    @JoinColumn(name = "order_id")
    val order: Order,
    val orderPrice: Int,
    val count: Int
)
