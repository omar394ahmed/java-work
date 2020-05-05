package backend.microservice.application.moviesrates.resources;

import backend.microservice.application.moviesrates.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class movieCatalogResouce {

    @Qualifier("getwebclient")
    @Autowired
     WebClient.Builder webclientBuilder;
   @Autowired
    RestTemplate template ;


    @RequestMapping("/{userId}")
    public user_movie getCatalog(@PathVariable("userId") String userID){

               User_ratings  user_ratings_opj =
                       template.getForObject("http://movies-rates-service/ratings/users/" + userID , User_ratings.class );
                 /*
                 webclientBuilder.build()
                .get()
                .uri("http://movies-rates-service/ratings/users/" + userID)
                .retrieve()
                .bodyToMono(User_ratings.class)
                .block(); // will return movie ; */
        List<moviesCatalogItem> catalogItems =  user_ratings_opj.getRates().stream().map(rating -> {
                movie movie =  template.getForObject( "http://movies-info-service/movies/" +  rating.getMovie_id(), movie.class);
                        /*
                        webclientBuilder.build()
                    .get()
                    .uri("http://movies-info-service/movies/" +  rating.getMovie_id())
                    .retrieve()
                    .bodyToMono(movie.class)
                    .block();

                         */
              return new moviesCatalogItem(movie.getId() ,  movie.getName() , movie.getOverview() , rating.getMovie_rate()) ; // return of lambda expression
         }).collect(Collectors.toList());
        return  new user_movie(userID , catalogItems);
    }
}
