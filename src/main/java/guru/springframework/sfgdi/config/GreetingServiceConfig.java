package guru.springframework.sfgdi.config;

import com.springframework.pets.I18nEnglishGreetingService;
import com.springframework.pets.I18nSpanishGreetingService;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
@Configuration
@ImportResource("classpath:sfmgdi-config.xml")
public class GreetingServiceConfig {
    @Bean
    /* I left it comment to show the ather way it coud be injected here

    FakeDataSource fakeDataSource(@Value("${guru.username}") String name,
                                  @Value("${guru.password}")String pass,
                                  @Value("${guru.jdbcurl}")String url){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(name);
        fakeDataSource.setJdbcurl(url);
        fakeDataSource.setPassword(pass);
        return fakeDataSource;
    }*/

    FakeDataSource fakeDataSource(SfgConfiguration sfgConfiguration){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfiguration.getUsername());
        fakeDataSource.setJdbcurl(sfgConfiguration.getJdbcurl());
        fakeDataSource.setPassword(sfgConfiguration.getPassword());
        return fakeDataSource;
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    };

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService  primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    /*@Bean added to xml file
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }*/

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }



}
