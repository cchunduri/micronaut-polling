package com.chai.apps.polling.entities

import io.micronaut.core.annotation.Introspected
import javax.persistence.*

@Entity
@Table(name = "mn-poll")
@Introspected
open class MnPoll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var pollId: Long? = null
    open var pollName: String? = null
    open var pollDesc: String? = null
    @OneToOne
    @JoinColumn(name = "poll_creator")
    open var createdBy: User? = null


}