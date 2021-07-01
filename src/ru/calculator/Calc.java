package ru.calculator;

import java.util.Scanner;

public class Calc {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args) {
		
	}
	
	public static int getInt() {
		System.out.print("Input integer number");
		int num;
		if(sc.hasNextInt()) {
			num = sc.nextInt();
		}else {
			System.out.println("Input only integer number");
			sc.next();
			num=getInt();
		}
		return num;
	} 
	
	public static char getOperation() {
		System.out.print("Input operation +,-,*,/"){
			
		}
	}
	
	public static int calc() {
		
	}
	
}
