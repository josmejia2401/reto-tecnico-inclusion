package com.josmejia2401.requiredremainder.configuration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DummyController {
    @GetMapping("/api/test")
    public String test() {
        return "ok";
    }
}
