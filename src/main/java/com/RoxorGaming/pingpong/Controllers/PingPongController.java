package com.RoxorGaming.pingpong.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller class
@RestController
public class PingPongController {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String printPong(){
        return "pong";
    }
}
