package task2;

public class Task2 {

    public static void main(String[] args) {
        HouseController houseController = new HouseController();

        houseController.enter();
        houseController.leave();

        LightController lightController = new LightControllerImpl();
        EntryGateLightController entryGateLightController = new EntryGateLightController(lightController);
        entryGateLightController.turnOn();
        entryGateLightController.turnOff();

        CinemaHouseLightController cinemaHouseLightController = new CinemaHouseLightController(lightController);
        cinemaHouseLightController.turnOn();
        cinemaHouseLightController.turnOnDynamicLighting();
        cinemaHouseLightController.setColor("czerwony");
        cinemaHouseLightController.turnOffDynamicLighting();
        cinemaHouseLightController.turnOff();

        GardenLightController gardenLightController = new GardenLightController(lightController);
        gardenLightController.turnOn();
        gardenLightController.dimLight();
        gardenLightController.turnOff();
    }
}
