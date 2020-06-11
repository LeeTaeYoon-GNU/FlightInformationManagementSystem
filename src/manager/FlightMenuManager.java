package manager;
import exception.RangeOutOfBoundException;
import gui.WindowFrame;
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
		logger.startLog();		//프로그램이 시작할 때를 기록
		
		Scanner input = new Scanner(System.in);
		FlightManager flightManager = getObject("flightmanager.ser");		//파일에서 객체 가져오기
		if(flightManager == null)
			flightManager = new FlightManager(input);
		else
			flightManager.setScanner(input);
		
		WindowFrame frame = new WindowFrame(flightManager);
		selectMenu(input, flightManager);
		
		putObject(flightManager, "flightmanager.ser");
		logger.endLog();		//프로그램이 끝날 때를 기록
	}
	
	public static FlightManager getObject(String fileName) {
		FlightManager flightManager = null;
		
		//파일에서 객체 읽어들이기. 파일을 찾지 못했을 때 null값을 반환
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
		//파일에 객체 입력하기
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
					logger.log("Upload a FlightInformation");		//upload할 때 기록
					break;
				case 2:
					flightManager.deleteFlight();
					logger.log("Delete a FlightInformation");		//delete할 때 기록
					break;
				case 3:
					flightManager.editFlight();
					logger.log("Edit a FlightInformation");			//edit할 때 기록
					break;
				case 4:
					flightManager.viewAllFlights();
					logger.log("View a list of FlightInformation");	//view할 때 기록
					break;
				case 5:
					flightManager.searchFlight();
					logger.log("Search a FlightInformation");		//search할 때 기록
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