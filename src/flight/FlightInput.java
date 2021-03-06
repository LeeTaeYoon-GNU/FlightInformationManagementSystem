package flight;

import java.util.Scanner;

public interface FlightInput {
	
	public int getFlightNum();
	
	public String getAirlineName();
	
	//Classes named DomesticFlight and InternationlFlight implement these methods below respectively
	public void printInfo();
	
	public void getUserEdit(Scanner input);
	
	public void getUserInput(Scanner input);

	
	public void setFlightNum(int parseInt);

	public void setDeparture(String text);

	public void setAirlineName(String text);

	public void setArrival(String text);

	public void setFlightTime(String text);
}