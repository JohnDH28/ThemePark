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
	private static int personStartPoints;
	private int tExcit;
	private int tFat;
	private int tDef;
	private int tHun;
	private int tHappy;
	private int timerCount = -1;
	//index of the object in each of these lists is the also the number of times the parkTimer was called + 1
	List<Integer> excitementHist = new ArrayList<>();
	List<Integer> fatigueHist = new ArrayList<>();
	List<Integer> defecationHist = new ArrayList<>();
	List<Integer> hungerHist = new ArrayList<>();
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
		ThemePark.personStartPoints = personStartPoints;
		generatePeople();
		generateAllDestinations();
		//this.activity = activity;
		//numRides = num of activities in activity with type ride
		//numShops = num of activities in activity with type shop
		timer1.scheduleAtFixedRate(parkTimer, 5000, 5000);
	}
	
	/*
	 *JOHN'S CODE
	 *
	 */
	
	public void generatePeople() {
		for(int p = 0; p < numPeople; p++){
			peopleInPark.add(new Person(this));
		}
	}
	
	Timer timer1 = new Timer();
	TimerTask parkTimer = new TimerTask(){
		public void run() {
			//Get stats
			timerCount++;
			excitementHist.add(gettExcit());
			fatigueHist.add(gettFat());
			defecationHist.add(gettDef());
			hungerHist.add(gettHun());
			happyHist.add(gettHappy());
			int[] temp = new int[allDestinations.size()];
			for(int i = 0; i < allDestinations.size(); i++){
				temp[i] = allDestinations.get(i).getMaxPoints();
			}
			destinationHist.add(temp);
			determineEffic(destinationHist.get(timerCount), 5);
			shutDown();
			System.out.println("////////////////////////////////////////");
			System.out.println("Total Excitment: "+ tExcit +"/ Total Fatigue: " +tFat +"/Total Defecation: " +
			tDef +"/ Total Happiness" +tHappy +"/ Number of Open Destinations: " +allDestinations.size() +
			"/ Number of People: "+ peopleInPark.size());
			
			//People change destinations (AI)
			for(Person p: thePark.peopleInPark){
				for(int i = 1; i < 5; i++){
					p.doesActivity(p.chooseActivity());					
				}
			}
		}		
	};
	
	/*
	 * 
	 * ARIK'S CODE
	 * 
	 */
	public void generateAllDestinations(){
		//EFDH
		for(int i=0;i<numOfRides;i++){
			int[] x = { 10,10,0,2};
			allDestinations.add(new Ride(500, 10*priceCoef, true, x));
		}
		for(int i=0;i<numOfLavatories;i++){
			int[] x= {0,0,2,2};
			allDestinations.add(new Lavatory(600, 0, true, x));
		}
		for(int i=0;i<numOfVendors;i++){
			int[] x= {0,5,5,5};
			allDestinations.add(new Vendor(500, 5*priceCoef, true, x));
		}
		for(int i=0;i<numOfKiosks;i++){
			int[] x = {};
			allDestinations.add(new Kiosk(1000, 0, true, 100,x));
		}
	}
	public void collectData(){
		tExcit =0;
		tFat =0;
		tDef = 0;
		tHappy = 0;
		for(Person p : thePark.peopleInPark){
			tExcit += p.getExceitement();
			tFat +=p.getFatigue();
			tDef +=p.getDefecation();
			tHun +=p.getHunger();
			tHappy +=p.getHappiness();//Calc Sum
		}
		//tHappy = tHappy/peopleInPark.size();//Get Average;
	}
	public void determineEffic(int[] arr, int time){
		for(int i=0;i<arr.length;i++){
			  Destination currDest = allDestinations.get(i);
			  currDest.setEffic((allDestinations.get(i).getMaxPoints()-arr[i])/time);
			  allDestinations.set(i,currDest);
			 
		}
	}
	public void shutDown(){
		int c = 0;// Some Constant?
		int x= peopleInPark.size();
		if(tHappy< x/4){
			if(tExcit<x/4){
				//closeRandomDest();//closeWorstDest():
				killDestination("ride");
			}
			if(tFat<x/4){
				killDestination("vendor");
			}
			if(tDef<x/4){
				killDestination("br");
				// are they here?
				
			}
			
			/*
			 * Repleat upper if 
			 */
		}
	}
	public void killDestination(String str){
		ArrayList tmpList = new ArrayList<Destination>();
		if(str.equals("ride")){
			for(Destination d: allDestinations){
				if(d instanceof Ride){
					tmpList.add(d);
				}
			}
		}
		if(str.equals("vendor")){
			for(Destination d: allDestinations){
				if(d instanceof Vendor){
					tmpList.add(d);
				}
			}
		}
		if(str.equals("br")){
			for(Destination d: allDestinations){
				if(d instanceof Lavatory){
					tmpList.add(d);
				}
			}
		}
		double[] allEffic = new double[allDestinations.size()];
		for(int x=0;x<allEffic.length;x++){
			allEffic[x] = allDestinations.get(x).getEfficiency();
		}
		double low = allEffic[0];
		int lowIndx = 0;
		for(int i=0;i<allEffic.length;i++){
			if(allEffic[i]<low){
				low=allEffic[i];
				lowIndx = i;
			}
		}
		allDestinations.remove(lowIndx);
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
	
	public int gettHun() {
		return tHun;
	}
	
	public int gettHappy() {
		return tHappy;
	}
	
	public void setThePark(ThemePark thePark) {
		this.thePark = thePark;
	}
	public static int getPersonStartPoints() {
		return personStartPoints;
	}
}
