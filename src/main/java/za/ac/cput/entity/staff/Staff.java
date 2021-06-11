package za.ac.cput.entity.staff;

/*
    Staff.java
    Abstract class for the Staff
    Author: Justin Scott Jenecke 215163052
    Date: 10 June 2021
*/


public abstract class Staff {

    private String staffId;
    private String firstName;
    private String lastName;
    private int shift;
    private int hoursWorked;

    public Staff() {
    }

    public Staff(String staffId, String firstName, String lastName, int shift, int hoursWorked) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shift = shift;
        this.hoursWorked = hoursWorked;
    }
}
