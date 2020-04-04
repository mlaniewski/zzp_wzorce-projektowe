package task2;

public class GardenLightController implements LightController {
    private LightController lightController;

    public GardenLightController(LightController lightController) {
        this.lightController = lightController;
    }

    public void turnOn() {
        System.out.println("Ogród");
        lightController.turnOn();
    }

    public void turnOff() {
        System.out.println("Ogród");
        lightController.turnOff();
    }

    public void dimLight() {
        System.out.println("Zmniejszono moc do 50%");
        lightController.turnOn();
    }
}
