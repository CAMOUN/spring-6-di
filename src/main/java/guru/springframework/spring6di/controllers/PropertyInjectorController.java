package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

public class PropertyInjectorController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
