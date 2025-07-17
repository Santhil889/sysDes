package decoratorPattern.pizza.basicPizza;

import decoratorPattern.pizza.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 120;
    }
}
