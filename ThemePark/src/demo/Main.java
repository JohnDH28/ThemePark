package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int length = thePark.getAllDestinations().size();
//		int x=0;
//		while(x< length){
//			System.out.println(thePark.getAllDestinations().get(x).getMaxPoints());
//			x++;
//		}
		System.out.println("Input the number of people, the price coefficent and the amount of points +"
				+ "guests will start with seperated by a single space");
		String iString = s.nextLine();
		System.out.println(iString);
		String[] nextL = iString.split(" ");
		System.out.println(Arrays.toString(nextL));
		int[] inputs = new int[nextL.length];
		for(int x =0;x<3;x++){
			inputs[x]= Integer.parseInt(nextL[x]);
			System.out.println(inputs[x]);
		}
		System.out.println(Arrays.toString(inputs));
		ThemePark thePark = new ThemePark(inputs[0],inputs[1], inputs[2]);
		thePark.setThePark(thePark);
	}

}
