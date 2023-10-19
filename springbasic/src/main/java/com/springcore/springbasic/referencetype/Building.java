package com.springcore.springbasic.referencetype;

public class Building {
private int buildingId;

public int getBuildingId() {
	return buildingId;
}

public void setBuildingId(int buildingId) {
	this.buildingId = buildingId;
}

public Building(int buildingId) {
	super();
	this.buildingId = buildingId;
}

public Building() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Building [buildingId=" + buildingId + "]";
}

}
