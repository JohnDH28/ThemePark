package demo;

public class Lavatory extends Destination {
	
	private int type = 1;
	public Lavatory(int maxPoints,int  cost, boolean openStatus, int[] arr) {
		// TODO Auto-generated constructor stub
		super(maxPoints, cost, openStatus, arr);
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}


}
