package com.aaron.resource

import com.aaron.api.SeeResource
import com.aaron.service.SeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.codec.ServerSentEvent
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

/**
 * Created by Aaron Sheng on 2019/4/25.
 */
@RestController
class SeeResourceImpl @Autowired constructor(
    private val seeService: SeeService
): SeeResource {
    override fun get(userId: String): Flux<ServerSentEvent<String>> {
        return seeService.getUser(userId)
    }
}