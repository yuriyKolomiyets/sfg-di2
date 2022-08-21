package guru.springframework.sfgdi.controlers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class ConstructorInjectedController {

    private final IGreetingService iGreetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService")IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String getGreeting(){
        return iGreetingService.sayGreeting();
    }
}
