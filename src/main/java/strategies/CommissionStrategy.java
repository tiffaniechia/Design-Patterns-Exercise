package strategies;

import drinks.Drink;

public interface CommissionStrategy {

    double calculateCommission(int drinkCount, Drink drink);

}
