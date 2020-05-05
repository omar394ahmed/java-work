package backend.microservice.application.moviesrates.resources;



import backend.microservice.application.moviesrates.models.User_ratings;
import backend.microservice.application.moviesrates.models.movie_rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/ratings")
public class movies_resource {

    HashMap<String, List<movie_rating>> user_Movies = new HashMap<String, List<movie_rating>>();


    @RequestMapping("/users/{userId}")
    public User_ratings get_movie_rating(@PathVariable("userId") String userID) {
        List<movie_rating> movies = new ArrayList<>();
        movies.add(new movie_rating("100", "8.1"));
        movies.add(new movie_rating("200", "7.5"));
        movies.add(new movie_rating("300", "7.5"));
        user_Movies.put("12", movies);

        if (user_Movies.containsKey(userID)) {
            return new User_ratings(userID , movies ) ;

        } else return null;


    }

}