import java.util.ArrayList;
import java.util.Scanner;

import Flight.Flight;
import Flight.FlightKind;
import Flight.InternationalFlight;

public class FlightManager {
	ArrayList<Flight> flights = new ArrayList<Flight>();
	Scanner input;
	FlightManager(Scanner input) {
		this.input = input;
	}
	
	public void uploadFlight() {
		int kind = 0;
		Flight flight;
		
		//you can choose between Domestic flight and International flight
		while(kind != 1 && kind != 2) {
			System.out.println("--Kind of Flight--");
			System.out.println("1. Domestic Flight");
			System.out.println("2. International Flight");
			System.out.print("Select between 1 - 2 : ");
			kind = input.nextInt();
			System.out.println();
			  
			switch(kind) {
			case 1:
				flight = new Flight(FlightKind.DomesticFlight);
				flight.getUserInput(input);
				flight.printInfo();
				System.out.println();
				flights.add(flight);
				break;
			case 2:
				flight = new InternationalFlight(FlightKind.InternationalFlight);
				flight.getUserInput(input);
				flight.printInfo();
				System.out.println();
				flights.add(flight);
				break;
			default :
				System.out.println("Select again...");
				System.out.println();
			}
		}
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
			flights.get(index).getUserEdit(input);
			return;
		}
		else {
			System.out.println("The Flight Information has not been registered \n");
			return;
		}
	}
	
	//this method show all flight information.
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
	
	//if there is same flightNum from user in collection, than return the index of it. 
	public int indexChecker(ArrayList<Flight> flights, int flightNum) {
		int index = -1;
		for(int i = 0; i < flights.size(); i++) {
			if(flights.get(i).getFlightNum() == flightNum) {
				index = i;
				break;
			}
		}
		return index;
	}
}
