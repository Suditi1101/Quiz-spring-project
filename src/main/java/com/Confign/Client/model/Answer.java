package com.Confign.Client.model;

public class Answer {
	private String strAns;
	private int intAns;
	private boolean boolAns;
	private double doubleAns;
	private String type;
	
	public Answer(String strAns) {
		super();
		this.strAns = strAns;
		this.type = "string";
	}
	
	public Answer(int intAns) {
		super();
		this.intAns = intAns;
		this.type = "integer";
	}
	public Answer(boolean boolAns) {
		super();
		this.boolAns = boolAns;
		this.type = "boolean";
	}
	public Answer(double doubleAns) {
		super();
		this.doubleAns = doubleAns;
		this.type = "double";
	}
	public String getStrAns() {
		return strAns;
	}
	
	public int getIntAns() {
		return intAns;
	}
	
	public boolean isBoolAns() {
		return boolAns;
	}
	public double getDoubleAns() {
		return doubleAns;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
