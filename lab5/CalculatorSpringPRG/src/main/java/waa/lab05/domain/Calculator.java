package waa.lab05.domain;

import java.io.Serializable;

public class Calculator implements Serializable{
	private static final long serialVersionUID = 748392345L;
	
	private Integer addOperand1;
	private Integer addOperand2;
	private Integer sumOfTwoOperands;
	private Integer multOperand1;
	private Integer multOperand2;
	private Integer productOfTwoOpeands;
	
	public Integer getSumOfTwoOperands() {
		return sumOfTwoOperands;
	}
	public void setSumOfTwoOperands(Integer sumOfTwoOperands) {
		this.sumOfTwoOperands = sumOfTwoOperands;
	}
	public Integer getProductOfTwoOpeands() {
		return productOfTwoOpeands;
	}
	public void setProductOfTwoOpeands(Integer productOfTwoOpeands) {
		this.productOfTwoOpeands = productOfTwoOpeands;
	}
	public Integer getAddOperand1() {
		return addOperand1;
	}
	public void setAddOperand1(Integer addOperand1) {
		this.addOperand1 = addOperand1;
	}
	public Integer getAddOperand2() {
		return addOperand2;
	}
	public void setAddOperand2(Integer addOperand2) {
		this.addOperand2 = addOperand2;
	}
	public Integer getMultOperand1() {
		return multOperand1;
	}
	public void setMultOperand1(Integer multOperand1) {
		this.multOperand1 = multOperand1;
	}
	public Integer getMultOperand2() {
		return multOperand2;
	}
	public void setMultOperand2(Integer multOperand2) {
		this.multOperand2 = multOperand2;
	}
	
	public void add() {
		this.sumOfTwoOperands = this.addOperand1 + this.addOperand2;
	}
	
	public void multiply() {
		this.productOfTwoOpeands = this.multOperand1 * this.multOperand2;
	}

}

