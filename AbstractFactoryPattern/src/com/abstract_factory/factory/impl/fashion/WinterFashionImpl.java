package com.abstract_factory.factory.impl.fashion;

import com.abstract_factory.factory.Dress;
import com.abstract_factory.factory.Fashion;
import com.abstract_factory.factory.Shoe;
import com.abstract_factory.factory.impl.dress.WinterDressImpl;
import com.abstract_factory.factory.impl.shoe.WinterShoeImpl;

public class WinterFashionImpl implements Fashion {
    @Override
    public Shoe createShoe() {
        return new WinterShoeImpl();
    }

    @Override
    public Dress createDress() {
        return new WinterDressImpl();
    }
}
