package guru.springframework.sfgdi.services;

public class GreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world";
    }
}
