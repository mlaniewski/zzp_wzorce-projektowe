package task3;

import task3.command.OrderCommand;
import task3.strategy.TwoSameItemsStrategy;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        FoodItem hamburger = new FoodItem(FoodType.HAMBURGER, 10, "hamburger");
        FoodItem cheesburger = new FoodItem(FoodType.HAMBURGER, 13, "cheeseburger");
        FoodItem colaCola = new FoodItem(FoodType.SODA, 3, "coca cola");
        FoodItem margarita = new FoodItem(FoodType.PIZZA, 25, "margarita");
        FoodItem fries = new FoodItem(FoodType.FRIES, 5, "fries");

        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(hamburger);
        foodItems.add(cheesburger);
        foodItems.add(margarita);
        foodItems.add(fries);
        foodItems.add(colaCola);
        Order order = new Order(foodItems);

        OrderCommand orderCommand = new OrderCommand(order);

        Kiosk kiosk = new Kiosk();
        kiosk.setStrategy(new TwoSameItemsStrategy());

        kiosk.sendOrder(orderCommand);

        Kitchen kitchen = new Kitchen();
        kiosk.register(kitchen);

        kiosk.notifyObservers(orderCommand);
    }
}
