package task3.command;

import task3.Order;

public class OrderCommand implements Command {
    private Order order;

    public OrderCommand(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public void execute() {
        System.out.println("Obsługa zamównienia");
        order.getItemList().forEach((o) -> System.out.println("Obsłużono " + o));
    }
}
