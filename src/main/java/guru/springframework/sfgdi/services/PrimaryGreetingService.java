package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class PrimaryGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - From Primary Bean";
    }
}
