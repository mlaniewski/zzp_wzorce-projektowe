package task3.strategy;

import task3.FoodItem;
import task3.FoodType;
import task3.Order;

public class OrderOver30 implements PriceStrategy {

    @Override
    public void sale(Order order) {

        if (order.getTotalCost() > 30d) {
            for (FoodItem item : order.getItemList()) {
                if (item.getType() == FoodType.SODA) {
                    item.setPrice(0.01);
                }
            }
        }

    }
}
