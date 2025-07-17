package observerpattern.observerable;

import observerpattern.observer.DisplayObserver;

public interface Observerable {
    void add(DisplayObserver displayObserver);
    void remove(DisplayObserver displayObserver);
    void notifyObserver();
    void setData(int temp);
    int getData();
}
