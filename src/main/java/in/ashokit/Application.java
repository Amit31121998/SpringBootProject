package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		int i=10;
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println(context.getClass().getName());
		System.out.println("beans load:"+context.getBeanDefinitionCount());
		
	}

}
