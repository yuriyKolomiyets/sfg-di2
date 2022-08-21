package guru.springframework.sfgdi.controlers;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
      return greetingService.sayGreeting();
    }




}

