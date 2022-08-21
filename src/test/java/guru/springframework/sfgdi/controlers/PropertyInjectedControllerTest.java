package guru.springframework.sfgdi.controlers;

import guru.springframework.sfgdi.services.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }


}