package task3;

import java.util.Arrays;
import java.util.List;

public class Order {
    private List<FoodItem> itemList;
    private double[] sum;

    public Order(List<FoodItem> itemList) {
        this.itemList = itemList;
    }

    public double getTotalCost() {
        if (sum == null) {
            sum  = new double[1];
            itemList.forEach((item) -> {
                sum[0] += item.getPrice();
            });
        }
        return sum[0];
    }

    public List<FoodItem> getItemList() {
        return itemList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "itemList=" + itemList +
                ", sum=" + Arrays.toString(sum) +
                '}';
    }
}
