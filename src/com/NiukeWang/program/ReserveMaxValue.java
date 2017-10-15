package com.NiukeWang.program;

import java.util.Scanner;
//思路简单
public class ReserveMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNext())
{
    
	String s=sc.next();
	int b=sc.nextInt();//删除个数
	int temp=-1;
	int count=0;
	int flag=1;//标记位置
	StringBuilder sb=new StringBuilder();
	sb.append(s);
	//第一次
	String str=s.substring(0, b);
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		//着最大值的位置
		if(ch[i]>temp)
			temp=ch[i];//寻找最大值
	}
	if(temp<sb.charAt(b))
		sb.delete(0, b);//结束删除数字
	else
	{
		sb.delete(0, str.indexOf(temp));//如果第b+1个数据不大于前面的数据，从前面的数据中找到最大值，并删除其前面的个数
		count=str.indexOf(temp);
	}
	//开始循环的找
	while(sb.length()>s.length()-b)
	{
		temp=-1;
		String str1=sb.substring(flag,flag+b-count);//每次开始的位置往下移一位
		char []ch1=str1.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			//着最大值的位置
			if(ch1[i]>temp)
				temp=ch1[i];//寻找最大值
		}
		if(temp<sb.charAt(flag+b-count))
			sb.delete(flag, flag+b-count);//结束删除数字
		else
		{
			sb.delete(flag, flag+str1.indexOf(temp));//如果第b+1个数据不大于前面的数据，从前面的数据中找到最大值，并删除其前面的个数
			count+=str1.indexOf(temp);
			flag++;
		}
	}
	System.out.println(sb.toString());
}
	}

}
