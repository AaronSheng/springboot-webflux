package com.aaron.api

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@Api(tags = ["USER_USER"], description = "用户-用户信息")
@RequestMapping("/users")
interface UserResource {
    @ApiOperation("获取信息")
    @GetMapping("/{userId}")
    fun get(
        @ApiParam(value = "用户ID", required = true)
        @PathVariable("userId")
        userId: String
    ): Mono<String>

    @ApiOperation("获取信息")
    @PostMapping("/{userId}")
    fun create(
        @ApiParam(value = "用户ID", required = true)
        @PathVariable("userId")
        userId: String,
        @ApiParam(value = "用户名称", required = true)
        @RequestParam("name")
        name: String
    ): Mono<Boolean>
}