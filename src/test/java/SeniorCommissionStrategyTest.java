import drinks.Drink;
import org.junit.Test;
import strategies.SeniorCommissionStrategy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class SeniorCommissionStrategyTest {
    @Test
    public void testShouldHaveBaseOfPriceXCommission() throws Exception {
        Drink drink = new Drink("kopi", 0.1);
        SeniorCommissionStrategy seniorCommissionStrategy = new SeniorCommissionStrategy();
        assertThat(seniorCommissionStrategy.calculateCommission(1, drink), is(closeTo(0.01, 0.00005)));
    }

    @Test
    public void testShouldGet1DollarBonusOnTenthDrink() throws Exception {
        Drink drink = new Drink("kopi", 0.1);
        SeniorCommissionStrategy seniorCommissionStrategy = new SeniorCommissionStrategy();

        assertThat(seniorCommissionStrategy.calculateCommission(10, drink), is(1.1));

    }
}