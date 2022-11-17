package com.strategy;

public abstract class Vehicle {
    protected GoBehavior goBehavior;

    public void setGoBehavior(GoBehavior goBehavior){
        this.goBehavior = goBehavior;
    }

    public void performGo(){
        goBehavior.go();
    }
}
