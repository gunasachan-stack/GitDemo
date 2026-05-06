
public class spacecountprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Hello Java";
        
        // Count everything including spaces
        int total = str.length();
        
        // Count only letters (ignores spaces)
        int totalNoSpaces = str.replace(" ", "").length();

        System.out.println("Total length: " + total);
        System.out.println("Total (no spaces): " + totalNoSpaces);
        
        //second program to check the repeated character
        String str1 = "java programming";
        char target = 'a'; // The character we want to count
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == target) {
                count++;
            }
        }
        
        System.out.println("The character '" + target + "' appears " + count + " times.");
   
        
        // Write a easy java program to remove repeated characters while maintaining the original order.
	
        String input = "banana";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
           // System.out.println("Original: " + letter);
          
            // indexOf checks if the letter is already in our result string
            // If it returns -1, it means the letter is NOT there yet
            if (result.indexOf(letter) == -1)
            {
                result = result + letter; 
                System.out.println("letter:  " + letter);
                System.out.println("result:  " + result);
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Cleaned:  " + result);
	
	}

}
