package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.service.BalancingBrackets;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BalancingBrackets bb = new BalancingBrackets();
		
		String brackets;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Expression ->");
		brackets = sc.next();
		
		if(bb.Balanced(brackets))
			System.out.println("The entered String has Balanced Brackets");
		
		else
			System.out.println("The entered String do not contain Balanced Brackets");
		
		
		sc.close();

	}

}
