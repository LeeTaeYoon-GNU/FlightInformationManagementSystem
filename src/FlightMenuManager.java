import java.util.Scanner;

public class FlightMenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FlightManager flightManager = new FlightManager(input);
		int selection;
		boolean flag = true;

		while(flag) {
			System.out.println("----Flight Information Menu---- \n");
			System.out.println("1. Upload Flight");
			System.out.println("2. Delete Flight");
			System.out.println("3. Edit Flight");
			System.out.println("4. View All Flights");
			System.out.println("5. Search Flight");
			System.out.println("6. Exit");
			System.out.print("Select the menu between 1 - 6 : ");
			selection = input.nextInt();
			System.out.println();
			switch(selection) {
			case 1:
				flightManager.uploadFlight();
				break;
			case 2:
				flightManager.deleteFlight();
				break;
			case 3:
				flightManager.editFlight();
				break;
			case 4:
				flightManager.viewAllFlights();
				break;
			case 5:
				flightManager.searchFlight();
				break;
			case 6:
				flag = false;
				break;
			}			
		}
	}
}