package com.springframework.pets;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello English";
    }
}
