package week5codingassignment;

public class SpacedLogger implements Logger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(String log) {

for (int i = 0; i < log.length(); i++) {
	System.out.print(log.charAt(i) + " ");
}
	}

	@Override
	public void error(String error) {
		System.out.print("\nError: ");
		for (int i = 0; i < error.length(); i++) {
			System.out.print(error.charAt(i) + " ");
		
	}
	}
}
