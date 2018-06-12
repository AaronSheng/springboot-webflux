package com.aaron.service

import com.aaron.pojo.Auth
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@Service
class AuthService @Autowired constructor() {
    fun getAuth(id: Long): Auth {
        return Auth(id)
    }
}