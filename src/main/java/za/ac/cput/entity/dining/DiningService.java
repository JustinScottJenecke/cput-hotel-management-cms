package za.ac.cput.entity.dining;
/**
 * Student Number: 217050743
 * Author: Shameel Kiyang
 */


public class DiningService {
    private String  serviceType, timeSlot,cost;

    private DiningService(DiningService.Builder builder){
        this.serviceType=builder.serviceType;
        this.timeSlot=builder.timeSlot;
        this.cost=builder.cost;
    }

    @Override
    public String toString() {
        return "DiningService{" +
                "serviceType='" + serviceType + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }

    public static class Builder{
        private String  serviceType, timeSlot,cost;

        public Builder setServiceType(String serviceType) {
            this.serviceType = serviceType;

            return this;
        }

        public Builder setTimeSlot(String timeSlot) {
            this.timeSlot = timeSlot;

            return this;
        }

        public Builder setCost(String cost) {
            this.cost = cost;

            return this;
        }
        public Builder copy(DiningService diningService){
            this.serviceType=diningService.serviceType;
            this.timeSlot=diningService.timeSlot;
            this.cost=diningService.cost;

            return this;
        }
        public DiningService build(){return new DiningService(this);}
    }
}
