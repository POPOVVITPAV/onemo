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
		System.out.print("Input operation +,-,*,/");
		char operation;
		if(sc.hasNext()) {
			operation = sc.next().charAt(0);
		}else {
			sc.next();
			operation=getOperation();
		}
		return operation;
	}
	
	public static int calc(int num_1, int num_2, char operation) {
		int result;
		switch(operation) {
			case'+':
				result=num_1+num_2;
				break;
			case'-':
				result=num_1-num_2;
				break;
			case'*':
				result=num_1*num_2;
				break;
			case'/':
				result=num_1/num_2;
				break;
			default:
				System.out.print("Операция не распознана. Повторите ввод.");
				result = calc(num_1,num_2, getOperation());
			}
		return result;
	}
	
}
