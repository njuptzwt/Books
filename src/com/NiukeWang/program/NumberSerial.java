package com.NiukeWang.program;

import java.util.Scanner;

public class NumberSerial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNextLine())
{
	double sum=0.0;
	Double n=sc.nextDouble();
	Double m=sc.nextDouble();
	for(int i=0;i<m;i++)
		{
		sum+=n;
		n=Math.sqrt(n);
		}
	System.out.println(String.format("%.2f", sum));
}
	}

}
