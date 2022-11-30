package com.cinematicketsys.purchaseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@ComponentScan(basePackages = {"com.cinematicketsys.purchaseapi"})
public class PurchaseapiApplication {

	private static ApplicationContext applicationContext;


	public static void main(String[] args) {
		SpringApplication.run(PurchaseapiApplication.class, args);
		//checkBeansPresence("Movie", "Account", "Ticket", "Venue", "ExampleBean");
	}

//	private static void checkBeansPresence(String... beans) {
//		for (String beanName : beans) {
//			System.out.println("Is " + beanName + " in ApplicationContext: " +
//					applicationContext.containsBean(beanName));
//		}
//	}

}
