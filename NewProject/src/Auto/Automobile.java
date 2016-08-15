package Auto;


import java.util.ArrayList;


public class Automobile {

	String make;
	String model;
	String vin;
	int year;
	//todo: There are more attributes that can be added later
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the vin
	 */
	public String getVin() {
		return vin;
	}
	/**
	 * @param vin the vin to set
	 */
	public void setVin(String vin) {
		this.vin = vin.toUpperCase();
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	public static void getAllAutomobiles(ArrayList<Automobile> automobiles){
		int index = 1;
		for (Automobile automobileFromArray : automobiles) {
			System.out.println(index);
			System.out.println(automobileFromArray.getMake());
			System.out.println(automobileFromArray.getModel());
			System.out.println(automobileFromArray.getVin());
			index = index + 1;
		}
	}
	
	public static void getAutomobileFromVIN(ArrayList<Automobile> automobiles,String vinUserGave){
		for (Automobile automobileFromArray : automobiles) {
			if (automobileFromArray.getVin().equals(vinUserGave)) {
				System.out.println(automobileFromArray.getMake());
				System.out.println(automobileFromArray.getModel());
				System.out.println(automobileFromArray.getVin());
				System.out.println(automobileFromArray.getYear());
			}
		}
	}

	
}
