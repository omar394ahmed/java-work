package backend.microservice.application.moviesrates.models;


import java.util.List;

public class User_ratings {

    private String  User_id ;
    private List<movie_rating> rates ;

    public User_ratings(String user_id, List<movie_rating> rates) {
        User_id = user_id;
        this.rates = rates;
    }

    public User_ratings() {
    }

    public String getUser_id() {
        return User_id;
    }

    public void setUser_id(String user_id) {
        User_id = user_id;
    }

    public List<movie_rating> getRates() {
        return rates;
    }

    public void setRates(List<movie_rating> rates) {
        this.rates = rates;
    }
}
