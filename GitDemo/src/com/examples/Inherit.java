package com.examples;
class A
{
	int a;
	int b;
	public void display() {
		System.out.println("Sum is:"+(a+b));
	}
}
class B extends A
{
	int x;
	int y;
	public void show() {
		System.out.println("ADD:"+(x+y));
	}
}
class c extends A
{
	int p;
	int q;
	public void put() {
		System.out.println("Sum:"+(p+q));
	}
}
public class Inherit {

	public static void main(String[] args) {
		c b=new c();
		B bo=new B();
		bo.x=100;
		bo.y=200;
		bo.show();
		
		b.a=10;
		b.b=20;
		b.display();
		
		b.p=1000;
		b.q=2000;
		b.put();
	}
}
