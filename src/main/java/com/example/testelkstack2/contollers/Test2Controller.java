package com.example.testelkstack2.contollers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("test2")
@Slf4j
public class Test2Controller {

    @GetMapping("/info")
    public String getInfo() {
        String result = "get info message " + LocalDateTime.now();

        log.info(result);

        return result;
    }
    @GetMapping("/warn")
    public String getWarn() {
        String result = "get warn message " + LocalDateTime.now();

        log.warn(result);

        return result;
    }

    @GetMapping("/error")
    public String getError() {
        String result = "get error message " + LocalDateTime.now();

        log.error(result);

        return result;
    }
}
