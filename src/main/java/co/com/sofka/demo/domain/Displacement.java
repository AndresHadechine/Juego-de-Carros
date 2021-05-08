package co.com.sofka.demo.domain;

public class Displacement {

   private String carPlate;

    private String origin;
    private String destiny;
    private String dateOrigin;
    private String dateDestiny;

    public Displacement(String carPlate, String origin, String destiny, String dateOrigin, String dateDestiny) {
        this.carPlate = carPlate;
        this.origin = origin;
        this.destiny = destiny;
        this.dateOrigin = dateOrigin;
        this.dateDestiny = dateDestiny;
    }
    public Displacement() {
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getDateOrigin() {
        return dateOrigin;
    }

    public void setDateOrigin(String dateOrigin) {
        this.dateOrigin = dateOrigin;
    }

    public String getDateDestiny() {
        return dateDestiny;
    }

    public void setDateDestiny(String dateDestiny) {
        this.dateDestiny = dateDestiny;
    }
}
