package com.NiukeWang.program;

import java.util.Scanner;

//密码截取
public class GetPassword {
	//先写一个函数处理是否改密码是回文密码
	public static Boolean HuiWen(String s)
	{
		if(s==null)
			return false;
		if(s.length()==1)
			return true;//只有一个字符返回true
		Boolean flag=true;
		//判断是否是回文数
		for(int k=0;k<s.length()/2;k++)
		{
			if(!(s.charAt(k)==s.charAt(s.length()-1-k)))
			{
				flag=false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNextLine()){
	String s=sc.nextLine();//空格数据有问题
	Boolean flag=false;
	if(s!=null||s!=""||s.length()!=0)//字符串不为空的情况下才输出
	{
	int FinalLength=0;
	if(HuiWen(s))//如果直接是回文字符串
		FinalLength=s.length();
	else
		{
		for(int i=1;i<s.length();i++)
		{
		for(int j=0;j<i;j++)
		{
			if(HuiWen(s.substring(j, s.length()-i+j)))
			{
				flag=true;
				break;
			}
		}
		if(flag)
			{
			FinalLength=s.length()-i;
			break;
			}
		}
		}
	System.out.println(FinalLength);
		}
}
}
	}
