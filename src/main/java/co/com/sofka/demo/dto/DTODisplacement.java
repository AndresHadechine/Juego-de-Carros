package co.com.sofka.demo.dto;

import co.com.sofka.demo.domain.Displacement;

public class DTODisplacement extends Displacement {
    public DTODisplacement(String carPlate, String origin, String destiny, String dateOrigin, String dateDestiny) {
        super(carPlate, origin, destiny, dateOrigin, dateDestiny);
    }
}
