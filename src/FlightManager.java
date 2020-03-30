import java.util.Scanner;

public class FlightManager {
	Flight flight;
	Scanner input;
	FlightManager(Scanner input) {
		this.input = input;
	}
	
	public void uploadFlight() {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		System.out.print("Airline : ");
		String airlineName = input.next();
		System.out.print("Departure : ");
		String departure = input.next();
		System.out.print("Arrival : ");
		String arrival = input.next();
		System.out.print("Flight Time : ");
		String flightTime = input.next();
		flight = new Flight(flightNum, airlineName, departure, arrival, flightTime);		//initializing the fields by constructor
		flight.printInfo();
	}
	
	public void deleteFlight() {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		if(registration(flightNum) == false)
			return;
		if(flight.flightNumReturn() == flightNum) {
			flight = null;
			System.out.println("The Flight Information is deleted");
		}
		System.out.println();
	}
	
	public void editFlight() {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		System.out.println();
		if(registration(flightNum) == false)
			return;
		if(flight.flightNumReturn() == flightNum) {
			int selection;
			boolean flag = true;
			int edflightNum = flight.flightNumReturn();
			String edairlineName = flight.airlineNameReturn();
			String eddeparture = flight.departureReturn();
			String edarrival = flight.arrivalReturn();
			String edflightTime = flight.flightTmeReturn();

			while(flag) {
				System.out.println("--Flight Information Edit Menu-- \n");
				System.out.println("1. Edit Flight Numer");
				System.out.println("2. Edit Airline");
				System.out.println("3. Edit Departure");
				System.out.println("4. Edit Arrival");
				System.out.println("5. Edit Flight Time");
				System.out.println("6. Exit");
				System.out.print("Select the menu between 1 - 6 : ");
				selection = input.nextInt();
				System.out.println();
				switch(selection) {
				case 1:
					System.out.print("Flight Number : ");
					edflightNum = input.nextInt();
					System.out.println();
					break;
				case 2:
					System.out.print("Airline : ");
					edairlineName = input.next();
					System.out.println();
					break;
				case 3:
					System.out.print("Departure : ");
					eddeparture = input.next();
					System.out.println();
					break;
				case 4:
					System.out.print("Arrival : ");
					edarrival = input.next();
					System.out.println();
					break;
				case 5:
					System.out.print("Flight Time : ");
					edflightTime = input.next();
					System.out.println();
					break;
				case 6:
					flag = false;
					break;
				}
				flight.flightEdit(edflightNum, edairlineName, eddeparture, edarrival, edflightTime);
			}
		}
	}
	
	//method "viewAllFight would be used when a lot of data are made
	public void viewAllFlight() {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		if(registration(flightNum) == false)
			return;
		System.out.println();
	}
	
	public void searchFlight() {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		if(registration(flightNum) == false)
			return;
		if(flight.flightNumReturn() == flightNum) {
			flight.printInfo();
		}
		System.out.println();
	}
	
	//method "registration" is used for checking that reference variable refer a instance
	public boolean registration(int flightNum) {
		if(flight == null || flight.flightNumReturn() != flightNum) {
			System.out.println("The Flight Information has not been registered \n");
			return false;
		}
		return true;
	}
}
