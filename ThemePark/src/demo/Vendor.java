package demo;

public class Vendor extends Destination{
	//Affect defecation and fatigue in the person;
	private int defecationIncrementer;
	//private int fatigueDecrementer;
	private int fatigueIncrementer;
	private int hungerDecrementer;
	private int type = 2;
	public Vendor(int maxPoints, int cost, boolean openStatus, int defecateIcnt, int fatigueInct) {
		// TODO Auto-generated constructor stub
		super(maxPoints, cost, openStatus);
		this.defecationIncrementer = defecateIcnt;
		this.hungerDecrementer = defecateIcnt;
		this.fatigueIncrementer = fatigueInct;
	}
	public int getDefecationIncrementer() {
		return defecationIncrementer;
	}
	public int getFatigueIncrementer() {
		return fatigueIncrementer;
	}
	public int getHunterDecrementer() {
		return hungerDecrementer;
	}

}
