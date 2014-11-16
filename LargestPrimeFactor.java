/*
 * Solution to Largest Prime Factor of 600851475143
 */
/**
 *
 * @author Mike McGee 
 */
public class LargestPrimeFactor {
    
    
    static long LargestPrime()
    {
        long p = 600851475143L;
        long m = 3L;
    
        while(Math.sqrt(m) < p)
        {
            long j= (p % m);
            
            if(j ==0 )
            {
                p = (p / m);

                m = m + 2;
            } 
        
            m = m + 2;

        }
        
        return m-4;
    }
    
}
