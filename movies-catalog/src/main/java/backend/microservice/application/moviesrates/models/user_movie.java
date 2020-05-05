package backend.microservice.application.moviesrates.models;

import java.util.List;

public class user_movie {

    private  String user_id ;
    private List<moviesCatalogItem>  movies;

    public user_movie(String user_id, List<moviesCatalogItem> movies) {
        this.user_id = user_id;
        this.movies = movies;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public List<moviesCatalogItem> getMovies() {
        return movies;
    }

    public void setMovies(List<moviesCatalogItem> movies) {
        this.movies = movies;
    }
}
