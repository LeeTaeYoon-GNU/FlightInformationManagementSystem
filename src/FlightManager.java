import java.util.Scanner;

public class FlightManager {
	Flight flight;
	Scanner input;
	FlightManager(Scanner input) {
		this.input = input;
	}
	
	public void uploadFlight() {
		System.out.println("Flight Number : ");
		int flightNum = input.nextInt();
		System.out.println("Airline : ");
		String airlineName = input.next();
		System.out.println("Departure : ");
		String departure = input.next();
		System.out.println("Arrival : ");
		String arrival = input.next();
		System.out.println("Flight Time : ");
		String flightTime = input.next();
		flight = new Flight(flightNum, airlineName, departure, arrival, flightTime);
		flight.printInfo();
	}
	public void deleteFlight() {
		System.out.println("Flight Number : ");
		int flightNum = input.nextInt();
		if(registration() == false)
			return;
		if(flight.flightNumReturn() == flightNum) {
			flight = null;
			System.out.println("The Flight Information is deleted");
		}
	}
	public void editFlight() {
		System.out.println("Flight Number : ");
		int flightNum = input.nextInt();
		if(registration() == false)
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
				switch(selection) {
				case 1:
					System.out.println("Flight Number : ");
					edflightNum = input.nextInt();
					break;
				case 2:
					System.out.println("Airline : ");
					edairlineName = input.next();
					break;
				case 3:
					System.out.println("Departure : ");
					eddeparture = input.next();
					break;
				case 4:
					System.out.println("Arrival : ");
					edarrival = input.next();
					break;
				case 5:
					System.out.println("Flight Time : ");
					edflightTime = input.next();
					break;
				case 6:
					flag = false;
					break;
				}
				flight.flightEdit(edflightNum, edairlineName, eddeparture, edarrival, edflightTime);
			}
		}
	}
	public void viewAllFlight() {
		System.out.println("Flight Number : ");
		int flightNum = input.nextInt();
		if(registration() == false)
			return;
	}
	public void searchFlight() {
		System.out.println("Flight Number : ");
		int flightNum = input.nextInt();
		if(registration() == false)
			return;
		if(flight.flightNumReturn() == flightNum) {
			flight.printInfo();
		}
	}
	
	public boolean registration() {
		if(flight == null) {
			System.out.println("The Flight Information has not been registered");
			return false;
		}
		return true;
	}

}
