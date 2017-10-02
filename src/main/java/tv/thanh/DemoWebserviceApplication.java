package tv.thanh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"tv.thanh"})
public class DemoWebserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoWebserviceApplication.class, args);
	}

}
