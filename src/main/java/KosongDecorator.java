public class KosongDecorator extends Drink {
    public KosongDecorator(Drink drink) {
        super(drink.toString() + " Kosong", drink.getPrice() + - 0.2);
    }
}
