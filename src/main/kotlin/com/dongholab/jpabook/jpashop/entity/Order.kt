package com.dongholab.jpabook.jpashop.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name="orders")
data class Order(
    @Id
    @GeneratedValue
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "member_id")
    val member: Member,
    val orderItems: List<OrderItem> = listOf(),
    val delivery: Delivery,
    val orderDate: LocalDateTime,
    val status: OrderStatus

)
