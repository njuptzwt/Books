package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 二进制中1的个数
 * @author 18362
 *
 */
public class OneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNext())
{
	int a=sc.nextInt();
	int count=0;
	while(a>0)
	{
		if((a&1)!=0)
			count++;
		a=a>>1;//移位操作
	}
	System.out.println(count);
	}
	}
}
