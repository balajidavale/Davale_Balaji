package com;

public class ExtendThread extends Thread{
	public void run()
	{
	 System.out.println("concurrent thread started running..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendThread mt = new ExtendThread();
		 mt.start();
		}
		}
	