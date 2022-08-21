package guru.springframework.sfgdi.controlers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SettingInjectedController {
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    private IGreetingService iGreetingService;

    public IGreetingService getiGreetingService() {
        return iGreetingService;
    }

    public String getGreeting(){
        return iGreetingService.sayGreeting();
    }
}
