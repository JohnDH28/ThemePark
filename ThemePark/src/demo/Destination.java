package demo;

import java.util.ArrayList;

public class Destination {
	private int maxPoints;
	private int cost;
	private boolean isOpen;
	private ArrayList<Person> peopleAttending;
	private int type;
	
	public Destination(int maxPoints,int  cost, boolean openStatus) {
		this.maxPoints = maxPoints;
		this.cost = cost;
		this.isOpen = openStatus;
		this.peopleAttending = new ArrayList<Person>();
		this.type= type;
	}

	public int getMaxPoints() {
		return maxPoints;
	}

	public void setMaxPoints(int maxPoints) {
		this.maxPoints = maxPoints;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public ArrayList<Person> getPeopleAttending() {
		return peopleAttending;
	}

	public void setPeopleAttending(ArrayList<Person> peopleAttending) {
		this.peopleAttending = peopleAttending;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}

