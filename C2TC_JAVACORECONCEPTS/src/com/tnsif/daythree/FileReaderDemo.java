package com.tnsif.daythree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 FileReader fr = new FileReader("dataa.txt");
         BufferedReader br = new BufferedReader(fr);
         String content;
         while((content = br.readLine()) != null)
         {
        	 System.out.println(content);
         }
	}

}
