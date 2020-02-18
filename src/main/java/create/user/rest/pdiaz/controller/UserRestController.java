package create.user.rest.pdiaz.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class UserRestController {

    @GetMapping
    public String helloGradle() {
        return "Hello Gradle!";
    }

}