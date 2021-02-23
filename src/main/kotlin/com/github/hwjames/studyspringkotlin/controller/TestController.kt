package com.github.hwjames.studyspringkotlin.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/test")
class TestController {

    @GetMapping()
    private fun getTest(): String {
        return HttpStatus.OK.toString()
    }
}