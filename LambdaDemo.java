package com.difault_lambda_exmp;

import java.util.Scanner;

@FuncgtionalInterface
interface Calculater {
	double getSquareAndCube(int num);
}

public class LambdaDemo {

	public static void main(String[] args) {
		Calculater cal = num ->
		{
			if(num <= 0) {
				return -1;
			}
			else if(num % 2 == 0) {
				return (num*num);
			}
			else {
				return (num*num*num);
			}
		};
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number :");
		
		int no = sc.nextInt();
		
		System.out.println(cal.getSquareAndCube(no));
	}

}
