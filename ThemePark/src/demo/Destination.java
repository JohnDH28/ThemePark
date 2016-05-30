package demo;

import java.util.ArrayList;

public class Destination {
	private int maxPoints;
	private int cost;
	private boolean isOpen;
	private ArrayList<Person> peopleAttending;
	private int efficiency;
	//private int type;
	
	public Destination(int maxPoints,int  cost, boolean openStatus) {
		this.maxPoints = maxPoints;
		this.cost = cost;
		this.isOpen = openStatus;
		this.peopleAttending = new ArrayList<Person>();
		this.efficiency = 0;
		//this.type= type;
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

	public void setEffic(int i) {
		// TODO Auto-generated method stub
		this.efficiency = i;
	}

	public int getEffic() {
		// TODO Auto-generated method stub
		return efficiency;
	}

}

