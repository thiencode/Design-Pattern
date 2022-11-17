package com.factory_method.model;

import com.factory_method.PizzaStore;
import com.factory_method.model.impl.ny_style_pizza.NYStyleCheesePizza;
import com.factory_method.model.impl.ny_style_pizza.NYStyleClamPizza;
import com.factory_method.model.impl.ny_style_pizza.NYStylePepperoniPizza;
import com.factory_method.model.impl.ny_style_pizza.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }
}
