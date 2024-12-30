package org.lowleveldesign.ObserverPattern.Observable;

import org.lowleveldesign.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscriber();

    public void setStockCount(int newStockAdded);

    public int getStockCount();

}
