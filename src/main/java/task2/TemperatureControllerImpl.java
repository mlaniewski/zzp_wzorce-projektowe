package task2;

public class TemperatureControllerImpl implements TemperatureController {
    private int temperature;


    public void turnOn() {
        System.out.println("Włączono ogrzewanie");
    }

    public void turnOff() {
        System.out.println("Wyłączono ogrzewanie");
    }

    public void setConstantTemp(int temp) {
        temperature = temp;
        System.out.println(String.format("Ustawiono temperature na %s ℃", temp));
    }
}
