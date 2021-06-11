package za.ac.cput.factory.dining;
/**
 * 	DiningTable Factory.java
 *	DiningTable Factory
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */

public class DiningTableFactory {


	public static DiningTable createDiningTable{

		int tableNum;
		String patronType;

		DiningRoom diningTable = new DiningTable.Builder()

			.setTableNum(tableNum)
			.setPatronType(patronType)
			.build();

		return diningTable;

	}


}