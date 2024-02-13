package org.example.demodatadogmetricswithdatadog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/test")
public class TestEndpoint {

    @GetMapping("/{error}")
    public String getDateAndTimeEndpoint(@PathVariable String error){
        if(error.equalsIgnoreCase("error")){
            throw new RuntimeException();
        }
        return Instant.now().toString();
    }
}
