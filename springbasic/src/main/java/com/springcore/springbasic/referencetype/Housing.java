package com.springcore.springbasic.referencetype;

public class Housing {
	
	private int housingId;
private Building obj;


public Building getObj() {
	return obj;
}
public void setObj(Building obj) {
	this.obj = obj;
}
public int getHousingId() {
	return housingId;
}
public void setHousingId(int housingId) {
	this.housingId = housingId;
}
public Housing(Building obj, int housingId) {
	super();
	this.obj = obj;
	this.housingId = housingId;
}
public Housing() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Housing [obj=" + obj + ", housingId=" + housingId + "]";
}

}
