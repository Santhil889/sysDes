package decoratorPattern;

import decoratorPattern.pizza.BasePizza;
import decoratorPattern.pizza.basicPizza.FarmHouse;
import decoratorPattern.pizza.basicPizza.Margherita;
import decoratorPattern.pizza.basicPizza.VegDelight;
import decoratorPattern.pizza.decorator.CheeseTopping;
import decoratorPattern.pizza.decorator.MushroomTopping;

import java.util.Scanner;

public class DecoratorPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int exit = 0;

        BasePizza basePizza = null;
        System.out.println("Welcome to the Decorator Pizza!");
        System.out.println("Please Select your base pizza : ");
        System.out.println("1. Margherita");
        System.out.println("2. Farm House");
        System.out.println("2. Veg Delight");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                basePizza = new Margherita();
                break;
            case "2":
                basePizza = new FarmHouse();
                break;
            case "3":
                basePizza = new VegDelight();
                break;
            default:
                System.out.println("Invalid input");
                exit =1;
        }
        while (exit == 0) {
            System.out.println("Welcome to the Pizza Toppings!");
            System.out.println("Please Select your toppings : ");
            System.out.println("1. CheeseTopping");
            System.out.println("2. MushroomTopping");
            System.out.println("3. That's It!!!");
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    basePizza = new CheeseTopping(basePizza);
                    break;
                case "2":
                    basePizza = new MushroomTopping(basePizza);
                    break;
                default:
                    System.out.println("Thanks for using our Pizza!");
                    exit = 1;
            }
        }
        assert basePizza != null;
        System.out.println(basePizza.cost());
    }
}
