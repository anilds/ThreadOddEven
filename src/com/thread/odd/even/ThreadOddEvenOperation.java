package com.thread.odd.even;

import java.util.Scanner;

public class ThreadOddEvenOperation {

	/**
	 * @author Anil
	 * Description:create two threads, one print
		odd & other even numbers.
		Print even and odd number one by one using these two
		threads
	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer print = new Printer();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The number"); 
		int integervalue = input.nextInt();
        Thread t1 = new Thread(new TaskEvenOdd(print, integervalue,  false));
        Thread t2 = new Thread(new TaskEvenOdd(print, integervalue, true));
        t1.start();
        t2.start();
    }


}
