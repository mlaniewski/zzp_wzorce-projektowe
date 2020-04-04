package task3.observer;

import task3.command.OrderCommand;

public interface Subject {
    void register(Observer o);
    void notifyObservers(OrderCommand orderCommand);
}
