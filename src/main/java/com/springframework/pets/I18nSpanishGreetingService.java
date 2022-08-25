package com.springframework.pets;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Holla Spain";
    }
}
