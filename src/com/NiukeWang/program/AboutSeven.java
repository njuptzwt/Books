package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 找到含7和7的倍数的个数
 * @author 18362
 *
 */
public class AboutSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNext())
{
	int a=sc.nextInt();
	int count=0;
	for(int i=7;i<=a;i++)
	{
		if(i%7==0||String.valueOf(i).contains("7"))
			count++;
	}
	System.out.println(count);
}
	}

}
