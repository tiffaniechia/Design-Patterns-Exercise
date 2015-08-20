import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class KopiDrinkTest {
    KopiDrink kopiDrink;
    @Before
    public void setUp() {
     kopiDrink = new KopiDrink();
    }

    @Test
    public void testShouldGetKopiName() throws Exception {
        assertEquals("kopi", kopiDrink.toString());
    }

    @Test
    public void testShouldGetKopiPrice() throws Exception {
        assertThat(kopiDrink.getPrice(), is(1.0));
    }


}