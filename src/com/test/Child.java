package com.test;

public class Child extends Parent{
	int c;
	int d;
	
	@Override
	public void printParent(){
		System.out.println("In print of child");
	}
	
	public void printChild(){
		super.printParent();
		this.printParent();
		System.out.println(c);
		System.out.println(d);
	}
	

}
