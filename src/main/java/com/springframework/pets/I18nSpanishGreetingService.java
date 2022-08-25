package com.springframework.pets;

import guru.springframework.sfgdi.services.IGreetingService;

//@Profile({"ES", "default"})
//@Service("i18nService")
public class I18nSpanishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Holla Spain";
    }
}
