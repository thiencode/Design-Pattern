package com.observer.viblo;

import com.observer.viblo.observers.Observer1;
import com.observer.viblo.observers.Observer2;

public class VibloMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer1 observer1 = new Observer1(subject);
        Observer2 observer2 = new Observer2(subject);


        subject.notifyChange("Test change state 1");
        subject.detach(observer1);
        subject.notifyChange("Test change state 2");
    }
}
