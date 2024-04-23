package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectorControllerTest {

    @Autowired
    PropertyInjectorController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new PropertyInjectorController();
//        controller.greetingService = new GreetingServiceImpl();
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}