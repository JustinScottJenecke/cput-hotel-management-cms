/*
Room.java
Sihle Jijana 216273919
 */
package za.ac.cput.entity.guest;

public class SleeperType {
    private String sleepTypeCode;
    private String sleepDetails;

    private SleeperType(Builder builder) {

        this.sleepTypeCode = builder.sleepTypeCode;
        this.sleepDetails = builder.sleepDetails;

    }

    public String getSleepTypeCode() {
        return sleepTypeCode;
    }

    public String getSleepDetails() {
        return sleepDetails;
    }

    @Override
    public String toString() {
        return "SleeperType{" +
                "sleepTypeCode='" + sleepTypeCode + '\'' +
                ", sleepDetails='" + sleepDetails + '\'' +
                '}';
    }

    public static class Builder{

        private String sleepTypeCode;
        private String sleepDetails;

        public Builder setSleepTypeCode(String sleepTypeCode) {
            this.sleepTypeCode = sleepTypeCode;
            return this;
        }

        public Builder setSleepDetails(String sleepDetails) {
            this.sleepDetails = sleepDetails;
            return this;
        }

        public SleeperType build(){
            return new SleeperType(this);
        }

        public Builder copy(SleeperType a){

            this.sleepTypeCode = a.sleepTypeCode;
            this.sleepDetails = a.sleepDetails;

            return this;
        }
    }


}
