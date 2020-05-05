package backend.microservice.application.moviesinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication(scanBasePackages = {"backend.microservice.application.moviesinfo.resources" ,"backend.microservice.application.moviesinfo"})
@EnableDiscoveryClient
public class MoviesInfoApplication {

    @Bean
	public  WebClient.Builder getwebclientInstance () {
    	return  WebClient.builder();
	}

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(MoviesInfoApplication.class, args);
	}

}
