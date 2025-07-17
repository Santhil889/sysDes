package decoratorPattern.pizza.decorator;

import decoratorPattern.pizza.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    BasePizza basePizza;
    ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
