
public class StringCompressionprogram {

	public static void main(String[] args) {
		 String input = "aaabbc";
	        String result = "";
	        int count = 1;

	        for (int i = 0; i < input.length(); i++) {
	            // Check if the current character is the same as the next one
	            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
	                count++;
	            } else {
	                // If the next character is different, add the char and count to result
	                result = result + input.charAt(i) + count;
	                count = 1; // Reset count for the next unique character
	            }
	        }

	        System.out.println("Compressed: " + result);

	}

}
