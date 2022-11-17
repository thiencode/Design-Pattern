package com.observer.viblo;

import java.util.ArrayList;

public class Subject {
    private final ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyChange(String mess) {
        for (Observer o : observers) {
            o.update(mess);
        }
    }
}
