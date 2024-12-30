package org.lowleveldesign.ObserverPattern;

import org.lowleveldesign.ObserverPattern.Observable.IphoneObservableImpl;
import org.lowleveldesign.ObserverPattern.Observable.StockObservable;
import org.lowleveldesign.ObserverPattern.Observer.EmailAlertObserverImpl;
import org.lowleveldesign.ObserverPattern.Observer.MobileAlertObserverImpl;
import org.lowleveldesign.ObserverPattern.Observer.NotificationAlertObserver;

public class TestObserverPattern {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("rayy@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("mark224@icloud.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Vincen", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        System.out.println(" ------------- Iphone Stock is available now. Hurry Up !!!! -------------");

        iphoneStockObservable.setStockCount(10);
    }

}
