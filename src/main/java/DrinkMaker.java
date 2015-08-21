import decorators.CDrinkDecorator;
import decorators.GaoDrinkDecorator;
import decorators.KosongDrinkDecorator;
import decorators.PengDrinkDecorator;
import drinks.Drink;
import drinks.KopiDrink;
import drinks.MiloDrink;
import drinks.TehDrink;

import java.util.*;

public class DrinkMaker {

    private ArrayList<listeners.Observer> observers = new ArrayList<listeners.Observer>();
    private Drink drink;

    public DrinkMaker(String drink){
        this.drink = getDrink(drink);
    }

    private Drink getDrink(String drink) {
        switch(drink){
            case "kopi": return new KopiDrink();
            case "teh": return new TehDrink();
            case "milo": return new MiloDrink();
        }
        throw new IllegalArgumentException();
    }

    public DrinkMaker withC() {
        drink = new CDrinkDecorator(drink);
        return this;
    }

    public DrinkMaker withKosong() {
        drink = new KosongDrinkDecorator(drink);
        return this;
    }

    public DrinkMaker withGao() {
        drink = new GaoDrinkDecorator(drink);
        return this;
    }

    public DrinkMaker withPeng() {
        drink = new PengDrinkDecorator(drink);
        return this;
    }

    public Drink make() {
        notifyObservers(this.drink);
        return drink;
    }

    private void notifyObservers(Drink drink) {
        for (listeners.Observer observer: observers) {
            observer.update(drink);
        }
    }

    public void registerObserver(listeners.Observer observer) {
        observers.add(observer);
    }

}
