/**
 * GeneralEmployee.java
 * Entity for GeneralEmployee
 * Author: Kevin Michael Karelse (219000859)
 * Date:11/06/2021
 */

package za.ac.cput.entity.staff;

public class GeneralEmployee extends Staff {

    private String staffId;
    private String firstName;
    private String lastName;
    private int shift;
    private int hoursWorked;

    private String genEmpJob;

    private GeneralEmployee(Builder builder) {
        this.staffId = builder.staffId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.shift = builder.shift;
        this.hoursWorked = builder.hoursWorked;
        this.genEmpJob = builder.genEmpJob;
    }

    @Override
    public String toString() {
        return "GeneralEmployee{" +
                "staffId='" + staffId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", shift=" + shift +
                ", hoursWorked=" + hoursWorked +
                ", genEmpJob='" + genEmpJob + '\'' +
                '}';
    }

    public static class Builder {

        private String staffId;
        private String firstName;
        private String lastName;
        private int shift;
        private int hoursWorked;

        private String genEmpJob;

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

        public Builder setGenEmpJob(String genEmpJob) {
            this.genEmpJob = genEmpJob;
            return this;

        }

        public GeneralEmployee build(){

            return new GeneralEmployee(this);
        }

        private Builder copy (GeneralEmployee generalEmployee){
            this.staffId = generalEmployee.staffId;
            this.firstName = generalEmployee.firstName;
            this.lastName = generalEmployee.lastName;
            this.shift = generalEmployee.shift;
            this.hoursWorked = generalEmployee.hoursWorked;
            this.genEmpJob = generalEmployee.genEmpJob;

            return this;

        }
    }
}