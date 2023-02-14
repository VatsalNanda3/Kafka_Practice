package nanda.vatsal.kafka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages= {"nanda.vatsal.hello","nanda.vatsal.hello","kafka","nanda.vatsal.config","nanda.vatsal.controller","nanda.vatsal.payload"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
