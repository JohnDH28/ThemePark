package demo;


public interface PersonInterface {
	/**
	 * Lowers the Person p's points and Destinations dest's points
	 * @return 
	 */
	void doesActivity(Destination dest);
	int getExceitement();
	int getFatigue();
	int getDefecation();
	int getHappiness();//Average the above 3
}
