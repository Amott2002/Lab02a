package edu.ycp.cs320.lab02a.controller;

import edu.ycp.cs320.lab02a.model.Numbers;

public class NumbersController {
	
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model = model;
	}
	
	//add method
	public Double add() {
		return model.getFirst() + model.getSecond() + model.getThird();
	}
	
	//multiply method
	public Double multiply() {
		return model.getFirst()*model.getSecond();
	}
}
