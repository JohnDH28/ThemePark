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
    private Destination currLocation;
    private static Random rnd = new Random();
    
    public Person(ThemePark park, int height, boolean isAdult, int excitement, int needToDefecate, int fatigue, int happiness, Destination currLocation){
        this.park = park;
    	this.points = ThemePark.getPersonStartPoints();
        this.height = (int)(Math.random() * 37 + 42);
        this.isAdult = getRndBool();
        this.excitement = (int)(Math.random() * 4 + 2);
        this.needToDefecate = (int)(Math.random() * 6 + 2);
        this.fatigue = (int)(Math.random() * 4);
        this.hunger = (int)(Math.random() * 6 + 2);
        this.happiness = (int)((fatigue + needToDefecate + excitement) / 3);
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
    
    public void doesActivity(int dest){
        this.currLocation = park.getAllDestinations().get(dest);
        park.getAllDestinations().get(dest).setMaxPoints(park.getAllDestinations().get(dest).getMaxPoints() + park.getAllDestinations().get(dest).getCost());
        this.points -= park.getAllDestinations().get(dest).getCost();
        ArrayList<Person> peopleAtDest = park.getAllDestinations().get(dest).getPeopleAttending();
        peopleAtDest.add(this);
        park.getAllDestinations().get(dest).setPeopleAttending(peopleAtDest);
        int[] incrementor = park.getAllDestinations().get(dest).arrayOfIcrementors();
        if(dest == 0){
        	excitement += incrementor[0];
        	fatigue += incrementor[1];
        	needToDefecate += incrementor[2];  
        	hunger += incrementor[3];  
        }
        if(dest == 1){
        	excitement += incrementor[0];
        	fatigue += incrementor[1];
        	needToDefecate -= incrementor[2];  
        	hunger -= incrementor[3];  
        }
        if(dest == 2){
        	excitement += incrementor[0];
        	fatigue += incrementor[1];
        	needToDefecate += incrementor[2];    
        	hunger -= incrementor[3];  
        }
        if(dest == 3){
        	excitement += incrementor[0];
        	fatigue += incrementor[1];
        	needToDefecate -= incrementor[2];  
        	hunger += incrementor[3];  
        }
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
}
