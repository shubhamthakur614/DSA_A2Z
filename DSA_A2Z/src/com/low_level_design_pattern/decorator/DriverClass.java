package com.low_level_design_pattern.decorator;

public class DriverClass {
	public static void main(String[] args) {
		Pizza pizza = new MargaritaPizza();
		System.out.println(pizza.cost());
		pizza = new CheezToppingPizza(pizza);
		System.out.println(pizza.cost());
		pizza = new MashroomToppingPizza(pizza);
		System.out.println(pizza.cost());
	}

}
