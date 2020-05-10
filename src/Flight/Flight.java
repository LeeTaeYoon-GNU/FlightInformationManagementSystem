package Flight;

import java.util.Scanner;

public abstract class Flight implements FlightInput{
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
	
	//abstract methods that are implemented in sub-class
	public abstract void getUserInput(Scanner input);
	public abstract void getUserEdit(Scanner input);
	public abstract void printInfo();
	
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
	
	
	public void setFlightFlightNum(Scanner input) {
		System.out.print("Flight Number : ");
		int flightNum = input.nextInt();
		this.setFlightNum(flightNum);
	}
	
	public void setFlightAirlineName(Scanner input) {
		System.out.print("Airline : ");
		String airlineName = input.next();
		this.setAirlineName(airlineName);
	}
	
	public void setFlightDeparture(Scanner input) {
		System.out.print("Departure : ");
		String departure = input.next();
		this.setDeparture(departure);
	}
	
	public void setFlightArrival(Scanner input) {
		System.out.print("Arrival : ");
		String arrival = input.next();
		this.setArrival(arrival);
	}
	
	public void setFlightFlightTime(Scanner input) {
		System.out.print("Flight Time : ");
		String flightTime = input.next();
		this.setFlightTime(flightTime);
	}
}