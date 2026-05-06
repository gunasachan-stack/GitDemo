
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{100,200},
					{300,400},
					{500,600}
					};
		
		//System.out.print(a[1][1]);
		
		for (int r=0;r<=2;r++)
		{
			for (int c=0;c<=1;c++)
			{
				System.out.print(a[r][c] + " " );
			}
		}
		
		
		for (int array[]:a)
			
		{
			for (int x:array)
				
			{
				System.out.print(" ");
				System.out.print(x+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
