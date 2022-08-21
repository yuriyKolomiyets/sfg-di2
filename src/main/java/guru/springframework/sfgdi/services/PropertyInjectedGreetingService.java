package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - Property";
    }
}
