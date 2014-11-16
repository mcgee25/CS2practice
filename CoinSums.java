/**
 * Solution to project Coin Sums problem 
 * 
 * 
 * /


/**
 *
 * @author Mike McGee 
 */
public class CoinSums {
    //class to solve coin sums problem 
    int target;
    
    int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
    

    public CoinSums(int target) {
        this.target = target;
    }
    
    
    
    public int solveTarget(){
        int[] ways = new int[target+1];
        ways[0] = 1;
 
        for (int i = 0; i < coinSizes.length; i++)
        {
            for (int j = coinSizes[i]; j <= target; j++) 
            {
                ways[j] += ways[j - coinSizes[i]];
            }
        }
        
        return ways[ways.length-1];
    }
    
    
    public static void main(String args[])
    {
        // Start the clock.	
	      long start = System.currentTimeMillis();
		
	      CoinSums cs = new CoinSums(200); 
              int nResult = cs.solveTarget(); 
		
		
	      long end = System.currentTimeMillis();
	      // Print out the time it took.
	      System.out.println("Took "+(end-start)+" ms. with the result="+nResult);
    }
    
}
