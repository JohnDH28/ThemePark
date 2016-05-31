package demo;
import java.util.ArrayList;
import java.util.Random;

public class Person implements PersonInterface {
	private ThemePark park;
    private int points;
    private int height;
    private boolean isAdult;
    private int excitement;
    private int needToDefecate;
    private int fatigue;
    private int hunger;
    private int happiness;
    private int currLocation;

	private static Random rnd = new Random();
    
    public Person(ThemePark park){
        this.park = park;
    	this.points = ThemePark.getPersonStartPoints();
        this.height = (int)(Math.random() * 37 + 42);
        this.isAdult = getRndBool();
        this.excitement = (int)(Math.random() * 4 + 2);
        this.needToDefecate = (int)(Math.random() * 6 + 2);
        this.fatigue = 5;
        this.hunger = 5;
        this.happiness = (int)((fatigue + needToDefecate + excitement + hunger) / 4);
        this.currLocation = currLocation;
    }
    
    public int chooseActivity(){
        int dest;
        int rndActivity = (int)(Math.random() * 3);
        dest = rndActivity;
        if(excitement <= 3) dest = 0;
        if(points == 0) dest = 3;
        if(fatigue <= 3 || hunger <= 3) dest = 2;
        if(needToDefecate >= 8) dest = 1;
        return dest;
    }
    
    public void doesActivity(int destIndex){
    	int dest = 0;
    	int type = 0;
    	for(int i = 0; i < park.allDestinations.size(); i++){
    		if(park.allDestinations.get(i) instanceof Ride && destIndex == 0){
    			dest = i; 
    			type = 0;
    		}
    		if(park.allDestinations.get(i) instanceof Lavatory && destIndex == 1){
    			dest = i;
    			type = 1;
    		}
    		if(park.allDestinations.get(i) instanceof Vendor && destIndex == 2){
    			dest = i;
    			type = 2;
    		}
    		if(park.allDestinations.get(i) instanceof Kiosk && destIndex == 3){
    			dest = i;
    			type = 3;
    		}
    	}
        this.currLocation = dest;
        park.getAllDestinations().get(dest).setMaxPoints(park.getAllDestinations().get(dest).getMaxPoints() + park.getAllDestinations().get(dest).getCost());
        this.points -= park.getAllDestinations().get(dest).getCost();
        ArrayList<Person> peopleAtDest = park.getAllDestinations().get(dest).getPeopleAttending();
        peopleAtDest.add(this);
        park.getAllDestinations().get(dest).setPeopleAttending(peopleAtDest);
        int[] incrementor = park.getAllDestinations().get(dest).arrayOfIcrementors();
        if(type == 0){
        	excitement += incrementor[0];
        	fatigue += incrementor[1];
        	needToDefecate += incrementor[2];  
        	hunger += incrementor[3];  
        }
        if(type == 1){
        	excitement += incrementor[0];
        	fatigue += incrementor[1];
        	needToDefecate += incrementor[2];  
        	hunger += incrementor[3];  
        }
        if(type == 2){
        	excitement += incrementor[0];
        	fatigue += incrementor[1];
        	needToDefecate += incrementor[2];    
        	hunger += incrementor[3];  
        }
        if(type == 3){
        	excitement += incrementor[0];
        	fatigue += incrementor[1];
        	needToDefecate += incrementor[2];  
        	hunger += incrementor[3];  
        }
        if(excitement > 10) excitement = 10;
        if(excitement < 0) excitement = 0;
        if(fatigue > 10) fatigue = 10;
        if(fatigue < 0) fatigue = 0;
        if(needToDefecate > 10) needToDefecate = 10;
        if(needToDefecate < 0) needToDefecate = 0;
        if(hunger > 10) hunger = 10;
        if(hunger < 0) hunger = 0;
    }
    
    public static boolean getRndBool(){
        return rnd.nextBoolean();
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

    public int getExceitement() {
        return excitement;
    }

    public int getFatigue() {
        return fatigue;
    }

    public int getDefecation() {
        return needToDefecate;
    }

    public int getHappiness() {
        return happiness;
    }
    
	public int getHunger() {
		return hunger;
	}
	
	public int getCurrLocation() {
		return currLocation;
	}
}
