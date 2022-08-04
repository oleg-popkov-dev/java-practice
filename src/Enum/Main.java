package Enum;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new SedanType(), new PetrolType(), new PassengerType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new PickupType(),new DieselType(), new TruckType());
        VehicleAd toyotaAd = new VehicleAd("Toyota", "100", new SedanType(), new PetrolType(), new CarType());
        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, toyotaAd});
        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        adsService.filterByVehicleTypeByPurpose(new TruckType());
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}