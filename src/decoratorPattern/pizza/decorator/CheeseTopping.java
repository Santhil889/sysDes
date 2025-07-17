package decoratorPattern.pizza.decorator;

import decoratorPattern.pizza.BasePizza;

public class CheeseTopping extends ToppingDecorator{
    int cost = 50;
    public CheeseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return basePizza.cost() + cost;
    }
}
