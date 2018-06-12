package com.aaron.config

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
annotation class RestResource