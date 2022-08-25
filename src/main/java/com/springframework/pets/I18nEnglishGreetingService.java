package com.springframework.pets;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.services.IGreetingService;

//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements IGreetingService {

    private final EnglishGreetingRepository greetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello English";
    }
}
