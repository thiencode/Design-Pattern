package com.abstract_factory;

import com.abstract_factory.factory.Dress;
import com.abstract_factory.factory.Fashion;
import com.abstract_factory.factory.Shoe;

public class Client {
    public void clientMethod(Fashion fashion){
        Shoe shoe = fashion.createShoe();
        Dress dress = fashion.createDress();

        System.out.println(shoe.getModel());
        System.out.println(shoe.getName());

        System.out.println(dress.getModel());
        System.out.println(dress.getName());

        System.out.println("*************");
    }
}
