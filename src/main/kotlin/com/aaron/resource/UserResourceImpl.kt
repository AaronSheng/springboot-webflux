package com.aaron.resource

import com.aaron.api.UserResource
import com.aaron.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@RestController
class UserResourceImpl @Autowired constructor(
        private val userService: UserService
): UserResource {
    override fun get(userId: String): Mono<String> {
        return userService.getUser(userId)
    }

    override fun create(userId: String, name: String): Mono<Boolean> {
        return userService.createUser(userId, name)
    }
}