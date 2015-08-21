package listeners;

import drinks.Drink;

public class CommissionTracker implements Observer {
    private double totalCommission;
    private final double commission;

    public CommissionTracker() {
        this.commission = 0.1;
        this.totalCommission = 0;
    }

    @Override
    public void update(Drink drink) {
        this.totalCommission += this.commission * drink.getPrice();
    }

    public double totalCommission() {
        return totalCommission;
    }
}
