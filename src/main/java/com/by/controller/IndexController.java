package com.by.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 入口controller
 *
 * @author macbookpro
 */
@RestController
@RequestMapping("/")
@Slf4j
public class IndexController {

    @GetMapping("index")
    public String index(HttpServletRequest request) {
        //http://localhost:8099/index
        log.info("request:" + request.getRequestURL());
        return "index page";
    }

    @GetMapping
    public String hello() {
        return "hello world";
    }

    @GetMapping("aop/{a}")
    public String aopTest(@PathVariable("a")int a) {
        log.info("a: {}",a);
        return "AOP" + a;
    }
}
