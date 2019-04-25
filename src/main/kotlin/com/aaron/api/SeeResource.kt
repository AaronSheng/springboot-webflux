package com.aaron.api

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.http.codec.ServerSentEvent
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@Api(tags = ["SEE_SEE"], description = "服务推送-服务推送")
@RequestMapping("/sees")
interface SeeResource {
    @ApiOperation("获取用户信息")
    @GetMapping("/{userId}")
    fun get(
        @ApiParam(value = "用户ID", required = true)
        @PathVariable("userId")
        userId: String
    ): Flux<ServerSentEvent<String>>
}