package demo;

public class Vendor extends Destination{
	//Affect defecation and fatigue in the person;
	private int defecationIncrementer;
	//private int fatigueDecrementer;
	private int type = 2;
	public Vendor(int maxPoints, int cost, boolean openStatus, int[] arr) {
		// TODO Auto-generated constructor stub
		super(maxPoints, cost, openStatus, arr);
	}
	public int getDefecationIncrementer() {
		return defecationIncrementer;
	}

}
