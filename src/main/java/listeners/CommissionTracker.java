package listeners;

import drinks.Drink;
import strategies.CommissionStrategy;

public class CommissionTracker implements Observer {
    private  int drinkCount;
    private CommissionStrategy strategy;

    //decoupling commission from commissionTracker that way you can reuse it (not doing dependency injections then switching)
    public CommissionTracker(CommissionStrategy commissionStrategy) {
        this.strategy = commissionStrategy;
        this.drinkCount = 0;
    }

    @Override
    public void update( Drink drink) {
        totalCommission(drink);
        drinkCount++;
    }

    public double totalCommission(Drink drink) {
       return  strategy.calculateCommission(drinkCount, drink);
    }
}
