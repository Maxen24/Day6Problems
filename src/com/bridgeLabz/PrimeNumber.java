/**
 * 
 */
package com.bridgeLabz;

/**
 * @author mshub
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=8;
		boolean primeNumber=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				primeNumber=false;
		}
		}
		System.out.println(primeNumber);
	}

}
