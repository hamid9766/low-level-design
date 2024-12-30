package org.lowleveldesign.ObserverPattern.Observer;

import org.lowleveldesign.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Product is in Stock Hurry Up!!!");
    }

    private void sendEmail(String emailId, String msg){
        System.out.println("Mail sent to : " + emailId);
    }
}
