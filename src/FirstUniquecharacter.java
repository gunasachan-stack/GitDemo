
public class FirstUniquecharacter {

	public static void main(String[] args) {
		  String input = "stress";
	        
	        boolean found = false;
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            
	            // If first occurrence index is same as last occurrence index, it's unique
	            if (input.indexOf(c) == input.lastIndexOf(c)) {
	                System.out.println("First non-repeating character is: " + c);
	                found = true;
	                break; // Stop at the very first one we find
	            }
	        }

	        if (!found) {
	            System.out.println("No unique character found.");
	        }

	}

}
