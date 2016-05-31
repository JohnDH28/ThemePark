package demo;
import java.util.ArrayList;

public interface DestinationInterface {
	int getMaxPoints();
	int getCost();
	boolean isOpen();
	ArrayList<Person> getPeopleAttending();
	double getEfficiency();	
	int[] arrayOfIcrementors();
}
