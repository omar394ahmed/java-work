package backend.microservice.application.moviesrates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication(scanBasePackages = "backend.microservice.application.moviesrates.resources")
@EnableDiscoveryClient
public class MoviesCatalogApplication {

    @Bean
    @LoadBalanced
    public WebClient.Builder getwebclient(){
        return  WebClient.builder();
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MoviesCatalogApplication.class, args);
    }


}
