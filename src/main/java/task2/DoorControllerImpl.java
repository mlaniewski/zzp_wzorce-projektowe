package task2;

public class DoorControllerImpl implements DoorController {
    public void open() {
        System.out.println("Otwarto drzwi");
    }

    public void close() {
        System.out.println("Zamknięto drzwi");
    }

    public void lock() {
        System.out.println("Zablokowano drzwi");
    }

    public void unlock() {
        System.out.println("Odblokowano drzwi");
    }
}
