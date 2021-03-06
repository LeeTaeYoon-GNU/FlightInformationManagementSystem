package flight;

import exception.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DomesticFlight extends Flight {

	public DomesticFlight() {
	}
	 
	public DomesticFlight(FlightKind kind) {
		super(kind);
	}
	
	public DomesticFlight(int flightNum, String airlineName, String departure, String arrival, String flightTime) {
		super(flightNum, airlineName, departure, arrival, flightTime);
	}
	
	//for upload Domestic Flight
	public void getUserInput(Scanner input) {
		setFlightFlightNum(input);
		
		setFlightAirlineName(input);
		
		setFlightDeparture(input);
		
		setFlightArrival(input);
		
		setFlightFlightTime(input);
	}
	
	//for editing Domestic Flight
	public void getUserEdit(Scanner input) {
		int selection;
		boolean flag = true;

		while(flag) {
			try {
				showEditMenu();
				selection = readSelection(input);
				System.out.println();
				switch(selection) {
				case 1:
					setFlightFlightNum(input);
					System.out.println();
					break;
				case 2:
					setFlightAirlineName(input);
					System.out.println();
					break;
				case 3:
					setFlightDeparture(input);
					System.out.println();
					break;
				case 4:
					setFlightArrival(input);
					System.out.println();
					break;
				case 5:
					setFlightFlightTime(input);
					System.out.println();
					break;
				case 6:
					flag = false;
					break;
				}
			}
			catch(RangeOutOfBoundException e) {
				System.out.println();
				System.out.println(e.getMessage());
				System.out.println("Select again between 1 - 6");
				System.out.println();
			}
			catch(InputMismatchException e) {
				if(input.hasNext()) {
					input.next();
				}
				System.out.println();
				System.out.println("Please put an Integer! Select again between 1 - 6");
				System.out.println();
			}
		}
	}
	
	public void printInfo() {
		String fkind = "DomesticFlight";
		System.out.println("FlightKind : " + fkind + "/ Flight Number : " + flightNum + "/ AirLine : " + airlineName + "/ Departure : " + departure + "/ Arrival : " + arrival + "/ Flight Time : " + flightTime);
	}

	public void showEditMenu() {
		System.out.println("--Flight Information Edit Menu-- \n");
		System.out.println("1. Edit Flight Numer");
		System.out.println("2. Edit Airline");
		System.out.println("3. Edit Departure");
		System.out.println("4. Edit Arrival");
		System.out.println("5. Edit Flight Time");
		System.out.println("6. Exit");
		System.out.print("Select the menu between 1 - 6 : ");
	}
	
	public int readSelection(Scanner input) throws RangeOutOfBoundException, InputMismatchException {
		int selection = input.nextInt();
		
		if(selection < 1 || selection > 6)
			throw new RangeOutOfBoundException();
		
		return selection;
	}
}
