/**
 * 
 */
package com.bridgeLabz;

/**
 * @author mshub
 *
 */
public class fibonacciNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int f=1;
		int n=7;
		int s=1;
		int t;
		System.out.println(f);
		System.out.println(s);
		for(int i=3; i <= n; i++) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}
	}

}
