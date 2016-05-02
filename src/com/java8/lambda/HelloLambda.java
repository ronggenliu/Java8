package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class HelloLambda {

	interface IntegerMath {
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}
	private String str = "";
	public static void main(String[] args) {
		HelloLambda hl = new HelloLambda();
		// basical lambda expression.
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath substration = (a, b) -> a - b;	
		System.out.println("40 + 2 = " + hl.operateBinary(40, 2, addition));
		System.out.println("40 - 2 = " + hl.operateBinary(40, 2, substration));
		
		List<Person> ps = new ArrayList<Person>();
		Person p = new Person(10, "P1");
		Person p1 = new Person(20, "P2");
		Person p2 = new Person(30, "P3");
		ps.add(p);
		ps.add(p1);
		ps.add(p2);

	}
}