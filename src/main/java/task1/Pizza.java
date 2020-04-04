package task1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private Size size;
    private List<Extra> extras;
    private PizzaBase pizzaBase;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.extras = builder.extras;
        this.pizzaBase = builder.pizzaBase;
    }

    private enum Size {
        SMALL, MEDIUM, LARGE
    }

    private enum Extra {
        HAM, MUSHROOMS, ONION, PEPPER, SAUSAGE, CHEESE
    }



    public static class Builder {
        private final Size size;
        private final List<Extra> extras;
        private final PizzaBase pizzaBase;

        public Builder(Size size, PizzaBase pizzaBase) {
            this.size = size;
            this.pizzaBase = pizzaBase;
            this.extras = new ArrayList<Extra>();
        }

        public Builder extra(Extra extra) {
            this.extras.add(extra);
            return this;
        }

        public Builder saucePosition(SaucePosition saucePosition) {
            this.pizzaBase.setSaucePosition(saucePosition);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", extras=" + extras +
                ", pizzaBase=" + pizzaBase +
                '}';
    }

    public static void main(String[] args) {
        Pizza pizza = new Builder(Size.SMALL, new PizzaBase(Sauce.CREAM_SAUCE))
                .extra(Extra.HAM)
                .extra(Extra.CHEESE)
                .extra(Extra.MUSHROOMS)
                .saucePosition(SaucePosition.INSIDE)
                .build();

        System.out.println(pizza);
    }
}
