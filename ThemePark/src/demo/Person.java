package demo;

public class Person implements PersonInterface {
	private int points;
	private int height;
	private boolean isAdult;
	private Destination currLocation;
	
	public Person(int points, int height, boolean isAdult, Destination currLocation){
		this.points = points;
		this.height = height;
		this.isAdult = isAdult;
		this.currLocation = currLocation;
	}
	
	public void doesActivity(Destination dest) {
		this.currLocation = dest;
		dest.setMaxPoints(dest.getMaxPoints() - dest.getCost());
		this.points -= dest.getCost();
		
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
}
