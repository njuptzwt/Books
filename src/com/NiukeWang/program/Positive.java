package com.NiukeWang.program;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt())
{
	int a=sc.nextInt();
	double sum=0.0;
	DecimalFormat decfmt=new DecimalFormat("##0.0");
	int flag=0;
	int flag2=0;
	for(int i=0;i<a;i++)
	{
		int temp=sc.nextInt();
		if(temp>0)
		{
			flag++;
			sum+=temp;
		}
		else if(temp<0)
		{
			flag2++;
		}
	}
	if(flag==0)
	System.out.println(flag2+" "+"0.0");
	else
		System.out.println(flag2+" "+decfmt.format(sum/flag));
}
	}

}
