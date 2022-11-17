package com.abstract_factory.factory.impl.fashion;

import com.abstract_factory.factory.Dress;
import com.abstract_factory.factory.Fashion;
import com.abstract_factory.factory.Shoe;
import com.abstract_factory.factory.impl.dress.WinterDressImpl;
import com.abstract_factory.factory.impl.shoe.SummerShoeImpl;

public class SummerFashionImpl implements Fashion {
    @Override
    public Shoe createShoe() {
        return new SummerShoeImpl();
    }

    @Override
    public Dress createDress() {
        return new WinterDressImpl();
    }
}
