package Flight;

import java.util.ArrayList;
import java.util.Scanner;

public class InternationalFlight extends Flight {
	//in contrast with "Flight.class", this class has two more fields
	private int transferTimes;
	private ArrayList<String> transferCities = new ArrayList<String>();
	
	public InternationalFlight() {
	}
	 
	public InternationalFlight(FlightKind kind) {
		super(kind);
	}
	
	public InternationalFlight(int flightNum, String airlineName, String departure, String arrival, String flightTime, int transferTime) {
		super(flightNum, airlineName, departure, arrival, flightTime);
		this.transferTimes = transferTime;
	}
	
	public int getTransferTime() {
		return transferTimes;
	}
	
	public void setTransferTime(int transferTime) {
		this.transferTimes = transferTime;
	}
	
	//for upload International Flight
	public void getUserInput(Scanner input) {
		setFlightFlightNum(input);
		
		setFlightAirlineName(input);
		
		setFlightDeparture(input);
		
		setFlightArrival(input);
		
		setFlightFlightTime(input);
		
		setFlightTransferTime_City(input);
	}
	
	//for editing International Flight
	public void getUserEdit(Scanner input) {
		int selection;
		boolean flag = true;

		while(flag) {
			showEditMenu();
			selection = input.nextInt();
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
				setFlightTransferTime_City(input);
				System.out.println();
				break;
			case 7:
				setFlightTransferCity(input);
				System.out.println();
				break;
			case 8:
				flag = false;
				break;
			}
		}
	}
	
	public void printInfo() {
		String fkind = "InternationalFlight";
		System.out.println("FlightKind : " + fkind + "/ Flight Number : " + flightNum + "/ AirLine : " + airlineName + "/ Departure : " + departure + "/ Arrival : " + arrival + "/ Flight Time : " + flightTime);
		System.out.print("/ TransferTimes : " + transferTimes + "/ Trnasfer City : ");
		showTransferCity(transferTimes);
	}
	
	public void showEditMenu() {
		System.out.println("--Flight Information Edit Menu-- \n");
		System.out.println("1. Edit Flight Numer");
		System.out.println("2. Edit Airline");
		System.out.println("3. Edit Departure");
		System.out.println("4. Edit Arrival");
		System.out.println("5. Edit Flight Time");
		System.out.println("6. Edit Transfer Times");
		System.out.println("7. Edit Transfer City");
		System.out.println("8. Exit");
		System.out.print("Select the menu between 1 - 8 : ");
	}
	
	//This method is used in prinfInfo method for prinfInfo method look concise
	public void showTransferCity(int transferTimes) {
		if(transferTimes == 0) 
			System.out.println("None");
		else {
			for(int i = 0; i < transferTimes; i++) {
				System.out.print(transferCities.get(i));
				if(i != (transferTimes - 1))
					System.out.print(", ");
			}
			System.out.println();
		}
	}
	
	//These methods below are defined because InternationalFlight class has more thing to save information than DomesticFlight class.
	public void setFlightTransferTime_City(Scanner input) {
		System.out.print("Transfer Time : ");
		int transferTime = input.nextInt();
		this.setTransferTime(transferTime);
		transferCities.clear();
		input.nextLine();
		for(int i = 0; i < transferTimes; i++) {
			System.out.print((i+1) + ". Transfer city : ");
			String edtransfer = input.nextLine();
			this.transferCities.add(edtransfer);
		}
	}
	
	public void setFlightTransferCity(Scanner input) {
		transferCities.clear();
		input.nextLine();
		for(int i = 0; i < transferTimes; i++) {
			
			System.out.print((i+1) + ". Transfer city : ");
			String edtransfer = input.nextLine();
			this.transferCities.add(edtransfer);
		}
	}
}
