package com.strategy.impl;

import com.strategy.GoBehavior;

public class GoByFlyingFastImpl implements GoBehavior {
    @Override
    public void go() {
        System.out.println("Now I'm flying very fast!");
    }
}
