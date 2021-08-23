package za.ac.cput.factoryTest.dining;
/**
 * 	DiningRoom Factory Test.java
 *	DiningRoom Factory Test
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.dining.DiningRoom;
import za.ac.cput.factory.dining.DiningRoomFactory;

import static org.junit.jupiter.api.Assertions.*;


public class DiningRoomFactoryTest {


	@Test
	public void createDiningRoom(){

		DiningRoom diningRoom = DiningRoomFactory.createDiningRoom(

			"DH",//Dining Hall
			"Lunch",
			15,
			20);

			assertEquals("DH", diningRoom.getDiningRoomId());
			assertEquals("Lunch", diningRoom.getServiceType());
			assertEquals(10, diningRoom.getTableId());
			assertEquals(20, diningRoom.getCapacity());

	}


}