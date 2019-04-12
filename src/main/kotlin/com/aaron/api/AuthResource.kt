package com.aaron.api

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import reactor.core.publisher.Mono

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@Api(tags = ["AUTH_AUTH"], description = "用户-用户管理")
@RequestMapping("/auths")
interface AuthResource {
    @ApiOperation("获取授权信息")
    @GetMapping("/{userId}")
    fun get(
        @ApiParam(value = "用户ID", required = true)
        @PathVariable("userId")
        userId: String
    ): Mono<String>
}