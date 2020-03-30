
public class Flight {
	//information hiding
	private int flightNum;
	private	String airlineName;
	private	String departure;
	private	String arrival;
	private	String flightTime;
	
	public Flight() {
	}
	
	public Flight(int flightNum, String airlineName) {
		this.flightNum = flightNum;
		this.airlineName = airlineName;
	}
	
	public Flight(int flightNum, String airlineName, String departure, String arrival, String flightTime) {
		this.flightNum = flightNum;
		this.airlineName = airlineName;
		this.departure = departure;
		this.arrival = arrival;
		this.flightTime = flightTime;
	}
	
	public void printInfo() {
		System.out.println("Flight Number : " + flightNum + "/ AirLine : " + airlineName + "/ Departure : " + departure + "/ Arrival : " + arrival + "/ Flight Time : " + flightTime);
	}
	
	//for return each fields
	public int flightNumReturn() {
		return flightNum;
	}
	
	public String airlineNameReturn() {
		return airlineName;
	}
	
	public String departureReturn() {
		return departure;
	}
	
	public String arrivalReturn() {
		return arrival;
	}
	
	public String flightTmeReturn() {
		return flightTime;
	}
	
	//for edit
	public void flightEdit(int edflightNum, String edairlineName, String eddeparture, String edarrival, String edflightTime) {
		this.flightNum = edflightNum;
		this.airlineName = edairlineName;
		this.departure = eddeparture;
		this.arrival = edarrival;
		this.flightTime = edflightTime;
	}
}
