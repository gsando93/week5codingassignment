package week5codingassignment;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Logger logger = new AsteriskLogger();
logger.log("Hello"); 
Logger errorMessage = new AsteriskLogger();
errorMessage.error("Hello");
Logger loggerSpace = new SpacedLogger();
loggerSpace.log("Hello");
Logger loggerErrorSpace = new SpacedLogger();
loggerErrorSpace.error("Hello");
	}

}
