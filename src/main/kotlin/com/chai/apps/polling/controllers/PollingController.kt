package com.chai.apps.polling.controllers

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces

@Controller("/")
class PollingController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): HttpResponse<String> {
        return HttpResponse.ok("Welcome! Poll Creator!!")
    }

    @Post
    fun cratePoll(

    ) {

    }
}