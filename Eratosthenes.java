/**
 * 
 */
package concepts;

import java.util.Arrays;

/**
 * @author monikapatel
 *
 */
public class Eratosthenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sieveOfEratos(100);

	}
	
	static void sieveOfEratos(int limit) {
		
		boolean[] primes = new boolean[limit +1];
		Arrays.fill(primes, true);
		primes[0]=false;
		primes[1]=false;
		
		
		for(int i =2;i*i<=limit;i++){
			if(primes[i]) {
				for (int j = i*i; j<primes.length;j+=i) {
					primes[j]=false;

				}//j
			}//if
			
		}//i
		for (int i = 2; i <= limit; i++)
        {
            if (primes[i] == true)
                System.out.print(i + " ");
        }
	}

}
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
