import drinks.TehDrink;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class TehDrinkTest {
    TehDrink tehDrink;
    @Before
    public void setUp() {
        tehDrink = new TehDrink();
    }

    @Test
    public void testShouldGetTehName() throws Exception {
        assertEquals("teh", tehDrink.toString());
    }

    @Test
    public void testShouldGetTehPrice() throws Exception {
        assertThat(tehDrink.getPrice(), is(1.5));
    }


}