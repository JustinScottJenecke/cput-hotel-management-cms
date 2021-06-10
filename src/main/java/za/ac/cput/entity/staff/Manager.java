package za.ac.cput.entity.staff;

public class Manager {

    private String staffId;
    private String firstName;
    private String lastName;
    private int shift;
    private int hoursWorked;

    private String userName;
    private String password;
    private String role;

    protected Manager(){
    }

    public Manager(Builder builder) {

        this.staffId = builder.staffId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.shift = builder.shift;
        this.hoursWorked = builder.hoursWorked;

        this.userName = builder.userName;
        this.password = builder.password;
        this.role = builder.role;
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

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "staffId='" + staffId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", shift=" + shift +
                ", hoursWorked=" + hoursWorked +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }

    // ------  public static inner Builder class  ------

    public static class Builder {

        private String staffId;
        private String firstName;
        private String lastName;
        private int shift;
        private int hoursWorked;

        private String userName;
        private String password;
        private String role;

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

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder copy(Manager s){

            this.staffId = s.staffId;
            this.firstName = s.firstName;
            this.lastName = s.lastName;
            this.shift = s.shift;
            this.hoursWorked = s.hoursWorked;

            this.userName = s.userName;
            this.password = s.password;
            this.role = s.role;

            return this;
        }

        public Manager build() {
            return new Manager(this);
        }
    }
}
