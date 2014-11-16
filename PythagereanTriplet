/*
 * Class that solves the pythagerean triplet 
 * a^2 + b^2 = c^2 
 * where a < b < c
 * and a + b + c = 1000; 
 * 
 * Finds the product of a*b*c
 */
/**
 *
 * @author mike
 */

public class PythageranTriplet {
    private static int c; 
    private static int a; 
    private static int b; 

    
    
    public static int solve(int sum)
    {
        a = 1; 
        b = 1; 
        
        while(true){
            c = sum - a - b; 

            if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
               break;   
            }

            else if (a < b-1)
            {
                a++;
                
            }

            else{
                a = 0; 
                b++;
                c = b+1; 
            }
        }
        
        System.out.println("A: " +a+ " B: " +b+  " C: "+c);
        return a*b*c; 
    }

}
