package com.springframework.pets;

import guru.springframework.sfgdi.services.IGreetingService;

//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello English";
    }
}
