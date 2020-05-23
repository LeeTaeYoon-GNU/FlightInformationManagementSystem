package flight;

import exception.*;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Flight implements FlightInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6157838527081530301L;
	
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
		boolean flag = true;
		while(flag) {
			try {
				System.out.print("Flight Number : ");
				int flightNum = readFlightNumber(input);
				this.setFlightNum(flightNum);
				flag = false;
			}
			catch(RangeOutOfBoundException e) {
				System.out.println();
				System.out.println(e.getMessage());
				System.out.println("Please put an positive Number!");
				System.out.println();
			}
			catch(InputMismatchException e) {
				if(input.hasNext()) {
					input.next();
				}
				System.out.println();
				System.out.println("Please put a Number!");
				System.out.println();
			}
		}
	}
	
	public void setFlightAirlineName(Scanner input) {
		System.out.print("Airline : ");
		String airlineName = input.next();
		this.setAirlineName(airlineName);
	}
	
	public void setFlightDeparture(Scanner input) {
		boolean flag = true;
		while(flag) {
			try {
				System.out.print("Departure : ");
				String departure = readCity(input);
				this.setDeparture(departure);
				flag = false;
			}
			catch(ReadCityException e) {
				System.out.println();
				System.out.println(e.getMessage());
				System.out.println("Please input city name!");
				System.out.println();
			}
		}
	}
	
	public void setFlightArrival(Scanner input) {
		boolean flag = true;
		while(flag) {
			try {
				System.out.print("Arrival : ");
				String arrival = readCity(input);
				this.setArrival(arrival);
				flag = false;
			}
			catch(ReadCityException e) {
				System.out.println();
				System.out.println(e.getMessage());
				System.out.println("Please input city name!");
				System.out.println();
			}
		}
	}
	
	public void setFlightFlightTime(Scanner input) {
		boolean flag = true;
		while(flag) {
			try {
				System.out.print("Flight Time : ");
				String flightTime = readFlightTime(input);
				this.setFlightTime(flightTime);
				flag = false;
			}
			catch(ReadFlightTimeException e) {
				System.out.println();
				System.out.println(e.getMessage());
				System.out.println("Please put Flight time contain \"h or H\", \"m or M\"!");
				System.out.println();
			}
		}
	}
	
	public abstract int readSelection(Scanner input) throws RangeOutOfBoundException, InputMismatchException;
	
	public int readFlightNumber(Scanner input) throws RangeOutOfBoundException, InputMismatchException {
		int flightNumber = input.nextInt();
		
		if(flightNumber < 0)
			throw new RangeOutOfBoundException();
		
		return flightNumber;
	}
	
	public String readCity(Scanner input) throws ReadCityException {
		String city = input.next();
		
		if(city.contains("0") || city.contains("1") || city.contains("2") || city.contains("3") || city.contains("4") || city.contains("5")
			|| city.contains("6") || city.contains("7") || city.contains("8") || city.contains("9"))
			throw new ReadCityException();
		
		return city;
	}
	
	public String readFlightTime(Scanner input) throws ReadFlightTimeException {
		String flightTime = input.next();
		
		if(!flightTime.contains("h") && !flightTime.contains("m") && !flightTime.contains("H") && !flightTime.contains("M")) 
			throw new ReadFlightTimeException();
		
		return flightTime;
	}
}