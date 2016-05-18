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
	ArrayList<Person> peopleInPark = new ArrayList<Person>();;
	ArrayList<Destination> allDestinations = new ArrayList<Destination>();
	private ThemePark thePark;
	private int personStartPoints;
	//Array list of shops/vendors/rides (activities)



	public ThemePark(int numPeople, int priceCoef, int personStartPoints){
		this.numPeople = numPeople;
		this.priceCoef = priceCoef;
		this.numOfDest = 80;
		this.numOfLavatories =10;
		this.numOfKiosks = 15;
		this.numOfVendors = 15;
		this.numOfRides=40;
		this.personStartPoints = personStartPoints;
		generateAllDestinations();
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
	public void generateAllDestinations(){
		for(int i=0;i<numOfRides;i++){
			allDestinations.add(new Ride(500, 10*priceCoef, true, 10, 10));
		}
		for(int i=0;i<numOfVendors;i++){
			allDestinations.add(new Vendor(500, 5*priceCoef, true, 5, 5));
		}
		for(int i=0;i<numOfKiosks;i++){
			allDestinations.add(new Kiosk(1000, 0, true, 100));
		}
		for(int i=0;i<numOfLavatories;i++){
			allDestinations.add(new Lavatory(600, 0, true, 2));
		}
	}
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
	
	public ArrayList<Destination> getAllDestinations() {
		return allDestinations;
	}
	
	public ThemePark getThePark() {

		return thePark;
	}
	
	public void setAllDestinations(ArrayList<Destination> allDestinations) {
		this.allDestinations = allDestinations;
	}
	
	
	
	public void setThePark(ThemePark thePark) {
		this.thePark = thePark;
	}
}
