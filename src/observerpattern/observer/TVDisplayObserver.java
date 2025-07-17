package observerpattern.observer;

import observerpattern.observerable.IphoneObservable;
import observerpattern.observerable.Observerable;
import observerpattern.observerable.WeatherStationObservable;

public class TVDisplayObserver implements DisplayObserver {
    Observerable observerable;
    String TvName;

    public TVDisplayObserver(String name, Observerable observerable) {
        this.observerable = observerable;
        this.TvName = name;
    }

    @Override
    public void notifyDisplay(Observerable observerable) {
        if (observerable instanceof WeatherStationObservable) {
            System.out.println("Displaying temp on " + TvName + " TV");
            System.out.println("Current temp is : " + observerable.getData());
        } else if (observerable instanceof IphoneObservable) {
            System.out.println("Displaying iphones on " + TvName + " TV");
            System.out.println("Hurry stocks will not last long!!!");
            System.out.println("Current stock is : " + observerable.getData());
        }
        System.out.println("\n");
    }
}
