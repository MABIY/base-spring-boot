package com.lh.base.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lh
 **/
@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "tt";
    }
}
