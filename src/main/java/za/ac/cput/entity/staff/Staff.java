package za.ac.cput.entity.staff;

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
