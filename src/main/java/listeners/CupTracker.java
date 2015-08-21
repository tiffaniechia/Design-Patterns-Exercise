package listeners;

import drinks.Drink;

public class CupTracker implements Observer {
    private int cupsIssuedCount;

    public CupTracker() {
        this.cupsIssuedCount = 0;
    }

    public void update(Drink drink) {
        cupsIssuedCount += 1;
    }

    public int cupsIssuedCount() {
        return cupsIssuedCount;
    }
}
