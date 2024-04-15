package com.low_level_design_pattern.decorator;

public class MashroomToppingPizza extends PizzaDecorator {

	public Pizza pizza;

	public MashroomToppingPizza(Pizza mashroomTopping) {
		this.pizza = mashroomTopping;
	}

	@Override
	public double cost() {

		return this.pizza.cost() + 80;
	}

}
