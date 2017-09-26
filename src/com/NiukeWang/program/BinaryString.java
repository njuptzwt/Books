package com.NiukeWang.program;

import java.util.Scanner;

public class BinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
int count=0;
////String s=Integer.toBinaryString(c);
////System.out.println(s);
//if(c>0)
//{
//while(c!=0)
//{
//	i+=c%2;
//	c=c/2;
//}
//System.out.println(i);
//	}
//	}
//
//}
while(c>0)
{
	if((c&1)==1)
	{
		count++;
	}
	c=c>>1;//通过左移右移的方法来判断个数,与1的值相与判断某个位置的值为1还是为0！
}
System.out.println(count);
}
}