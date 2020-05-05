package backend.microservice.application.moviesrates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "backend.microservice.application.moviesrates.resources")
@EnableDiscoveryClient
public class MoviesRatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesRatesApplication.class, args);
	}

}
