package com.abstract_factory.factory.impl.dress;

import com.abstract_factory.factory.Dress;

public class WinterDressImpl implements Dress {
    @Override
    public String getName() {
        return "Winter dress";
    }

    @Override
    public String getModel() {
        return "This is winter dress";
    }
}
