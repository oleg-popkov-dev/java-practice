package Enum;

public class VehicleAd {

    private String model;
    private String id;
    private VehicleTypeByBodyTypes vehicleTypeByBodyTypes;
    private VehicleTypeByFuelTypes vehicleTypeByFuelTypes;
    private VehicleTypeByPurpose vehicleTypeByPurpose;

    public VehicleAd(String model, String id, VehicleTypeByBodyTypes vehicleTypeByBodyTypes,
                     VehicleTypeByFuelTypes vehicleTypeByFuelTypes, VehicleTypeByPurpose vehicleTypeByPurpose){
        this.model = model;
        this.id = id;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
        this.vehicleTypeByFuelTypes = vehicleTypeByFuelTypes;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
    }
    public VehicleAd(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public VehicleTypeByBodyTypes getVehicleTypeByBodyTypes() {
        return vehicleTypeByBodyTypes;
    }

    public VehicleTypeByFuelTypes getVehicleTypeByFuelTypes() {
        return vehicleTypeByFuelTypes;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;
    }

    public String toString(){
        return model;
    }
}