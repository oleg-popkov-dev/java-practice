package Enum;

public class PickupType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName(){
        return VehicleTypeEnum.PICKUP.name();
    }
}