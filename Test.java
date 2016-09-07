public class Test{
                     public static void main (String args [])
					 {
                     simplePattern();
					 System.out.println(" Pattern 2 ");
					 simplePattern2(7);
					 System.out.println(" Pattern 3 ");
					 simplePattern3(7);
					 
					 }
					 
					 public static void simplePattern(){

					   for(int i=1; i<=5;i++)
						 {
							 for(int j=1;j<=i;j++)
							 {
								      System.out.print("*");
							 }
							  System.out.println("");
						 }
					 }
					 
					 public static void  simplePattern2(int n)
					 {
						 for(int i=1; i<=n;i++)
						 {
							 for(int j=1;j<=i;j++)
							 {
								 System.out.print(j);
							 }
							     System.out.println();	
						 }		
	                 							 
					}
					
					public static void simplePattern3(int n)
					{
						for(int i=n;i>=1;i--)
						{
					
							for(int j=n;j>=i;j--){
								System.out.print(j);
							}
							 System.out.println("u");	
						}
					}
}



