package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

public class SetterInjectedGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - Setter";
    }
}
