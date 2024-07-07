package com.gfg.spring_boot_web_intro;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class Api {

    String user;

    @PostMapping("/api/user/{name}")
    ResponseEntity createUser(@PathVariable("name") String name) {
        log.info("user "+ name + " is created");
        user = name;
        return ResponseEntity.ok().body(name);
    }

    @GetMapping("/api/user/")
    ResponseEntity getUser() {
        return ResponseEntity.ok(user);
    }

    @PutMapping("/api/user/newName/{newName}")
    ResponseEntity updateUser(@PathVariable("newName") String name) {
        user = name;
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/api/user/")
    ResponseEntity deleteUser() {
        user = "";
        return ResponseEntity.ok().build();
    }
}
