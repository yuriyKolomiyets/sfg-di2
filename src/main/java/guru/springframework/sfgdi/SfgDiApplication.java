package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controlers.ConstructorInjectedController;
import guru.springframework.sfgdi.controlers.MyController;
import guru.springframework.sfgdi.controlers.PropertyInjectedController;
import guru.springframework.sfgdi.controlers.SettingInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("------ Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");
		SettingInjectedController settingInjectedController = (SettingInjectedController) ctx
				.getBean("settingInjectedController");
		System.out.println(settingInjectedController.getGreeting());

		System.out.println("------ Constractor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
