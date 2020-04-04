package task3;

import task3.command.OrderCommand;
import task3.observer.Observer;
import task3.observer.Subject;
import task3.strategy.PriceStrategy;

import java.util.ArrayList;
import java.util.List;

public class Kiosk implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private PriceStrategy strategy;

    public void sendOrder(OrderCommand orderCommand) {
        strategy.sale(orderCommand.getOrder());
        orderCommand.execute();
    }


    public void setStrategy(PriceStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }


    @Override
    public void notifyObservers(OrderCommand orderCommand) {
        observers.forEach((o) -> {
            o.update(orderCommand.getOrder());
        });
    }
}
