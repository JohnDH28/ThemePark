package demo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThemePark thePark = new ThemePark(500,20, 100);
		thePark.setThePark(thePark);
		int length = thePark.getAllDestinations().size();
		int x=0;
		while(x< length){
			System.out.println(thePark.getAllDestinations().get(x).getMaxPoints());
			x++;
		}
	}

}
