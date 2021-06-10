package za.ac.cput.entity.staff;

public class KitchenStaff extends Staff {

    private String staffId;
    private String firstName;
    private String lastName;
    private int shift;
    private int hoursWorked;

    private String Job;

    protected KitchenStaff(){
    }

    public KitchenStaff(String staffId, String firstName, String lastName, int shift, int hoursWorked, String job) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shift = shift;
        this.hoursWorked = hoursWorked;

        this.Job = job;
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

    public String getJob() {
        return Job;
    }

    @Override
    public String toString() {
        return "KitchenStaff{" +
                "staffId='" + staffId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", shift=" + shift +
                ", hoursWorked=" + hoursWorked +
                ", Job='" + Job + '\'' +
                "} " + super.toString();
    }
}
