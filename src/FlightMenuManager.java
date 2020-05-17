import exception.RangeOutOfBoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FlightMenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FlightManager flightManager = new FlightManager(input);
		int selection;
		boolean flag = true;
		 
		while(flag) {
			try {
				showMenu();
				selection = readSelection(input);
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
					System.out.println("Thank you for using. Good Bye~!");
					flag = false;
					break;
				}
			}
			catch(RangeOutOfBoundException e) {
				System.out.println();
				System.out.println(e.getMessage());
				System.out.println("Select again between 1 - 6");
				System.out.println();
			}
			catch(InputMismatchException e) {
				if(input.hasNext()) {
					input.next();
				}
				System.out.println();
				System.out.println("Please put an Integer! Select again between 1 - 6");
				System.out.println();
			}
		}
	}
	
	public static void showMenu () {
		System.out.println("----Flight Information Menu---- \n");
		System.out.println("1. Upload Flight");
		System.out.println("2. Delete Flight");
		System.out.println("3. Edit Flight");
		System.out.println("4. View All Flights");
		System.out.println("5. Search Flight");
		System.out.println("6. Exit");
		System.out.print("Select the menu between 1 - 6 : ");
	}
	
	public static int readSelection(Scanner input) throws RangeOutOfBoundException, InputMismatchException {
		int selection = input.nextInt();
		
		if(selection < 1 || selection > 6)
			throw new RangeOutOfBoundException();
		
		return selection;
	}
}