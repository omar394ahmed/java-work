package backend.microservice.application.moviesrates.models;

public class movie {

    private  String id ;
    private String name ;
    private String overview ;

    public movie() {
    }



    public movie(String id, String name, String overview) {
        this.id = id;
        this.name = name;
 this.overview = overview;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }





    public movie(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
