package task3.strategy;

import task3.FoodItem;
import task3.FoodType;
import task3.Order;

import java.util.HashMap;
import java.util.Map;

public class TwoSameItemsStrategy implements PriceStrategy {

    @Override
    public void sale(Order order) {
        Map<FoodType, Integer> typeCounter = new HashMap<>();
        for (FoodType type : FoodType.values()) {
            for (FoodItem item : order.getItemList()) {
                if (item.getType() == type) {
                    if (typeCounter.get(type) == null) {
                        typeCounter.put(type, 1);
                    } else {
                        typeCounter.put(type, typeCounter.get(type) + 1);
                    }
                }
            }
        }

        typeCounter.forEach((type, counter) -> {
            if (counter > 1) {
                FoodItem lowestPriceItem = null;
                for (FoodItem item : order.getItemList()) {
                    if (lowestPriceItem == null && item.getType() == type) {
                        lowestPriceItem = item;
                    }
                    else if (item.getType() == type && item.getPrice() < lowestPriceItem.getPrice()) {
                        lowestPriceItem = item;
                    }
                }
                lowestPriceItem.setPrice(lowestPriceItem.getPrice()*0.9);
            }
        });

    }
}
