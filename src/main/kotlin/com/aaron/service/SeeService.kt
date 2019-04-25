package com.aaron.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.codec.ServerSentEvent
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import java.time.Duration
import java.util.concurrent.ThreadLocalRandom

/**
 * Created by Aaron Sheng on 2019/4/25.
 */
@Service
class SeeService @Autowired constructor() {
    fun getUser(userId: String): Flux<ServerSentEvent<String>> {
        return Flux.interval(Duration.ofSeconds(1))
            .map { seq -> ServerSentEvent.builder<String>()
                .comment("User: $userId")
                .id(seq.toString())
                .data(ThreadLocalRandom.current().nextLong().toString())
                .build()
            }
    }
}