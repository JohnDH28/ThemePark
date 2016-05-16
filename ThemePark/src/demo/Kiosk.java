package demo;

public class Kiosk extends Destination {
	private int refilAmount;
	public Kiosk(int maxPoints,int  cost, boolean openStatus, int type , int rAmount) {
		// TODO Auto-generated constructor stub
		super(maxPoints,cost,openStatus,type);
		refilAmount = rAmount;
	}

}
