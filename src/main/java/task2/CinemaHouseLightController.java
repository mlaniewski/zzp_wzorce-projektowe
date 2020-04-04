package task2;

public class CinemaHouseLightController implements LightController {
    private LightController lightController;

    public CinemaHouseLightController(LightController lightController) {
        this.lightController = lightController;
    }

    public void turnOn() {
        System.out.println("Kino domowe");
        lightController.turnOn();
    }

    public void turnOff() {
        System.out.println("Kino domowe");
        lightController.turnOff();
    }

    public void setColor(String color) {
        System.out.println(String.format("Kolor został ustawiony na %s", color));
    }

    public void turnOnDynamicLighting() {
        System.out.println("Włączono dynamiczne oświetlenie");
    }

    public void turnOffDynamicLighting() {
        System.out.println("Włączono dynamiczne oświetlenie");
    }
}
