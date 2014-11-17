/*
 * Finds largest palindrome that is product of two equal digit numbers 
 * Can't go over 9 digit numbers or you will get overflow 
 */
/**
 *
 * @author mike
 */
public class LargestPalindromeProduct {
    private final int numDigits; 
    
    public LargestPalindromeProduct (int numDigits)
    {
        this.numDigits = numDigits; 
    }
    
    public long solve()
    {
       int largestNum = (int)Math.pow(10, numDigits) -1; 
       int largestProduct = 0; 
       
       for(int a = largestNum; a > 0; a--)
       {
           for(int b = largestNum; b > 0; b-- )
           {
               if(isPalindrome(a * b))
               {
                   if(a*b > largestProduct)
                   {
                       largestProduct = a*b; 
                       System.out.println("A: "+a+ " B: "+b);
                       return largestProduct; //important 
                   }
               }
                   
           }
       }
       
       //if you get here it was impossible to find a palindrome (shouldn't happen)
       return 0; 
    }

    private boolean isPalindrome(int num) {
        int n = num;
	      int rev = 0;
	      int dig = 0;
		 
	      while (num > 0)
	      {
	          dig = num % 10;
	          rev = rev * 10 + dig;
	          num = num / 10;
	      }
		 
	      return ( n == rev );
        
        
    }
}
