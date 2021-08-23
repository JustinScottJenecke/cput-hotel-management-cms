package za.ac.cput.factory.dining;

import za.ac.cput.entity.dining.DiningRoom;

/**
 * 	DiningRoom Factory.java
 *	DiningRoom Factory
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */

public class DiningRoomFactory {

	public static DiningRoom createDiningRoom(
		 String diningRoomId,
     	 String serviceType,
    	 int tableId,
     	 int capacity) {

		DiningRoom diningRoom = new DiningRoom.Builder()
				.setDiningRoomId(diningRoomId)
				.setServiceType(serviceType)
				.setTableId(tableId)
				.setCapacity(capacity)
				.build();

		return diningRoom;
	}

}