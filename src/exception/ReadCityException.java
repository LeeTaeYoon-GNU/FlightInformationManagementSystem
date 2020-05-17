package exception;

public class ReadCityException extends Exception {
	public ReadCityException() {
		super("Incorrect city name.");
	}
}
