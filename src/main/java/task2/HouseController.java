package task2;

public class HouseController {
    private DoorController doorController = new DoorControllerImpl();
    private LightController lightController = new LightControllerImpl();
    private TemperatureController temperatureController = new TemperatureControllerImpl();


    public void enter() {
        System.out.println("Wejście do domu");
        doorController.unlock();
        doorController.open();
        lightController.turnOn();
        doorController.close();
        doorController.lock();
        temperatureController.turnOn();
        temperatureController.setConstantTemp(22);
        System.out.println();
    }

    public void leave() {
        System.out.println("Wyjście z domu");
        doorController.unlock();
        doorController.open();
        lightController.turnOff();
        temperatureController.turnOff();
        doorController.close();
        doorController.lock();
        System.out.println();
    }
}
