package com;

public class InnerClass2 {
	private String msg="Inner Classes";
	void display(){
	class Inner{
	void msg(){
	System.out.println(msg);
	}
	 }

	 Inner l=new Inner();
	 l.msg();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass2 ojb=new InnerClass2 ();
		ojb.display();
		
		
	}

}
