package observerpattern.observer;

import observerpattern.observerable.IphoneObservable;
import observerpattern.observerable.Observerable;
import observerpattern.observerable.WeatherStationObservable;

public class MobileDisplayObserver implements DisplayObserver {
    Observerable observerable;
    String mobileName;

    public MobileDisplayObserver(String name, Observerable observerable) {
        this.mobileName = name;
        this.observerable = observerable;
    }

    @Override
    public void notifyDisplay(Observerable observerable) {
        if( observerable instanceof WeatherStationObservable) {
            System.out.println("Displaying temp on " + mobileName + " Mobile");
            System.out.println("Current temp is : " + observerable.getData());
        }
        else if (observerable instanceof IphoneObservable) {
            System.out.println("Displaying iphones on " + mobileName + " Mobile");
            System.out.println("Hurry stocks will not last long!!!");
            System.out.println("Current stock is : " + observerable.getData());
        }
        System.out.println("\n");
    }
}
