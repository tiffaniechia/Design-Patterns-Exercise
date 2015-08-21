package strategies;

import drinks.Drink;

public class SeniorCommissionStrategy implements CommissionStrategy {

    private double commission;

    public SeniorCommissionStrategy() {
        this.commission = 0.1;
    }

    @Override
    public double calculateCommission(int drinkCount, Drink drink) {
        double bonus = getBonus(drinkCount);
        return (drink.getPrice() * this.commission) * drinkCount + bonus;
    }

    public double getBonus(int drinkCount) {
        int bonus = 1;
        return Math.abs(drinkCount / 10) * bonus;

    }

}
