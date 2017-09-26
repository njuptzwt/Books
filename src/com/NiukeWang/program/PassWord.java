package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassWord {
	static List<String>list1=new ArrayList<String>();
	public static String Repeatstring(String s)
	{
//		Boolean flag=false;
//		for(int i=0;i<s.length()-3;i++)
//		{
//			list1.add(s.substring(i, i+3));//下标不取到i+2,subString用法//只要判断字符串不大于3就可以了，重复的字符串
//		}
//		//最笨的方法比较
//		for(int j=0;j<list1.size()-1;j++)
//		{
//			//实现list的contains方法,内部实现，有小问题
//			for(int i=j+1;i<list1.size();i++)
//				if(list1.get(j).equals(list1.get(i)))
//				{
//					flag=true;
//					break;
//				}
//			if(flag)
//			{
//				break;
//			}
//		}
//		if(flag)
//		{
//		System.out.println("NG");
//		}
//		else
//		{
//			System.out.println("OK");
//		}
		 for (int i = 0; i < s.length() -3; i++) {//这个判断方法类似,很机智！String的contains方法，这个方法好
		        String str1=s.substring(i,i+3);
		        String str2=s.substring(i+3, s.length());
		        if(str2.contains(str1))
		           return "NG";
		    }
		    return "OK";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a1=0,a2=0,a3=0,a4=0;//记录是否有大写字母已经出现
while(sc.hasNext())
{
	String s=sc.next();
	a1=a2=a3=a4=0;
	if(s.length()<9||s==null)
	{
		System.out.println("NG");
		continue;
	}
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
		{
			a1=1;
			continue;
		}
		else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		{
			a2=1;
			continue;
		}
		else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			a3=1;
			continue;
		}
		else
		{
			a4=1;
			continue;
		}
	}
	if(a1+a2+a3+a4>=3)
	{
		System.out.println(Repeatstring(s));
	}
	else
	{
		System.out.println("NG");
	}
}
	}

}
