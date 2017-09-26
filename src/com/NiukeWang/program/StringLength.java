package com.NiukeWang.program;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=new String();
s=sc.nextLine();
String[] str=s.split(" ");
System.out.println(str[str.length-1].length());
	}

}
