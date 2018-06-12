package com.aaron.resource

import com.aaron.api.AuthResource
import com.aaron.config.RestResource
import com.aaron.pojo.Auth
import com.aaron.pojo.Result
import com.aaron.service.AuthService
import com.aaron.service.UserService
import org.springframework.beans.factory.annotation.Autowired

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@RestResource
class AuthResourceImpl @Autowired constructor(
        private val authService: AuthService
): AuthResource {
    override fun get(userId: Long): Result<Auth> {
        return Result(authService.getAuth(userId))
    }
}