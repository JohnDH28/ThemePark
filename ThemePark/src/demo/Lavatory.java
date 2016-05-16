package demo;

public class Lavatory extends Destination {
	
	private int defecationDecrementor;
	public Lavatory(int maxPoints,int  cost, boolean openStatus, int type, int defecateDect) {
		// TODO Auto-generated constructor stub
		super(cost, cost, openStatus, cost);
		defecationDecrementor = defecateDect;
	}

}
