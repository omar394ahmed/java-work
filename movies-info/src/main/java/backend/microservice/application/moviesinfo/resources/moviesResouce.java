package backend.microservice.application.moviesinfo.resources;

import backend.microservice.application.moviesinfo.models.MovieBasic;
import backend.microservice.application.moviesinfo.models.movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class moviesResouce {

    @Value("${api.key}")
    private String  apiKey;

    @Qualifier("getwebclientInstance")
    @Autowired
    WebClient.Builder webclientBuilder ;

    @Autowired
    RestTemplate template ;

    @RequestMapping("/{movieId}")
     public movie getMovieInfo(@PathVariable("movieId") String movieID){
       /*
       MovieBasic moviedetails = webclientBuilder.build()
                               .get()
                               .uri("https://api.themoviedb.org/3/movie/" + movieID + "?api_key=" +  apiKey)
                               .retrieve()
                .bodyToMono(MovieBasic.class)
               .block();


         */
       MovieBasic moviedetails = template.getForObject("https://api.themoviedb.org/3/movie/" + movieID + "?api_key=" +  apiKey, MovieBasic.class);

        return  new movie(movieID , moviedetails.getTitle() , moviedetails.getOverview());


     }
}
