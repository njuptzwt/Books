package com.NiukeWang.program;

import java.util.Scanner;

public class Daxei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=0;
for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			count++;
	}
	System.out.println(count);
}
}
