package demo;

public class Lavatory extends Destination {
	
	private int defecationDecrementor;
	private int type = 1;
	private int hungerIncrementor;
	public Lavatory(int maxPoints,int  cost, boolean openStatus, int defecateDect) {
		// TODO Auto-generated constructor stub
		super(maxPoints, cost, openStatus);
		defecationDecrementor = defecateDect;
		hungerIncrementor = defecateDect;
	}
	public int getDefecationDecrementor() {
		return defecationDecrementor;
	}
	public void setDefecationDecrementor(int defecationDecrementor) {
		this.defecationDecrementor = defecationDecrementor;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getHungerIncrementor() {
		return hungerIncrementor;
	}
	public void setHungerIncrementor(int hungerIncrementor) {
		this.hungerIncrementor = hungerIncrementor;
	}
	

}
