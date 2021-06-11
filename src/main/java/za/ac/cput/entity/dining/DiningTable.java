package za.ac.cput.entity.dining;
/**
 * 	DiningTable.java
 *	DiningTable Entity
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */

public class DiningTable {

	private int tableNum;
	private String patronType;

    public DiningTable(Builder builder) {

    	this.tableNum = builder.tableNum;
    	this.patronType = builder.patronType;
    }

	//getters
    public int getTableNum() {
        return tableNum;
    }
    public String getPatronType() {
        return patronType;
    }
    //add a toString

    //Builder Class
    public static class Builder{

    	private int tableNum;
		private String patronType;

	public Builder setTableNum(int tableNum){
		this.tableNum = tableNum;
		return this;
	}
	public Builder setPatronType(String patronType){
		this.patronType = patronType;
		return this;
	}

	public Builder copy(DiningTable dT){

		this.tableNum = dT.tableNum;
		this.patronType = dT.patronType;

		return this;
	}

	public DiningTable build(){
		return new DiningTable(this);
	}
    }
}