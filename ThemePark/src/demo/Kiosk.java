package demo;

public class Kiosk extends Destination {
	private int refilAmount;
	private int type = 3;
	public Kiosk(int maxPoints,int  cost, boolean openStatus, int rAmount, int[] arr) {
		// TODO Auto-generated constructor stub
		super(maxPoints,cost,openStatus,arr);
		refilAmount = rAmount;
	}

}
