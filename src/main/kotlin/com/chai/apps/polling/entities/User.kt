package com.chai.apps.polling.entities

import io.micronaut.core.annotation.Introspected
import javax.persistence.*

@Entity
@Table(name = "user")
@Introspected
open class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var userId: Long? = null
}