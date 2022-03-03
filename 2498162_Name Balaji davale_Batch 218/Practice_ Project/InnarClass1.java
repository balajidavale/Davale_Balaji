package com;

public class InnarClass1 {
	private String msg="Welcome to Java";
	class Inner{
	 void hello(){
		 System.out.println(msg+", Let us start learning Inner Classes");}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnarClass1 obj=new InnarClass1();
		InnarClass1.Inner in=obj.new Inner();
		in.hello();
		

	}

}


