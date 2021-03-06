package co.com.sofka.demo.domain;

import org.springframework.data.annotation.Id;


public class Driver {

    @Id
    private String id;

    private String name;

    public Driver(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Driver() {
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
