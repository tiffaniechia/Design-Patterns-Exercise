public class Drink {
    private final String name;
    private final double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

    public double getPrice(){
        return price;
    }
}
