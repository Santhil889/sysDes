package observerpattern.observerable;

import observerpattern.observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observerable {
    List<DisplayObserver> displayObserverList = new ArrayList<>();
    int stocks;

    public IphoneObservable(int stocks) {
        this.stocks = stocks;
    }

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
    public void setData(int newStocks) {
        System.out.println("Stocks before " + stocks);
        if(stocks==0 && newStocks!=0) {
            notifyObserver();
        }
        stocks = stocks + newStocks;
        System.out.println("Stocks After " + stocks);
    }

    @Override
    public int getData() {
        return stocks;
    }
}
