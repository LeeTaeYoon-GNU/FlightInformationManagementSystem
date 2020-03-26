import java.util.Scanner;

public class FlightMenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int selection;
		boolean flag = true;

		while(flag) {
			System.out.println("----Flight Information Menu---- \n");
			System.out.println("1. Upload Flight");
			System.out.println("2. Delete Flight");
			System.out.println("3. Edit Flight");
			System.out.println("4. View All Flight");
			System.out.println("5. Search Flight");
			System.out.println("6. Exit");
			System.out.print("Select the menu between 1 - 6 : ");
			selection = input.nextInt();
			switch(selection) {
			case 1:
				uploadFlight();
				break;
			case 2:
				deleteFlight();
				break;
			case 3:
				editFlight();
				break;
			case 4:
				viewAllFlight();
				break;
			case 5:
				searchFlight();
				break;
			case 6:
				flag = false;
				break;
			}			
		}
	}
	
	public static void uploadFlight() {
		Scanner input = new Scanner(System.in);
		System.out.println("Flight Number : ");
		String flightNum = input.next();
		System.out.println("Airline : ");
		String airlineName = input.next();
		System.out.println("Departure : ");
		String departure = input.next();
		System.out.println("Arrival : ");
		String arrival = input.next();
		System.out.println("Flight Time : ");
		String flightTime = input.next();
		System.out.println("Flight Number : " + flightNum + "/ AirLine : " + airlineName + "/ Departure : " + departure + "/ Arrival : " + arrival + "/ Flight Time : " + flightTime);
	}
	public static void deleteFlight() {
		Scanner input = new Scanner(System.in);
		System.out.println("Flight Number : ");
		String flightNum = input.next();
	}
	public static void editFlight() {
		Scanner input = new Scanner(System.in);
		System.out.println("Flight Number : ");
		String flightNum = input.next();
	}
	public static void viewAllFlight() {
		Scanner input = new Scanner(System.in);
		System.out.println("Flight Number : ");
		String flightNum = input.next();
	}
	public static void searchFlight() {
		Scanner input = new Scanner(System.in);
		System.out.println("Flight Number : ");
		String flightNum = input.next();
	}
}