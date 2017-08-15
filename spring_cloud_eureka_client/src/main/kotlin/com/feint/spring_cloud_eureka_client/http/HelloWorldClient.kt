package com.feint.spring_cloud_eureka_client.http

import org.springframework.cloud.netflix.feign.FeignClient

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("hello-world")
interface HelloWorldClient{
    @RequestMapping(value="/hello",method = arrayOf(RequestMethod.GET))
    fun sayHello():String
}