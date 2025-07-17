package observerpattern.observer;

import observerpattern.observerable.Observerable;

public interface DisplayObserver {
    void notifyDisplay(Observerable observerable);
}
