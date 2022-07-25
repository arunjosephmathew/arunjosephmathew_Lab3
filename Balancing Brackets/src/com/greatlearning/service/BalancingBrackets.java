package com.greatlearning.service;

import java.util.Stack;

public class BalancingBrackets {
	
	public boolean Balanced(String brackets) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0 ; i < brackets.length(); i++) {
			char x = brackets.charAt(i);
			
			if(x == '(' || x == '{' || x == '[') {
				stack.push(x);  //For Pushing the element to stack
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char check;
			switch(x) {
			
			case ')' :
				check = stack.pop();
				if(check == '{' || check == '[')
					return false;
				break;
				
			case '}' : 
				check = stack.pop();
				if(check == '(' || check == '[')
					return false;
				break;
				
			case ']' : 
				check = stack.pop();
				if(check == '(' || check == '{')
					return false;
				break;
			}
		}
		
		return (stack.isEmpty());  // To check empty Stack
	}

}
