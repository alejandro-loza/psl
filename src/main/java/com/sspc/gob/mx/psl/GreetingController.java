package com.sspc.gob.mx.psl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greeting")
    String greeting(){
        return "holis";
    }

}
