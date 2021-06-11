/*
Room.java
Sihle Jijana 216273919
 */
package za.ac.cput.factory.guest;

import za.ac.cput.entity.guest.SleeperType;

public class SleeperTypeFactory {

    public static SleeperType createSleepType(

            String sleepTypeCode,
            String sleepDetails){

        SleeperType sleeperType = new SleeperType.Builder()
                .setSleepTypeCode(sleepTypeCode)
                .setSleepDetails(sleepDetails)
                .build();

        return sleeperType;

    }


}
