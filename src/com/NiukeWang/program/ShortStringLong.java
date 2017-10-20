package com.NiukeWang.program;

import java.util.Scanner;

public class ShortStringLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNextLine())
{
	String shortString=sc.nextLine();
	String LongString=sc.nextLine();
	Boolean flag=true;
	for(int i=0;i<shortString.length();i++)
	{
		if(!(LongString.contains(String.valueOf(shortString.charAt(i)))))
		{
			flag=false;
			break;
		}
	}
	System.out.println(String.valueOf(flag));
}
	}

}
