package guru.springframework.sfgdi.controlers;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final IGreetingService iGreetingService;

    public I18nController(@Qualifier("i18nService") IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello(){
        return iGreetingService.sayGreeting();
    }
}
