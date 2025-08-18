package com.tnsif.daythree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name");
        String name = buffer.readLine();
        System.out.println("Enter the age");
        int age = Integer.parseInt(buffer.readLine());       //storing character in integer, So typecast
        System.out.println(name+" "+age);
	}

}
