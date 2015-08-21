package strategies;

import drinks.Drink;

public class JuniorCommissionStrategy implements CommissionStrategy{
    private final double commission;

    public JuniorCommissionStrategy() {
        this.commission = 0.15;
    }

    @Override
    public double calculateCommission(int drinkCount, Drink drink) {
        return drinkCount * this.commission;
    }

}
