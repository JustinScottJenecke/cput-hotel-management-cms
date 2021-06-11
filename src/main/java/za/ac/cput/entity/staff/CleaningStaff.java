package za.ac.cput.entity.staff;

/*
    CleaningStaff.java
    Entity for the CleaningStaff
    Author: Justin Scott Jenecke 215163052
    Date: 10 June 2021
*/

public class CleaningStaff {

    private String staffId;
    private String firstName;
    private String lastName;
    private int shift;
    private int hoursWorked;

    private int floor;

    protected CleaningStaff(){
    }

    public CleaningStaff(Builder builder) {

        this.staffId = builder.staffId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.shift = builder.shift;
        this.hoursWorked = builder.hoursWorked;

        this.floor = builder.floor;
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
                "} ";
    }

    public static class Builder {

        private String staffId;
        private String firstName;
        private String lastName;
        private int shift;
        private int hoursWorked;

        private int floor;

        public Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setShift(int shift) {
            this.shift = shift;
            return this;
        }

        public Builder setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public Builder setFloor(int floor) {
            this.floor = floor;
            return this;
        }

        public Builder copy(CleaningStaff s){

            this.staffId = s.staffId;
            this.firstName = s.firstName;
            this.lastName = s.lastName;
            this.shift = s.shift;
            this.hoursWorked = s.hoursWorked;

            this.floor = s.floor;

            return this;
        }

        public CleaningStaff build() {
            return new CleaningStaff(this);
        }
    }
}
