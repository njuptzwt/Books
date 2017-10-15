package com.NiukeWang.program;

import java.util.Scanner;

//求两个数的最小公倍数，是两个数之积除以最大公约数
public class MimmumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNext())
{
	int a=sc.nextInt();
	int b=sc.nextInt();
	int total=a*b;
	int temp=0;int temp1=0;
	if(a<b)
	{
		temp=a;
		a=b;
		b=temp;
	}
	//先求最大公约数
	while(a%b!=0)
	{
		temp1=a%b;
		a=b;
		b=temp1;
	}
	//求最小公倍数
	System.out.println(total/b);
}
	}

}
