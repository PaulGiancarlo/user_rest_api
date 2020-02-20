package create.user.rest.pdiaz.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import create.user.rest.pdiaz.model.User;


@RestController("/")
public class UserRestController {

    @GetMapping
    public String registeredUser() {
        return "Hello Gradle!";
    }
    @PostMapping(value="/userreg/")
    public User postMethodName(@Valid @RequestBody User entity) {
        
        
        return entity;
    }
    

}