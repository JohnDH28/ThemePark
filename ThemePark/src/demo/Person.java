package demo;

import java.util.ArrayList;

public class Person implements PersonInterface {
	private int points;
	private int height;
	private boolean isAdult;
	private int excitement;
	private int needToDefecate;
	private int fatigue;
	private Destination currLocation;
	
	public Person(int points, int height, boolean isAdult, Destination currLocation, int excitement, int needToDefecate, int fatigue){
		this.points = points;
		this.height = height;
		this.isAdult = isAdult;
		this.excitement = excitement;
		this.needToDefecate = needToDefecate;
		this.fatigue = fatigue;
		this.currLocation = currLocation;
	}
	
	public void doesActivity(Destination dest) {
		//If the destination is open must be checked before caling this method
		this.currLocation = dest;
		dest.setMaxPoints(dest.getMaxPoints() - dest.getCost());
		this.points -= dest.getCost();
		ArrayList<Person> peopleAtDest = dest.getPeopleAttending();
		peopleAtDest.add(this);
		dest.setPeopleAttending(peopleAtDest);
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getHeight() {
		return height;
	}
	
	public boolean isAdult() {
		return isAdult;
	}
}
