import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class MiloDrinkTest {
    MiloDrink miloDrink;
    @Before
    public void setUp() {
        miloDrink = new MiloDrink();
    }

    @Test
    public void testShouldGetMiloName() throws Exception {
        assertEquals("milo", miloDrink.toString());
    }

    @Test
    public void testShouldGetMiloPrice() throws Exception {
        assertThat(miloDrink.getPrice(), is(2.0));
    }


}