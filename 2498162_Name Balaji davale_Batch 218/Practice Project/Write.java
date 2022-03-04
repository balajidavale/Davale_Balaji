package com;
import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
import java.io.FileReader;
public class Write {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("E:\\AA.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i); 
        fr.close();    
	}

}
