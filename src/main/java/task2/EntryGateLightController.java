package task2;

public class EntryGateLightController implements LightController {
    private LightController lightController;

    public EntryGateLightController(LightController lightController) {
        this.lightController = lightController;
    }

    public void turnOn() {
        System.out.println("Brama wjazdowa");
        lightController.turnOn();
    }

    public void turnOff() {
        System.out.println("Brama wjazdowa");
        lightController.turnOff();
    }
}
