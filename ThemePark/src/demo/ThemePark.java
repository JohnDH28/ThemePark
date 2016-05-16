package demo;
import java.util.ArrayList;

public class ThemePark {
	private static int numPeople;
	private static int numOfDest;
	private static int priceCoef;	
	private static int numOfLavatories;
	private static int numOfRides;
	private static int numOfKiosks;
	private static int numOfVendors;
	ArrayList<Person> peopleInPark;
	ArrayList<Destination> allDestinations = new ArrayList<Destination>();
	//Array list of shops/vendors/rides (activities)
	
	public ThemePark(int nop){
		peopleInPark = new ArrayList<Person>();
		numPeople = peopleInPark.size();
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
	public static void generateNumberDestinations(){
		double numOfDestinations = getNumPeople()/10;
		numOfLavatories = (int) (numOfDestinations*.2);
		numOfRides = (int)(numOfDestinations*.4);
		numOfKiosks = (int)(numOfDestinations*.2);
		numOfVendors = (int)(numOfDestinations*.2);
	}

	/*
	 * 
	 * 
	 * GETTER / SETTER
	 */
	public static int getNumPeople() {
		return numPeople;
	}

	public static int getNumOfDest() {
		return numOfDest;
	}

	public static int getPriceCoef() {
		return priceCoef;
	}
	public static int getNumOfDestinations(){
		return numOfLavatories + numOfRides + numOfKiosks + numOfVendors;
	}
}
