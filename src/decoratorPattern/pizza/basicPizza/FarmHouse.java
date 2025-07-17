package decoratorPattern.pizza.basicPizza;

import decoratorPattern.pizza.BasePizza;

public class FarmHouse extends BasePizza {
    @Override
    public int cost() {
        return 150;
    }
}
