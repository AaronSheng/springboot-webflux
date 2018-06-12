package com.aaron.api

import com.aaron.pojo.Auth
import com.aaron.pojo.Result
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

/**
 * Created by Aaron Sheng on 2018/6/12.
 */
@Api(tags = ["AUTH_AUTH"], description = "用户-用户管理")
@Path("/auths")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
interface AuthResource {
    @ApiOperation("获取授权信息")
    @Path("/{userId}")
    @GET
    fun get(
            @ApiParam(value = "用户ID", required = true)
            @PathParam("userId")
            userId: Long
    ): Result<Auth>
}