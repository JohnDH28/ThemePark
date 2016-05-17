package demo;
import java.util.ArrayList;

public class ThemePark {
	private int numPeople;
	private int numOfDest;
	private int priceCoef;	
	private int numOfLavatories;
	private int numOfRides;
	private int numOfKiosks;
	private int numOfVendors;
	ArrayList<Person> peopleInPark;
	ArrayList<Destination> allDestinations = new ArrayList<Destination>();
	//Array list of shops/vendors/rides (activities)
	
	public ThemePark(int numPeople, int priceCoef){
		peopleInPark = new ArrayList<Person>();
		this.numPeople = numPeople;
		this.priceCoef = priceCoef;
		//this.activity = activity;
		//numRides = num of activities in activity with type ride
		//numShops = num of activities in activity with type shop
	}
	/*
	 *JOHNS SHIT 
	 *
	 */
	
	
	
	/*
	 * 
	 * ARIKS SHIT
	 * 
	 */

	public int getNumPeople() {
		return numPeople;
	}

	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}

	public int getNumOfDest() {
		return numOfDest;
	}

	public void setNumOfDest(int numOfDest) {
		this.numOfDest = numOfDest;
	}

	public int getPriceCoef() {
		return priceCoef;
	}

	public void setPriceCoef(int priceCoef) {
		this.priceCoef = priceCoef;
	}

	public int getNumOfLavatories() {
		return numOfLavatories;
	}

	public void setNumOfLavatories(int numOfLavatories) {
		this.numOfLavatories = numOfLavatories;
	}

	public int getNumOfRides() {
		return numOfRides;
	}

	public void setNumOfRides(int numOfRides) {
		this.numOfRides = numOfRides;
	}

	public int getNumOfKiosks() {
		return numOfKiosks;
	}

	public void setNumOfKiosks(int numOfKiosks) {
		this.numOfKiosks = numOfKiosks;
	}

	public int getNumOfVendors() {
		return numOfVendors;
	}

	public void setNumOfVendors(int numOfVendors) {
		this.numOfVendors = numOfVendors;
	}

	public ArrayList<Person> getPeopleInPark() {
		return peopleInPark;
	}

	public void setPeopleInPark(ArrayList<Person> peopleInPark) {
		this.peopleInPark = peopleInPark;
	}	
}
