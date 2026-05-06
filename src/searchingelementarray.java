import java.sql.Array;
import java.util.Arrays;

public class searchingelementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c[]= {'B','F','A','G'};
		
		Arrays.sort(c);
		System.out.print("sorting char " + Arrays.toString(c));
		
		System.out.println(" ");
		
		String s[]= {"bindu","raja","nitin","guna","asha","boy"};
		
		Arrays.sort(s);
		System.out.println("sorting string " + Arrays.toString(s));
		
		int a[]= {100,300,500,800,900};
		
		for (int i=a.length-1;i>=0;i--)
		{
			//System.out.println(i);;
			System.out.println(a[i]);
			
			
		}
			
		String g="gunavathi";
		String rev= "";
		
		/*System.out.println("the  string is " + g);
		System.out.println("the lenght of string is " + g.length());
		//System.out.println("the length of string is " + g.length);
		
		for (int j=g.length()-1;j>=0;j--)
			
		{
			rev=rev+g.charAt(j);
			
		}
			
		System.out.println("the reverse string is " + rev);
		
		*/
		
		//2nd approve 
		
		char[] name =g.toCharArray();
		
		System.out.println(name);
		
		System.out.println("the lenght of string is " + name.length);
		
		for (int k=name.length-1;k>= 0;k--)
		{
			//System.out.println(k);
			rev=rev+name[k];
		
		}
	
		System.out.println("the reverse string changed " + rev);		
		
	}
}
