package demo;
import java.util.ArrayList;

public interface ThemeParkInterface {
	void generateAllDestinations();
	void collectData();
	void determineEffic(int[] arr, int time);
	void shutDown();
	void killDestination(String str);
	int getPersonStartPoints();
	ArrayList<Destination> getAllDestinations();
}
