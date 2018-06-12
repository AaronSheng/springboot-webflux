package com.aaron.service

import com.aaron.pojo.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@Service
class UserService @Autowired constructor() {
    fun getUser(id: Long): User {
        return User(id)
    }
}