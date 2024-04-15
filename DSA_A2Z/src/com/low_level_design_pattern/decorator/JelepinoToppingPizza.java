package com.low_level_design_pattern.decorator;

public class JelepinoToppingPizza extends PizzaDecorator {

	public Pizza pizza;

	public JelepinoToppingPizza(Pizza jelepinoTopping) {
		this.pizza = jelepinoTopping;
	}

	@Override
	public double cost() {

		return this.pizza.cost() + 50;
	}

}
