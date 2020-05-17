package exception;

public class ReadFlightTimeException extends Exception {
	public ReadFlightTimeException() {
		super("Incorrect format of flight time.");
	}
}
