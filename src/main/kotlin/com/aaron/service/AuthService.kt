package com.aaron.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.ReactiveRedisTemplate
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@Service
class AuthService @Autowired constructor(
    private val reactiveRedisTemplate: ReactiveRedisTemplate<String, String>
) {
    fun getAuth(id: String): Mono<String> {
        return reactiveRedisTemplate.opsForValue().get(id)
    }
}