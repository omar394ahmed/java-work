package backend.microservice.application.moviesrates.models;


public class moviesCatalogItem {

    private  String id  ;
    private String name ;
    private String desc ;
    private String rate ;

    public moviesCatalogItem(String id, String name, String desc, String rate) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.rate = rate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public moviesCatalogItem(String name, String desc, String rate) {
        this.name = name;
        this.desc = desc;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
