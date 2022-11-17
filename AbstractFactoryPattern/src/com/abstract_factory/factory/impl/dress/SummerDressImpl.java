package com.abstract_factory.factory.impl.dress;

import com.abstract_factory.factory.Dress;

public class SummerDressImpl implements Dress {
    @Override
    public String getName() {
        return "Summer dress";
    }

    @Override
    public String getModel() {
        return "This is summer dress";
    }
}
