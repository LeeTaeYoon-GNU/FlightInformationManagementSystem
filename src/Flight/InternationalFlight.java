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
	
	public void printInfo() {
		super.printInfo();
		System.out.print("/ TransferTimes : " + transferTimes + "/ Trnasfer City : ");
		for(int i = 0; i < transferTimes; i++) {
			System.out.print(transferCities.get(i));
			if(i != (transferTimes - 1))
				System.out.print(", ");
		}
		System.out.println();
	}
	
	//for editing International Flight
	public void getUserEdit(Scanner input) {
		int selection;
		boolean flag = true;

		while(flag) {
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
			selection = input.nextInt();
			System.out.println();
			switch(selection) {
			case 1:
				System.out.print("Flight Number : ");
				int edflightNum = input.nextInt();
				this.setFlightNum(edflightNum);
				System.out.println();
				break;
			case 2:
				System.out.print("Airline : ");
				String edairlineName = input.next();
				this.setAirlineName(edairlineName);
				System.out.println();
				break;
			case 3:
				System.out.print("Departure : ");
				String eddeparture = input.next();
				this.setDeparture(eddeparture);
				System.out.println();
				break;
			case 4:
				System.out.print("Arrival : ");
				String edarrival = input.next();
				this.setArrival(edarrival);
				System.out.println();
				break;
			case 5:
				System.out.print("Flight Time : ");
				String edflightTime = input.next();
				this.setFlightTime(edflightTime);
				System.out.println();
				break;
			case 6:
				System.out.print("Transfer Time : ");
				int edtransferTimes = input.nextInt();
				this.setTransferTime(edtransferTimes);
				transferCities.clear();
				input.nextLine();
				for(int i = 0; i < transferTimes; i++) {
					System.out.print((i+1) + ". Transfer city : ");
					String edtransfer = input.nextLine();
					this.transferCities.add(edtransfer);
				}
				System.out.println();
				break;
			case 7:
				transferCities.clear();
				input.nextLine();
				for(int i = 0; i < transferTimes; i++) {
					
					System.out.print((i+1) + ". Transfer city : ");
					String edtransfer = input.nextLine();
					this.transferCities.add(edtransfer);
				}
				System.out.println();
				break;
			case 8:
				flag = false;
				break;
			}
		}
	}
	
	public void getUserInput(Scanner input) {
		super.getUserInput(input);
		System.out.print("Transfer Times : ");
		int transferTimes = input.nextInt();
		input.nextLine();
		this.setTransferTime(transferTimes);
		for(int i = 0; i < transferTimes; i++) {
			System.out.print((i+1) + ". Transfer city : ");
			String transfer = input.nextLine();
			this.transferCities.add(transfer);
		}
	}
}
