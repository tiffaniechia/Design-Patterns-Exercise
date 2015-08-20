import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DrinkMakerTest {
    DrinkMaker drinkMaker;

    @Before
    public void setUp() {
    }

    @Test
    public void testKopiDrink() {
        drinkMaker = new DrinkMaker("kopi");
        assertTrue(drinkMaker.make() instanceof KopiDrink);
    }

    @Test
    public void testMiloDrink() {
        drinkMaker = new DrinkMaker("milo");
        assertTrue(drinkMaker.make() instanceof MiloDrink);
    }

    @Test
    public void testKopiCDrink() {
        this.drinkMaker = new DrinkMaker("kopi");
        assertEquals(drinkMaker.withC().make().toString(), "Kopi C");
    }

    @Test
    public void testKopiCDrinkPrice() {
        this.drinkMaker = new DrinkMaker("kopi");
        assertThat(drinkMaker.withC().make().getPrice(), is(0.9));
    }

    @Test
    public void testKopiCKosongDrink() {
        this.drinkMaker = new DrinkMaker("kopi");
        assertEquals(drinkMaker.withC().withKosong().make().toString(), "Kopi C Kosong");
    }

    @Test
    public void testKopiCKosongDrinkPrice() {
        this.drinkMaker = new DrinkMaker("kopi");
        assertThat(drinkMaker.withC().withKosong().make().getPrice(), is(0.7));
    }

    @Test
    public void testKopiPengDrink() {
        this.drinkMaker = new DrinkMaker("kopi");
        assertEquals(drinkMaker.withPeng().make().toString(), "Kopi peng");
    }

    @Test
    public void testKopiPengPrice() {
        this.drinkMaker = new DrinkMaker("kopi");
        assertThat(drinkMaker.withPeng().make().getPrice(), is(1.25));
    }

    @Test
    public void testKopiGaoDrink() {
        this.drinkMaker = new DrinkMaker("kopi");
        assertEquals(drinkMaker.withGao().make().toString(), "Kopi gao");
    }

    @Test
    public void testKopiGaoPrice() {
        this.drinkMaker = new DrinkMaker("kopi");
        assertThat(drinkMaker.withGao().make().getPrice(), is(1.15));
    }

}
