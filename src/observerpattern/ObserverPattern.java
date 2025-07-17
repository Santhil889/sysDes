package observerpattern;

import observerpattern.observer.DisplayObserver;
import observerpattern.observer.MobileDisplayObserver;
import observerpattern.observer.TVDisplayObserver;
import observerpattern.observerable.IphoneObservable;
import observerpattern.observerable.WeatherStationObservable;

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherStationObservable wsObservable = new WeatherStationObservable();
        IphoneObservable iPhoneStockObservable = new IphoneObservable(0);

        DisplayObserver ob1 = new TVDisplayObserver("Samsui" , wsObservable);
        DisplayObserver ob2 = new MobileDisplayObserver("amobile" , wsObservable);
        DisplayObserver ob3 = new TVDisplayObserver("Onida" , wsObservable);
        DisplayObserver ob4 = new MobileDisplayObserver("bmobile", wsObservable);

        wsObservable.add(ob1);
        wsObservable.add(ob2);
        wsObservable.add(ob3);

        iPhoneStockObservable.add(ob3);
        iPhoneStockObservable.add(ob4);

//        wsObservable.setData(34);
        iPhoneStockObservable.setData(3);
        iPhoneStockObservable.setData(-3);
        iPhoneStockObservable.setData(3);
    }
}
