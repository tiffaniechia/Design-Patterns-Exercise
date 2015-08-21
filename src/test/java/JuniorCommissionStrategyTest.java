import drinks.Drink;
import org.junit.Test;
import strategies.JuniorCommissionStrategy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class JuniorCommissionStrategyTest {

    @Test
    public void testCalculateCommission() throws Exception {
        Drink drink = new Drink("kopi", 0.1);
        JuniorCommissionStrategy juniorCommissionStrategy = new JuniorCommissionStrategy();
        assertThat(juniorCommissionStrategy.calculateCommission(1, drink), is(0.15));
    }
}