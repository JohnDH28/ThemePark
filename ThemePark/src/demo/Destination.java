package demo;

import java.util.ArrayList;

public class Destination implements DestinationInterface{
	private int maxPoints;
	private int cost;
	private boolean isOpen;
	private ArrayList<Person> peopleAttending;
	private double efficiency;
	private int[] incrementors;
	//EFDH
	//Excitiment fatigue defecation hunger
	//private int type;
	
	public Destination(int maxPoints,int  cost, boolean openStatus, int[] inArr) {
		this.maxPoints = maxPoints;
		this.cost = cost;
		this.isOpen = openStatus;
		this.peopleAttending = new ArrayList<Person>();
		this.efficiency = 0;
		this.incrementors = inArr;
		//this.type= type;
	}

	public int getMaxPoints() {
		return maxPoints;
	}
	public int[] getIncrementors(){
		return incrementors;
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



	@Override
	public double getEfficiency() {
		// TODO Auto-generated method stub
		return efficiency;
	}

	@Override
	public int[] arrayOfIcrementors() {
		// TODO Auto-generated method stub
		return incrementors;
	}

}

