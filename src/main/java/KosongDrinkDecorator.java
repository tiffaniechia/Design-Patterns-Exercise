public class KosongDrinkDecorator extends Drink {
    public KosongDrinkDecorator(Drink drink) {
        super(drink.toString() + " Kosong", drink.getPrice() + - 0.2);
    }
}
