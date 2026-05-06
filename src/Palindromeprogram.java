
public class Palindromeprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String original = "anuguna";
        
        // 1. Reverse the string using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();
		System.out.println("the reverse string changed " + reversed);	
        // 2. Compare the original with the reversed version
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
        
        
        
        
        String s="anuguna";
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
	}
		System.out.println("the reverse string changed " + rev);	
		
		if (s.equals(rev))
		{
			System.out.println("the  string Palindrome " );
		}
	
		else
			
		{
			System.out.println("the  string is not Palindrome  " );
		}
		System.out.println("the new code is adding for testing purpose " );	
	}

}
