package za.ac.cput.entity.staff;

public class CleaningStaff extends Staff {

    private String staffId;
    private String firstName;
    private String lastName;
    private int shift;
    private int hoursWorked;

    private int floor;

    protected CleaningStaff(){
    }

    public CleaningStaff(String staffId, String firstName, String lastName, int shift, int hoursWorked, int floor) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shift = shift;
        this.hoursWorked = hoursWorked;

        this.floor = floor;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getShift() {
        return shift;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "CleaningStaff{" +
                "staffId='" + staffId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", shift=" + shift +
                ", hoursWorked=" + hoursWorked +
                ", floor=" + floor +
                "} " + super.toString();
    }
}
