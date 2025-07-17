package observerpattern.observerable;

import observerpattern.observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements Observerable {
    List<DisplayObserver> displayObserverList = new ArrayList<>();
    int temp;

    @Override
    public void add(DisplayObserver displayObserver) {
        displayObserverList.add(displayObserver);
    }

    @Override
    public void remove(DisplayObserver displayObserver) {
        displayObserverList.remove(displayObserver);
    }

    @Override
    public void notifyObserver() {
        for (DisplayObserver displayObserver : displayObserverList) {
            displayObserver.notifyDisplay(this);
        }
    }

    @Override
    public void setData(int temp) {
        this.temp = temp;
        notifyObserver();
    }

    @Override
    public int getData() {
        return temp;
    }
}
