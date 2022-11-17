package com.factory_method.model;

import com.factory_method.PizzaStore;
import com.factory_method.model.impl.chicago_pizza.ChicagoStyleCheesePizza;
import com.factory_method.model.impl.chicago_pizza.ChicagoStyleClamPizza;
import com.factory_method.model.impl.chicago_pizza.ChicagoStylePepperoniPizza;
import com.factory_method.model.impl.chicago_pizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}
