public class CDrinkDecorator extends Drink {
    public CDrinkDecorator(Drink drink) {
        super(drink.toString() + " C", drink.getPrice() -.10);
    }
}
