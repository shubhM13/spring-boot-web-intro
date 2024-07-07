package com.gfg.spring_boot_web_intro;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloWorld {
    void print(){
        log.info("Hello World");
    }
}
