package com.aaron.resource

import com.aaron.api.AuthResource
import com.aaron.service.AuthService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@RestController
class AuthResourceImpl @Autowired constructor(
        private val authService: AuthService
): AuthResource {
    override fun get(userId: String): Mono<String> {
        return authService.getAuth(userId)
    }
}