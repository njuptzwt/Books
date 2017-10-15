package com.NiukeWang.program;

import java.util.Scanner;

//人民币转换
public class Money {
	public static String Exchange(int i)
	{
		StringBuilder sb=new StringBuilder();
		switch(i)
		{
		case 1:return "壹";
		case 2:return "贰";
		case 3:return "叁";
		case 4:return "肆";
		case 5:return "伍";
		case 6:return "陆";
		case 7:return "柒";
		case 8:return "捌";
		case 9:return "玖";
		case 0:return "零";
		}
		return null;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNext())
{
	String s=sc.next();
	String []str=s.split(".");
	//亿
	int temp=Integer.valueOf(str[0]);
	if(str[0].length()>8)
	{
		
	}
}
	}

}
