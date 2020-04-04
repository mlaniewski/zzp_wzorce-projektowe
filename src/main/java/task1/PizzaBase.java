package task1;

public class PizzaBase {
    private Sauce sauce;
    private SaucePosition saucePosition;

    public PizzaBase(Sauce sauce) {
        this.sauce = sauce;
    }


    public void setSaucePosition(SaucePosition saucePosition) {
        this.saucePosition = saucePosition;
    }

    @Override
    public String toString() {
        return "PizzaBase{" +
                "sauce=" + sauce +
                ", saucePosition=" + saucePosition +
                '}';
    }
}
