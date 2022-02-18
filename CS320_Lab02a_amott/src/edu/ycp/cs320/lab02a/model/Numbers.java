package edu.ycp.cs320.lab02a.model;

// model class for Multiply and Add Numbers
// only the controller should be allowed to call the set methods
// the JSP will call the "get" and "is" methods implicitly
// when the JSP specifies game.min, that gets converted to
//    a call to model.getMin()
// when the JSP specifies if(game.done), that gets converted to
//    a call to model.isDone()
public class Numbers {
	private Double number1, number2, number3, result;
	
	public Numbers() {
	}
	
	public void setFirst(Double number1) {
		this.number1 = number1;
	}
	
	public Double getFirst() {
		return number1;
	}
	
	public void setSecond(Double number2) {
		this.number2 = number2;
	}
	
	public Double getSecond() {
		return number2;
	}
	
	public void setThird(Double number3) {
		this.number3 = number3;
	}
	
	public Double getThird() {
		return number3;
	}
	
	public void setResult(Double result) {
		this.result = result;
	}
	
	public Double getResult() {
		return result;
	}
}
