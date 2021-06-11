package za.ac.cput.entity.staff;

public class KitchenStaff {

    private String staffId;
    private String firstName;
    private String lastName;
    private int shift;
    private int hoursWorked;

    private String job;

    protected KitchenStaff(){
    }

    public KitchenStaff(Builder builder) {

        this.staffId = builder.staffId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.shift = builder.shift;
        this.hoursWorked = builder.hoursWorked;

        this.job = builder.job;
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
        return job;
    }

    @Override
    public String toString() {
        return "KitchenStaff{" +
                "staffId='" + staffId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", shift=" + shift +
                ", hoursWorked=" + hoursWorked +
                ", Job='" + job + '\'' +
                "} ";
    }

    public static class Builder {

        private String staffId;
        private String firstName;
        private String lastName;
        private int shift;
        private int hoursWorked;

        private String job;

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

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder copy(KitchenStaff s){

            this.staffId = s.staffId;
            this.firstName = s.firstName;
            this.lastName = s.lastName;
            this.shift = s.shift;
            this.hoursWorked = s.hoursWorked;

            this.job = s.job;

            return this;
        }

        public KitchenStaff build() {
            return new KitchenStaff(this);
        }


    }
}
