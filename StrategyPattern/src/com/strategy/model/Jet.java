package com.strategy.model;

import com.strategy.Vehicle;
import com.strategy.impl.GoByFlyingFastImpl;

public class Jet extends Vehicle {
    public Jet() {
        goBehavior = new GoByFlyingFastImpl();
    }
}
