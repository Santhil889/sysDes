package decoratorPattern.pizza.decorator;

import decoratorPattern.pizza.BasePizza;

public class MushroomTopping extends ToppingDecorator {
    BasePizza basePizza;
    int cost = 25;

    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + cost;
    }
}
