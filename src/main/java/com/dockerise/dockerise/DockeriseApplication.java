package com.dockerise.dockerise;

import java.util.Arrays;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.dockerise.dockerise.model.personBean;



@SpringBootApplication
@Component
@Configuration
public class DockeriseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DockeriseApplication.class, args);
		System.out.println("List of Beans main..");
	}

	@Bean
	public personBean personBean() {
        return new personBean();
    }
	@Autowired
    private ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("List of Beans..");
	    String[] beanNames = context.getBeanNamesForType(Object.class);
	    Arrays.sort(beanNames);
	    for (String beanName : beanNames) {
	        System.out.println("Bean -->" + beanName);
	    }
	}
	
}
