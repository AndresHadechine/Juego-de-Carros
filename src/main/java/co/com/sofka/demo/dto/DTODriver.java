package co.com.sofka.demo.dto;

import co.com.sofka.demo.domain.Driver;

public class DTODriver extends Driver {
    public DTODriver(String id, String name) {
        super(id, name);
    }
    public Driver convertInDriver(){
        Driver driver = new Driver();
        driver.setId(this.getId());
        driver.setName(this.getName());
        return driver;
    }
    public void convertInDTO(Driver driver){
        setId(driver.getId());
        setName(driver.getName());
    }
}
