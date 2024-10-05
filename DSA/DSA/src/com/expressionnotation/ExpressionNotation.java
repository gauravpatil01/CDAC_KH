package com.expressionnotation;

import java.util.Stack;

public class ExpressionNotation {
	// helper method to perform the operations
	public static int calc(int a, int b, char operator) {
		switch (operator) {
		case '$':
			return (int) Math.pow(a, b);
		case '*':
			return a * b;
		case '+':
			return a + b;
		case '/':
			return a / b;
		case '%':
			return a % b;
		case '-':
			return a - b;
		}
		return 0;
	}

	// Solve Postfix Expression
	public static int solvePostfix(String post) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < post.length(); i++) {
			char sym = post.charAt(i);
			if (Character.isDigit(sym)) {
				String operand = Character.toString(sym);
				s.push(Integer.parseInt(operand));
			} else {
				int b = s.pop();
				int a = s.pop();
				int c = calc(a, b, sym);
				s.push(c);
			}
		}
		return s.pop();
	}

	// Solve Prefix Expression
	public static int solvePrefix(String pre) {
		Stack<Integer> s = new Stack<>();
		for (int i = pre.length() - 1; i >= 0; i--) {
			char sym = pre.charAt(i);
			if (Character.isDigit(sym)) {
				String operand = Character.toString(sym);
				s.push(Integer.parseInt(operand));
			} else {
				int a = s.pop();
				int b = s.pop();
				int c = calc(a, b, sym);
				s.push(c);
			}
		}
		return s.pop();
	}

	// Priority helper method
	public static int pri(char operator) {
		switch (operator) {
		case '$':
			return 10;
		case '*':
		case '/':
		case '%':
			return 7;
		case '+':
		case '-':
			return 3;
		}
		return 0;
	}

	// Convert Infix to Postfix
	public static String infixToPostFix(String infix) {
		Stack<Character> s = new Stack<>();
		StringBuilder post = new StringBuilder();
		for (int i = 0; i < infix.length(); i++) {
			char sym = infix.charAt(i);
			if (Character.isDigit(sym)) {
				post.append(sym);
			} else if (sym == '(') {
				s.push(sym);
			} else if (sym == ')') {
				while (!s.isEmpty() && s.peek() != '(') {
					post.append(s.pop());
				}
				s.pop();
			} else {
				while (!s.isEmpty() && pri(s.peek()) >= pri(sym)) {
					post.append(s.pop());
				}
				s.push(sym);
			}
		}
		while (!s.isEmpty()) {
			post.append(s.pop());
		}
		return post.toString();
	}

	// Convert Infix to Prefix
	public static String infixToPriFix(String infix) {
		Stack<Character> s = new Stack<>();
		StringBuilder pre = new StringBuilder();
		for (int i = infix.length() - 1; i >= 0; i--) {
			char sym = infix.charAt(i);
			if (Character.isDigit(sym)) {
				pre.append(sym);
			} else if (sym == ')') {
				s.push(sym);
			} else if (sym == '(') {
				while (!s.isEmpty() && s.peek() != ')') {
					pre.append(s.pop());
				}
				s.pop();
			} else {
				while (!s.isEmpty() && pri(s.peek()) > pri(sym)) {
					pre.append(s.pop());
				}
				s.push(sym);
			}
		}
		while (!s.isEmpty()) {
			pre.append(s.pop());
		}
		return pre.reverse().toString();
	}

	public static boolean isBalanced(String expr) {
		Stack<Character> s = new Stack<>();
		String open = "({[", close = ")}]";
		// 1. traverse expression from left to right
		for (int i = 0; i < expr.length(); i++) {
			char sym = expr.charAt(i);
			// 2. if opening is found push on stack
			if (open.indexOf(sym) != -1) {
				s.push(sym);
			}
			// 3.if closing is found ;
			else if (close.indexOf(sym) != -1) {
				// if stack is empty some opening is less
				if (s.empty()) {
					return false;
				}
				// pop from stack
				char pop = s.pop();
				// Compare if they are matching ,if yes continue .
				if (close.indexOf(sym) != open.indexOf(pop)) {
					// if not matching ,return false
					return false;
				}

			}

		}
		// 4. when whole expression is done ,if stack is empty ,return true or return
		// false
		return s.isEmpty();

	}

	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)"; // Added missing closing parenthesis

		// Convert Infix to Postfix
		String postfix = infixToPostFix(infix);
		System.out.println("PostFix Expression: " + postfix);

		// Solve the Postfix expression
		int resultPost = solvePostfix(postfix);
		System.out.println("PostFix Result: " + resultPost);

		// Convert Infix to Prefix
		String prefix = infixToPriFix(infix);
		System.out.println("PreFix Expression: " + prefix);

		// Solve the Prefix expression
		int resultPrefix = solvePrefix(prefix);
		System.out.println("PreFix Result: " + resultPrefix);

//		// is balanced 
		boolean balanced = isBalanced(infix);
		System.out.println("Balenced: " + balanced);

	}
}
