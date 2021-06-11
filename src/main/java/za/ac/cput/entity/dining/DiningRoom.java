package za.ac.cput.entity.dining;
/**
 * 	DiningRoom.java
 *	DiningRoom Entity
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */


public class DiningRoom {

    private String diningRoomId;
    private String serviceType;
    private int tableId;
    private int capacity;


    	public DiningRoom(Builder builder){

    		this.dinigRoomId = builder.diningRoomId;
    		this.serviceType = builder.serviceType;
    		this.tableId = builder.tableId;
    		this.capacity = builder.capacity;

    	}

    //getters
    public String getDiningRoomId() {
        return diningRoomId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public int getTableId() {
        return tableId;
    }

    public int getCapacity() {
        return capacity;
    }

    //add a toString

    //Builder Class
    public static class Builder {

    private String diningRoomId;
    private String serviceType;
    private int tableId;
    private int capacity;


    public Builder setDiningRoomId(String diningRoomId) {
            this.diningRoomId = diningRoomId;
            return this;
        }
    public Builder setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
    public Builder setTableId(int tableId) {
            this.tableId = tableId;
            return this;
        }
    public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

     public Builder copy(DiningRoom dR){

		this.diningRoomId = dR.diningRoomId;
		this.serviceType = dR.serviceType;
		this.tableId = dR.tableId;
		this.capacity = dR.capacity;

		return this;
	}

    public DiningRoom build(){
    	return new DiningRoom(this);
    }
    }
}