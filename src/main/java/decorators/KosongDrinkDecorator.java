package decorators;

import drinks.Drink;

public class KosongDrinkDecorator extends Drink {
    public KosongDrinkDecorator(Drink drink) {
        super(drink.toString() + " kosong", drink.getPrice() + - 0.2);
    }
}
