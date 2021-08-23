package za.ac.cput.factoryTest.dining;
/**
 * 	DiningTable Factory Test.java
 *	DiningTable Factory Test
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.dining.DiningTable;
import za.ac.cput.factory.dining.DiningTableFactory;

import static org.junit.jupiter.api.Assertions.*;

public class DiningTableFactoryTest {


	@Test
	public void createDiningTable(){


		DiningTable diningTable = DiningTableFactory.createDiningTable(
			9,
			"VIP");

			assertEquals(2, diningTable.getTableNum());
			assertEquals("VIP", diningTable.getPatronType());

	}

}