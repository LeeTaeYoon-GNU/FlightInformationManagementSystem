package Flight;

import java.util.Scanner;
 
public class Flight {
	protected FlightKind kind;
	protected int flightNum;
	protected String airlineName;
	protected String departure;
	protected String arrival;
	protected String flightTime;
	 
	public Flight() {
	}
	
	public Flight(FlightKind kind) {
		this.kind = kind;
	}
	
	public Flight(int flightNum, String airlineName, String departure, String arrival, String flightTime) {
		this.flightNum = flightNum;
		this.airlineName = airlineName;
		this.departure = departure;
		this.arrival = arrival;
		this.flightTime = flightTime;
	}
	
	public FlightKind getKind() {
		return kind;
	}
	
	public void setKind(FlightKind kind) {
		this.kind = kind;
	}

	public int getFlightNum() {
		return flightNum;
	}
	
	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}
	
	public String getAirlineName() {
		return airlineName;
	}
	
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	
	public String getDeparture() {
		return departure;
	}
	
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	
	public String getArrival() {
		return arrival;
	}
	
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	
	public String getFlightTme() {
		return flightTime;
	}
	
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	
	public void printInfo() {
		String fkind = "None";
		switch(this.kind) {
		case DomesticFlight:
			fkind = "DomesticFlight";
			break;
		case InternationalFlight:
			fkind = "InternationalFlight";
		default:
			break;
		}
		System.out.println("FlightKind : " + fkind + "/ Flight Number : " + flightNum + "/ AirLine : " + airlineName + "/ Departure : " + departure + "/ Arrival : " + arrival + "/ Flight Time : " + flightTime);
	}
	
	//for editing Domestic Flight
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
			System.out.println("6. Exit");
			System.out.print("Select the menu between 1 - 6 : ");
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
				flag = false;
				break;
			}
		}
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		this.setFlightNum(flightNum);
		
		System.out.print("Airline : ");
		String airlineName = input.next();
		this.setAirlineName(airlineName);
		
		System.out.print("Departure : ");
		String departure = input.next();
		this.setDeparture(departure);
		
		System.out.print("Arrival : ");
		String arrival = input.next();
		this.setArrival(arrival);
		
		System.out.print("Flight Time : ");
		String flightTime = input.next();
		this.setFlightTime(flightTime);
	}
}
