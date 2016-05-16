package demo;

public class Vendor extends Destination{
	//Affect defecation and fatigue in the person;
	private int defecationIncrementer;
	//private int fatigueDecrementer;
	private int fatigueIncrementer;
	public Vendor(int maxPoints, int cost, boolean openStatus, int type, int defecateIcnt, int fatigueInct) {
		// TODO Auto-generated constructor stub
		super(maxPoints, cost, openStatus,type);
		this.defecationIncrementer = defecateIcnt;
		this.fatigueIncrementer = fatigueInct;
	}
	public int getDefecationIncrementer() {
		return defecationIncrementer;
	}
	public int getFatigueIncrementer() {
		return fatigueIncrementer;
	}

}