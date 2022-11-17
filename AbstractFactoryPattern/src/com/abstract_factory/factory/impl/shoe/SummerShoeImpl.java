package com.abstract_factory.factory.impl.shoe;

import com.abstract_factory.factory.Shoe;

public class SummerShoeImpl implements Shoe {
    @Override
    public String getName() {
        return "Summer shoe";
    }

    @Override
    public String getModel() {
        return "This is summer shoe";
    }
}
