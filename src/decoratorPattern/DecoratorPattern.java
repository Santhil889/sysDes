package decoratorPattern;

import decoratorPattern.pizza.BasePizza;
import decoratorPattern.pizza.basicPizza.Margherita;
import decoratorPattern.pizza.decorator.CheeseTopping;

public class DecoratorPattern {
    public static void main(String[] args) {
        BasePizza basePizza = new CheeseTopping(new Margherita());
        System.out.println(basePizza.cost());
    }
}
