import java.sql.Array;
import java.util.Arrays;
public class Reversearry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="guna";
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
	}
		System.out.println("the reverse string changed " + rev);	
		
		
}
	
}
