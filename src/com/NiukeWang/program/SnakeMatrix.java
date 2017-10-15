package com.NiukeWang.program;

import java.util.Scanner;

public class SnakeMatrix {
	public static void GetResult(int Num)
	{
		if(Num==1)
		{
			System.out.println(1);
		}
		else
		{
			int sum=0;
			for(int i=1;i<=Num-1;i++)
				{
				sum+=i;
				System.out.print(sum);
				System.out.print(" ");
				}
			System.out.println(sum+Num);
			//确定每一行的起始数字
			int temp=0;
			int index=1;
			int count=0;
			int temp1=0;
			for(int j=2;j<=Num;j++)
			{
				temp++;
				index+=temp;//每一行的起始数字
				count=index;
				temp1=j+1;//每一行起始加的数字量
				for(int k=Num+1-j;k>=2;k--)
				{
					System.out.print(count+" ");//这边有点问题
					count+=temp1;
					temp1++;
				}
				System.out.print(count);
				System.out.println();
			}		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt())
{
int num=sc.nextInt();
GetResult(num);
	}
}
}
