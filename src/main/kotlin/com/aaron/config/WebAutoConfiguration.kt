package com.aaron.config

import org.springframework.boot.autoconfigure.AutoConfigureBefore
import org.springframework.boot.autoconfigure.AutoConfigureOrder
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication
import org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.core.Ordered

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
class WebAutoConfiguration{
    @Bean
    @Profile("!prod")
    fun jerseySwaggerConfig() = JerseySwaggerConfig()

    @Bean
    @Profile("prod")
    fun jerseyConfig() = JerseyConfig()
}