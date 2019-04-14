package com.aaron.config

import org.springframework.boot.autoconfigure.AutoConfigureBefore
import org.springframework.boot.autoconfigure.AutoConfigureOrder
import org.springframework.boot.autoconfigure.data.redis.RedisReactiveAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.core.ReactiveRedisTemplate
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.serializer.RedisSerializationContext
import org.springframework.data.redis.serializer.StringRedisSerializer

/**
 * Created by Aaron Sheng on 2019/4/12.
 */
@Configuration
@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
@AutoConfigureBefore(RedisReactiveAutoConfiguration::class)
class RedisAutoConfiguration {

    @Bean
    fun reactiveRedisTemplate(factory: ReactiveRedisConnectionFactory): ReactiveRedisTemplate<String, String> {
        return ReactiveRedisTemplate(factory, RedisSerializationContext.fromSerializer(StringRedisSerializer()))
    }
}