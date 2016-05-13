package demo;

import java.util.ArrayList;

public class Destination {
	private int maxPoints;
	private int cost;
	private boolean isOpen;
	private ArrayList<Person> peopleAttending;
	
	public Destination() {
		// TODO Auto-generated constructor stub
		
		int type;
		Destination(int maxPoints, int cost, boolean openStatus){
			this.maxPoints = maxPoints;
			this.cost = cost*ThemePark.priceCoef;
			this.isOpen = openStatus;
			this.peopleAttending = new ArrayList<Person>();
		}
	}
}
