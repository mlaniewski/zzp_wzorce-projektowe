package task3;

import task3.observer.Observer;

public class Kitchen implements Observer {

    @Override
    public void update(Order order) {
        System.out.println(order);
    }

}
