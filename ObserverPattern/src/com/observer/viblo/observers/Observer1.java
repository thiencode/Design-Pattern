package com.observer.viblo.observers;

import com.observer.viblo.Observer;
import com.observer.viblo.Subject;

public class Observer1 implements Observer {
    private String mess;
    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(String message) {
        this.mess = message;
        display(message);
    }

    @Override
    public void display(String mess) {
        System.out.println("Observer1: " + mess);
    }
}
