import exception.RangeOutOfBoundException;
import log.EventLogger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FlightMenuManager {
	 static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		logger.startLog();
		
		Scanner input = new Scanner(System.in);
		FlightManager flightManager = getObject("flightmanager.ser");
		if(flightManager == null)
			flightManager = new FlightManager(input);
		else
			flightManager.setScanner(input);
		
		selectMenu(input, flightManager);
		
		putObject(flightManager, "flightmanager.ser");
		logger.endLog();
	}
	
	public static FlightManager getObject(String fileName) {
		FlightManager flightManager = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			flightManager = (FlightManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return flightManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return flightManager;
	}
	
	public static void putObject(FlightManager flightManager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(flightManager);
			
			out.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void selectMenu(Scanner input, FlightManager flightManager) {
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
					logger.log("Upload a FlightInformation");
					break;
				case 2:
					flightManager.deleteFlight();
					logger.log("Delete a FlightInformation");
					break;
				case 3:
					flightManager.editFlight();
					logger.log("Edit a FlightInformation");
					break;
				case 4:
					flightManager.viewAllFlights();
					logger.log("View a list of FlightInformation");
					break;
				case 5:
					flightManager.searchFlight();
					logger.log("Search a FlightInformation");
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