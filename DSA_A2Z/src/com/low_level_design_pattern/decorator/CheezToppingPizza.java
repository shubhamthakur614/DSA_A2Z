package com.low_level_design_pattern.decorator;

public class CheezToppingPizza extends PizzaDecorator {
	public Pizza pizza;

	public CheezToppingPizza(Pizza cheezTopping) {
		this.pizza = cheezTopping;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stu
		return this.pizza.cost() + 30;
	}

}
