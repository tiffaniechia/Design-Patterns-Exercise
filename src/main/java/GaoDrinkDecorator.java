public class GaoDrinkDecorator extends Drink {
    public GaoDrinkDecorator(Drink drink) {
        super(drink.toString() + " gao", drink.getPrice() + 0.15);
    }
}
