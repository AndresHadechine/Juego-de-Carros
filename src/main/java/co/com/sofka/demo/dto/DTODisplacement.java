package co.com.sofka.demo.dto;

import co.com.sofka.demo.domain.Displacement;


public class DTODisplacement extends Displacement {
    public DTODisplacement(String carPlate, String origin, String destiny, String dateOrigin, String dateDestiny) {
        super(carPlate, origin, destiny, dateOrigin, dateDestiny);
    }
    public Displacement convertInDisplacement(){
        Displacement displacement = new Displacement();
        displacement.setCarPlate(this.getCarPlate());
        displacement.setOrigin(this.getOrigin());
        displacement.setDateOrigin(this.getDateOrigin());
        displacement.setDateDestiny(this.getDateDestiny());
        return displacement;
    }

    public void convertInDTO(Displacement displacement){
        setCarPlate(displacement.getCarPlate());
        setOrigin(displacement.getOrigin());
        setDestiny(displacement.getDestiny());
        setDateOrigin(displacement.getDateOrigin());
        setDateDestiny(displacement.getDateDestiny());
    }
}
