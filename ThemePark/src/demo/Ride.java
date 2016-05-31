package demo;

public class Ride extends Destination{
	// How much fatigue and excitement change on a person;
	private int fatigueIncrementor;
	private int excitementIncrementor;
	private int type = 0;
	public Ride(int maxPoints, int cost, boolean openStatus,int[] arr ) {
		super(maxPoints, cost, openStatus, arr);

		// TODO Auto-generated constructor stub
	}
	public int getFatigueIncrementor() {
		return fatigueIncrementor;
	}

	public int getExcitementIncrementor() {
		return excitementIncrementor;
	}
	
}
