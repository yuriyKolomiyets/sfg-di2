package guru.springframework.sfgdi.controlers;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final IGreetingService iGreetingService;

    public MyController(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello(){
        return iGreetingService.sayGreeting();
    }
}
