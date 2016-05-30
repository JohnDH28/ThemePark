package demo;

public class Lavatory extends Destination {
	
	private int defecationDecrementor;
	private int type = 1;
	public Lavatory(int maxPoints,int  cost, boolean openStatus, int defecateDect) {
		// TODO Auto-generated constructor stub
		super(maxPoints, cost, openStatus);
		defecationDecrementor = defecateDect;
	}

}
