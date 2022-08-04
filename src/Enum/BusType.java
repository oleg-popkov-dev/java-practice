package Enum;

public class BusType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName(){
        return VehicleTypeEnum.ELECTRIC.name();
    }
}