package demo;
import java.util.ArrayList;

public class ThemePark {
	private static int numPeople;
	private static int numOfDest;
	private static int priceCoef;	
	ArrayList<Person> peopleInPark = new ArrayList<Person>();
	ArrayList<Destinations> allDestinations = new ArrayList<Destination>();
	//Array list of shops/vendors/rides (activities)
	
	public ThemePark(ArrayList<Person> people){
		this.people = people;
		numPeople = people.size();
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
	public static generateDestinations(){
		double numOfDestinations = numOfPeople/10;
		int numOfLavatories = (int) (numOfDestinations*.2);
		int numOfRides = (int)(numOfDestinations*.4);
		int numOfKiosks = (int)(numOfDestinations*.2);
		int numOfVendors = (int)(numOfDestinations*.2);
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
}
