package com.NiukeWang.program;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int count1=0;
int count2=0;
double sum=0;
DecimalFormat decfmt=new DecimalFormat("##0.0");
while(sc.hasNext())
{
	int a=sc.nextInt();
	if(a<0)
		count1++;
	else
	{
		count2++;
		sum+=a;
	}
}
if(count2==0)
{
	System.out.println(count1);
	System.out.println("0.0");
}
else{
	System.out.println(count1);
System.out.println(decfmt.format(sum/count2));}
	}

}
