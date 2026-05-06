import java.util.Arrays;

public class Anagramprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Listen";
        String str2 = "Silent";

        // 1. Convert to lowercase so 'L' and 'l' match
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // 2. Check if lengths are the same
        if (str1.length() == str2.length()) {
            
            // 3. Convert strings to character arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            

            // 4. Sort the arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
            
        System.out.println( (charArray1));
         System.out.println((charArray2));

            // 5. If sorted arrays are equal, they are anagrams
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("They are anagrams.");
            } else {
                System.out.println("Not anagrams.");
            }
        } else {
            System.out.println("Not anagrams (different lengths).");
        }
	}

}
