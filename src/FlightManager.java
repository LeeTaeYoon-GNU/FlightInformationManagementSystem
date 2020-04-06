import java.util.ArrayList;
import java.util.Scanner;

public class FlightManager {
	ArrayList<Flight> flights = new ArrayList<Flight>();
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
		Flight flight = new Flight(flightNum, airlineName, departure, arrival, flightTime);		//initializing the fields by constructor
		flight.printInfo();
		System.out.println();
		flights.add(flight);
	}
	
	public void deleteFlight() {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		System.out.println();
		int index = indexChecker(flights, flightNum);
		if(index >= 0) {
			flights.remove(index);
			System.out.println("The Flight Information(Flight Number : " + flightNum + ") is deleted \n");
			return;
		}
		else {
			System.out.println("The Flight Information has not been registered \n");
			return;
		}
	}
	
	public void editFlight() {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		int index = indexChecker(flights, flightNum);
		System.out.println();
		if(index >= 0) {
			int selection;
			boolean flag = true;
			int edflightNum = flights.get(index).flightNumReturn();
			String edairlineName = flights.get(index).airlineNameReturn();
			String eddeparture = flights.get(index).departureReturn();
			String edarrival = flights.get(index).arrivalReturn();
			String edflightTime = flights.get(index).flightTmeReturn();

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
				flights.get(index).flightEdit(edflightNum, edairlineName, eddeparture, edarrival, edflightTime);
			}
			return;
		}
		else {
			System.out.println("The Flight Information has not been registered \n");
			return;
		}
	}
	
	//method "viewAllFight would be used when a lot of data are made
	public void viewAllFlights() {
		for(int i = 0; i < flights.size(); i++) {
			flights.get(i).printInfo();
		}
		System.out.println();
	}
	
	public void searchFlight() {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		System.out.println();
		int index = indexChecker(flights, flightNum);
		if(index >= 0) {
			flights.get(index).printInfo();
			System.out.println();
			return;
		}
		else {
			System.out.println("The Flight Information has not been registered \n");
			return;
		}
	}
	
	//method "registration" is used for checking that reference variable refer a instance
	public int indexChecker(ArrayList<Flight> flights, int flightNum) {
		int index = -1;
		for(int i = 0; i < flights.size(); i++) {
			if(flights.get(i).flightNumReturn() == flightNum) {
				index = i;
				break;
			}
		}
		return index;
	}
}
