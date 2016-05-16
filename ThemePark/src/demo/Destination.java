package demo;

import java.util.ArrayList;

public class Destination {
	private int maxPoints;
	private int cost;
	private boolean isOpen;
	private ArrayList<Person> peopleAttending;
	private int type;
	public Destination(int maxPoints,int  cost, boolean openStatus, int type) {
		// TODO Auto-generated constructor stub
		this.maxPoints = maxPoints;
		this.cost = cost*ThemePark.getPriceCoef();
		this.isOpen = openStatus;
		this.peopleAttending = new ArrayList<Person>();
		this.type= type;
	}
}

