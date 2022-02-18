package edu.ycp.cs320.lab02a.controller;

import edu.ycp.cs320.lab02a.model.Numbers;

public class NumbersController {
	
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model = model;
	}
	
	//add method
	public Double add() {
		return model.getNumber1() + model.getNumber2() + model.getNumber3();
	}
	
	//multiply method
	public Double multiply() {
		return model.getNumber1()*model.getNumber2();
	}
}
