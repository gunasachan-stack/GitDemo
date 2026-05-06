import java.util.Arrays;

public class mutablevsimmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int is mutable
   int a[]= {10,80,70,50};
   System.out.println("the  array  " + Arrays.toString(a));	
   Arrays.sort(a);
   System.out.println("the  array  " + Arrays.toString(a));	
   
   //string immutable
   String s="java";
   System.out.println("the  string  " +s);	
   s.concat("welcome");
   System.out.println("the  string is not concatenated " +s);	
   
   //using string buffer 
   StringBuffer s1= new StringBuffer("welcome");
   s1.append("to java string buffer");
		   System.out.println("the  string  " +s1);
	
		 //using string builder 
		   StringBuilder s2= new StringBuilder("welcome");
		   s2.append("to java  string builder ");
				   System.out.println("the  string  " +s2);	 
		
	}

}
