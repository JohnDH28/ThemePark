package demo;
import java.util.ArrayList;
import java.util.Random;

public class Person implements PersonInterface {
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
    
    public Person(int height, boolean isAdult, int excitement, int needToDefecate, int fatigue, int happiness, Destination currLocation){
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
    
    public void doesActivity(Destination dest){
        this.currLocation = dest;
        dest.setMaxPoints(dest.getMaxPoints() - dest.getCost());
        this.points -= dest.getCost();
        ArrayList<Person> peopleAtDest = dest.getPeopleAttending();
        peopleAtDest.add(this);
        dest.setPeopleAttending(peopleAtDest);
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
