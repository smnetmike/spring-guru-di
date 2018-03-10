package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctxt = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) ctxt.getBean("myController");

		myController.hello();

		System.out.println(ctxt.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctxt.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctxt.getBean(SetterInjectedController.class).sayHello());

	}
}
