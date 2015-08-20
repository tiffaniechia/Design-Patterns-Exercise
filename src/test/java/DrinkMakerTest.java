import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DrinkMakerTest {
    DrinkMaker drinkMaker;

    @Before
    public void setUp(){
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
    public void testKopiKasongDrink() {
        this.drinkMaker = new DrinkMaker("kopi");
        assertEquals(drinkMaker.withC().withKosong().make().toString(), "Kopi C Kosong");
    }
}
