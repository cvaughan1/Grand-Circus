package Auto;


import java.util.ArrayList;

public class AutomobileApp {

	public static void main(String[] args) {
		// BEGIN SETTING DATA
		// Creating a new automobile instance
		Automobile automobile1 = new Automobile();

		// Stuff data for 1 vehicle
		automobile1.setMake("Chevy");
		automobile1.setModel("Tahoe");
		automobile1.setVin("19UYA31581L000000");
		automobile1.setYear(2015);

		// auto.setMake(make);

		// Stuffing data for more than 1 vehicle using a Arraylist of Automobile
		// objects
		ArrayList<Automobile> automobiles = new ArrayList<Automobile>();
		automobiles.add(automobile1);

		// Creating a new automobile instance for 2nd vehicle
		Automobile automobile2 = new Automobile();

		// Stuff data for 2nd vehicle
		automobile2.setMake("Buick");
		automobile2.setModel("Lasabre");
		automobile2.setVin("28XYA31581L000001");
		automobile2.setYear(2014);

		automobiles.add(automobile2);

		// Creating a new automobile instance for 3rd vehicle
		Automobile automobile3 = new Automobile();

		// Stuff data for 3rd vehicle
		automobile3.setMake("Ford");
		automobile3.setModel("Escape");
		automobile3.setVin("98XYA31578L000004");
		automobile3.setYear(2016);

		automobiles.add(automobile3);

		// END SETTING DATA

		// BEGIN GETTING DATA
		// Printing out 1st vehicle directly from instance of Automobile object
		System.out.println("Printing out 1st vehicle from Automobile object ");
		System.out.println(automobile1.getMake());
		System.out.println(automobile1.getModel());

		// Printing out all vehicles from arraylist of Automobile objects
		System.out
				.println("Printing out all vehicles from arraylist of Automobile objects ");

		int index = 1;

		// Enchanced for loop
		// Single Automobile : Plural Arraylist of Automobiles
		// Examples to relate to card:card deck
		// slice of cheese:cheese block
		for (Automobile automobileFromArray : automobiles) {
			System.out.println(index);
			System.out.println(automobileFromArray.getMake());
			System.out.println(automobileFromArray.getModel());
			System.out.println(automobileFromArray.getVin());
			System.out.println(automobileFromArray.getYear());
			index = index + 1;
		}

		// Customer gave vin and wants that vehicle only
		String vinUserGave = "28XYA31581L000001";
		
		System.out.println("Customer gave vin and wants this vehicle only: "
				+ vinUserGave);
		
		for (Automobile automobileFromArray : automobiles) {
			if (automobileFromArray.getVin().equals(vinUserGave)) {
				System.out.println(automobileFromArray.getMake());
				System.out.println(automobileFromArray.getModel());
				System.out.println(automobileFromArray.getVin());
				System.out.println(automobileFromArray.getYear());
			}
		}

		
		//Get all automobiles from user defined method
		System.out
		.println("Printing out all vehicles from arraylist of Automobile objects using common getter from Automobile class");
		
		Automobile.getAllAutomobiles(automobiles);
		
		
		//Get that vehicle Customer gave vin for
		vinUserGave = "98XYA31578L000004";
		System.out.println("Using common getter from Automobile class for operation: Customer gave vin and wants this vehicle only: "
				+ vinUserGave);
		Automobile.getAutomobileFromVIN(automobiles, vinUserGave);
		// END GETTING DATA

	}

}
