package com.test;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.a = 10;
		p.b = 20;
		p.printParent();
		Child c = new Child();
		c.a = 30;
		c.b = 40;
		c.c = 50;
		c.d = 60;
		c.printChild();
	Parent p1  = new Child();
	p1.printParent();
	}

}
