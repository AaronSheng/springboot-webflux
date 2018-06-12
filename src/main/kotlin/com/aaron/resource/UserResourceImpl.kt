package com.aaron.resource

import com.aaron.api.UserResource
import com.aaron.config.RestResource
import com.aaron.pojo.Result
import com.aaron.pojo.User
import com.aaron.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@RestResource
class UserResourceImpl @Autowired constructor(
        private val userService: UserService
): UserResource {
    override fun get(userId: Long): Result<User> {
        return Result(userService.getUser(userId))
    }
}