package com.NiukeWang.program;

import java.util.Scanner;

public class ReverseSetence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNextLine())
{
	String s=sc.nextLine();
	String[]str=s.split(" ");
	for(int j=str.length-1;j>=1;j--)//最后一个空格要小心
	{
		System.out.print(str[j]+" ");
	}
	System.out.println(str[0]);
}
	}

}
