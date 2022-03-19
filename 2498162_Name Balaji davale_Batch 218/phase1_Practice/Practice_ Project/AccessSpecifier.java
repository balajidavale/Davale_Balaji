package com;
class A
{
	public int no;
	{
		System.out.println("Public Acess Specifier");
	}
	protected  void fun() //protected scope
	{
		System.out.println("Protected Acess Specifier ");
	}
	void display() // default scope
	{
		System.out.println("Default Acess Specifier");
	}
	private void show() // private scope
	{
		System.out.println("Private Acess Specifier");
	}
	}
	

public class AccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	A pg=new A();
		pg.no=20; 
		pg.fun(); 
		pg.display();
		//pg.show();

	}
}