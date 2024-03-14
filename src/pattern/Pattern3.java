package pattern;

public class Pattern3 {
	//hollow square
    public static void main(String[]args)
    {
    	int n=4;
    	// outer loop to handle number of rows
    	for(int i=0;i<n;i++)
    	{
    	//  inner loop to handle number of columns
    		for( int j=0;j<n;j++)
    		{
    			// star will print only when  it is in first
                // row or last row or first column or last
                // column
    			if(i==0 ||j==0 || i==n-1|| j==n-1)
    			{
    				System.out.print("*");
    			}
    			else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
}
