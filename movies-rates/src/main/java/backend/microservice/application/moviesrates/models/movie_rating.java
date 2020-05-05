package backend.microservice.application.moviesrates.models;

public class movie_rating {

    private String  movie_id ;
    private String  movie_rate ;

    public movie_rating() {
    }

    public movie_rating(String movie_id, String movie_rate) {
        this.movie_id = movie_id;
        this.movie_rate = movie_rate;
    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_rate() {
        return movie_rate;
    }

    public void setMovie_rate(String movie_rate) {
        this.movie_rate = movie_rate;
    }
}
