package guru.springframework.sfgdi.controlers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello!");
        return "Hi";
    }
}
