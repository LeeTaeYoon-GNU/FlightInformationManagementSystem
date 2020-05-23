import java.io.Serializable;
import java.util.ArrayList;
import exception.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import flight.*;

public class FlightManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7051880496811112802L;
	
	ArrayList<FlightInput> flights = new ArrayList<FlightInput>();
	transient Scanner input;
	FlightManager(Scanner input) {
		this.input = input;
	}
	
	public void uploadFlight() {
		int kind = 0;
		
		//you can choose between Domestic flight and International flight
		while(kind != 1 && kind != 2) {
			try {
				showKindMenu();
				kind = readKind(input);
				System.out.println();

				switch(kind) {
				case 1:
					uploadDomestic();
					break;
				case 2:
					uploadInternational();
					break;
				}
			}
			catch(RangeOutOfBoundException e) {
				System.out.println();
				System.out.println(e.getMessage());
				System.out.println("Select again between 1 - 2");
				System.out.println();
			}
			catch(InputMismatchException e) {
				if(input.hasNext()) {
					input.next();
				}
				System.out.println();
				System.out.println("Please put an Integer! Select again between 1 - 2");
				System.out.println();
			}
		}
	}
	
	public void deleteFlight() {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		System.out.print("Airline : ");
		String airline = input.next();
		System.out.println();
		int index = findIndex(flightNum, airline);
		removeFromFlights(index, flightNum);
		return;
	}
	
	public void editFlight() {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		System.out.print("Airline : ");
		String airline = input.next();
		int index = findIndex(flightNum, airline);
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
		System.out.print("Airline : ");
		String airline = input.next();
		System.out.println();
		int index = findIndex(flightNum, airline);
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
	
	//These method are used for structure of code looking concise.
	public void showKindMenu() {
		System.out.println("--Kind of Flight--");
		System.out.println("1. Domestic Flight");
		System.out.println("2. International Flight");
		System.out.print("Select between 1 - 2 : ");
	}
	
	public void uploadDomestic() {
		FlightInput flightInput;
		flightInput = new DomesticFlight(FlightKind.DomesticFlight);
		flightInput.getUserInput(input);
		flightInput.printInfo();
		System.out.println();
		flights.add(flightInput);
	}
	
	public void uploadInternational() {
		FlightInput flightInput;
		flightInput = new InternationalFlight(FlightKind.InternationalFlight);
		flightInput.getUserInput(input);
		flightInput.printInfo();
		System.out.println();
		flights.add(flightInput);
	}
	
	public int removeFromFlights(int index, int flightNum) {
		if(index >= 0) {
			flights.remove(index);
			System.out.println("The Flight Information(Flight Number : " + flightNum + ") is deleted \n");
			return 1;
		}
		else {
			System.out.println("The Flight Information has not been registered \n");
			return -1;
		}
	}
	
	//if there is same flightNum from user in collection, then return the index of it. 
	public int findIndex(int flightNum, String airline) {
		int index = -1;
		for(int i = 0; i < flights.size(); i++) {
			if(flights.get(i).getFlightNum() == flightNum && airline.equals(flights.get(i).getAirlineName())) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int readKind(Scanner input) throws RangeOutOfBoundException, InputMismatchException {
		int kind = input.nextInt();
		
		if(kind < 1 || kind > 2)
			throw new RangeOutOfBoundException();
		
		return kind;
	}
	
	public void setScanner(Scanner input) {
        this.input = input;
    }
}