package com.example.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/26.
 */
@RestController
public class HelloRestController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
