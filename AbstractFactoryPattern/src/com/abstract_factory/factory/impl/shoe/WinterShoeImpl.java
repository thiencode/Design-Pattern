package com.abstract_factory.factory.impl.shoe;

import com.abstract_factory.factory.Shoe;

public class WinterShoeImpl implements Shoe {
    @Override
    public String getName() {
        return "Winter shoe";
    }

    @Override
    public String getModel() {
        return "This is winter shoe";
    }
}
