package demo;

public class Ride extends Destination{
	// How much fatigue and excitement change on a person;
	private int fatigueIncrementor;
	private int excitementIncrementor;
	public Ride(int maxPoints, int cost, boolean openStatus, int fatInct, int extInct) {
		super(maxPoints, cost, openStatus);
		this.excitementIncrementor = extInct;
		this.fatigueIncrementor = fatInct;
		// TODO Auto-generated constructor stub
	}
	public int getFatigueIncrementor() {
		return fatigueIncrementor;
	}

	public int getExcitementIncrementor() {
		return excitementIncrementor;
	}
	
}
