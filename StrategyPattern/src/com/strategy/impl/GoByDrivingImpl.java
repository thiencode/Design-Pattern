package com.strategy.impl;

import com.strategy.GoBehavior;

public class GoByDrivingImpl implements GoBehavior {
    @Override
    public void go() {
        System.out.println("Now I'm driving!");
    }
}
