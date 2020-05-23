package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler fileHandler;
	LogManager logManager;
	Logger logger;
	
	public EventLogger(String fileName) {
		try {
			logManager = LogManager.getLogManager();
			logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			fileHandler = new FileHandler(fileName, true);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No");
			e.printStackTrace();
		}
	}
	
	public void startLog() {
		logger.info("---------------------------Program Start---------------------------");
	}
	
	public void endLog() {
		logger.info("---------------------------Program End-----------------------------" + "\n");
	}
	
	public void log(String logMessage) {
		logger.info(logMessage);
	}
}
