package decorators;

import drinks.Drink;

public class PengDrinkDecorator extends Drink {
    public PengDrinkDecorator(Drink drink) {
        super(drink.toString() + " peng", drink.getPrice() + 0.25);
    }
}
