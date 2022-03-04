package com;
import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
import java.io.FileReader;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
	          FileWriter fw=new FileWriter("E:\\AA.txt");    
	          fw.write("Welcome to java.");    
	          fw.close();    
	         }catch(Exception e){System.out.println(e);}    
	         System.out.println("Success...");
	}

}
