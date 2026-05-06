
public class stringcontainsonlydigitsprogram {

	public static void main(String[] args) {
		 String input = "12345";

	        if (input.matches("[0-9]+")) {
	            System.out.println("Contains only digits.");
	        } else {
	            System.out.println("Contains non-numeric characters.");
	        }

	}

}
