package com.test;

public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 76;
		int age = 24;
		/*if (a>10) {
			System.out.println("a is grater than 10");
		}*/
		
		/*if (a>=10) {
			System.out.println("a is greater than 10");
		} else {
			System.out.println("a is less than 10");
		}*/
		
		/*if (marks>0 && marks<35) {
			System.out.println("fail");
		} 
		else if (marks>=35 && marks <60) {
			System.out.println("second class");
		}
		else if (marks>=60 && marks<75) {
			System.out.println("first class");
		}
		else if (marks>75) {
			System.out.println("Distinction");
		}
		else {
			System.out.println("Invalid marks");
		}*/
		
		if (marks>70) {
			if (age>15) {
				System.out.println("in nested if");
			}
		}

	}

}
