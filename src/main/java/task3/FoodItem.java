package task3;

public class FoodItem {
    private FoodType type;
    private double price;
    private String name;

    public FoodItem(FoodType type, double price, String name) {
        this.type = type;
        this.price = price;
        this.name = name;
    }


    public FoodType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


    public void setPrice(double price) {
        this.price = price;
    };

    @Override
    public String toString() {
        return "FoodItem{" +
                "type=" + type +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
