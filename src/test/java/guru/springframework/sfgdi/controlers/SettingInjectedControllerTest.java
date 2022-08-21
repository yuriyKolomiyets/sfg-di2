package guru.springframework.sfgdi.controlers;

import guru.springframework.sfgdi.services.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SettingInjectedControllerTest {

    SettingInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SettingInjectedController();
        controller.setGreetingService(new GreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}