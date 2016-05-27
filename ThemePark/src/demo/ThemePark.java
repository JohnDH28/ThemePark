package demo;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import java.util.Timer;

public class ThemePark {
	private int numPeople;
	private int numOfDest;
	private int priceCoef;	
	private int numOfLavatories;
	private int numOfRides;
	private int numOfKiosks;
	private int numOfVendors;
	ArrayList<Person> peopleInPark = new ArrayList<Person>();
	ArrayList<Destination> allDestinations = new ArrayList<Destination>();
	private ThemePark thePark;
	private int personStartPoints;
	private int tExcit;
	private int tFat;
	private int tDef;
	private int tHappy;
	private int timerCount;
	//index of the object in each of these lists is the also the number of times the parkTimer was called + 1
	List<Integer> excitementHist = new ArrayList<>();
	List<Integer> fatigueHist = new ArrayList<>();
	List<Integer> defecationHist = new ArrayList<>();
	List<Integer> happyHist = new ArrayList<>();
	ArrayList<int[]> destinationHist = new ArrayList<int[]>(); //index of the int = index of the destination in allDestinations



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
		timer1.scheduleAtFixedRate(parkTimer, 5000, 5000);
	}
	/*
	 *JOHNS SHIT 
	 *
	 */
	
	Timer timer1 = new Timer();
	TimerTask parkTimer = new TimerTask(){
		public void run() {
			timerCount++;
			excitementHist.add(gettExcit());
			fatigueHist.add(gettFat());
			defecationHist.add(gettDef());
			happyHist.add(gettHappy());
			int[] temp = new int[allDestinations.size()];
			for(int i = 0; i < allDestinations.size(); i++){
				temp[i] = allDestinations.get(i).getMaxPoints();
			}
			destinationHist.add(temp);
		}
		
	};
	
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
	public void collectData(){
		for(Person p : thePark.peopleInPark){
			tExcit += p.getExceitement();
			tFat +=p.getFatigue();
			tDef +=p.getDefecation();
			tHappy +=p.getHappiness();//Calc Sum
		}
		tHappy = tHappy/peopleInPark.size();//Get Average;
	}
	
	public void shutDown(){
		int c = 0;// Some Constant?
		if(tHappy< c){
			if(tExcit<c){
				//closeRandomDest();//closeWorstDest():
			}
			/*
			 * Repleat upper if 
			 */
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
	
	public int gettExcit() {
		return tExcit;
	}
	
	public int gettFat() {
		return tFat;
	}
	
	public int gettDef() {
		return tDef;
	}
	
	public int gettHappy() {
		return tHappy;
	}
	
	public void setThePark(ThemePark thePark) {
		this.thePark = thePark;
	}
}
