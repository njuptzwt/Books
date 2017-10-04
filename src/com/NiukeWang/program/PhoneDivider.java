package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//思路，单独考虑每个字符串是否出现特有的字母
public class PhoneDivider {
	public static int[] Divide(String s)
	{
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		int count[]=new int[10];//计算每一个数字的出现次数0~9
		while(s.contains("Z"))//当有Z的时候一定是0
		{
			sb.deleteCharAt(sb.indexOf("Z"));//首先找到代表0的字符串，删除0所代表的字符
			sb.deleteCharAt(sb.indexOf("E"));
			sb.deleteCharAt(sb.indexOf("R"));
			sb.deleteCharAt(sb.indexOf("O"));
			s=sb.toString();//重新设置删除之后的字符串
			count[2]++;//计算原字母2出现的次数
		}
		while(s.contains("W"))
		{
			sb.deleteCharAt(sb.indexOf("T"));//首先找到代表2的字符串，删除2所代表的字符
			sb.deleteCharAt(sb.indexOf("W"));
			sb.deleteCharAt(sb.indexOf("O"));
			s=sb.toString();//重新设置删除之后的字符串
			count[4]++;//计算原字母4出现的次数
		}
		while(s.contains("U"))
		{
			sb.deleteCharAt(sb.indexOf("F"));//首先找到代表4的字符串，删除4所代表的字符
			sb.deleteCharAt(sb.indexOf("O"));
			sb.deleteCharAt(sb.indexOf("U"));
			sb.deleteCharAt(sb.indexOf("R"));
			s=sb.toString();//重新设置删除之后的字符串
			count[6]++;//计算原字母6出现的次数
		}
		while(s.contains("X"))
		{
			sb.deleteCharAt(sb.indexOf("S"));//首先找到代表6的字符串，删除6所代表的字符
			sb.deleteCharAt(sb.indexOf("I"));
			sb.deleteCharAt(sb.indexOf("X"));
			s=sb.toString();//重新设置删除之后的字符串
			count[8]++;//计算原字母8出现的次数
		}
		while(s.contains("G"))
		{
			sb.deleteCharAt(sb.indexOf("E"));//首先找到代表8的字符串，删除8所代表的字符
			sb.deleteCharAt(sb.indexOf("I"));
			sb.deleteCharAt(sb.indexOf("G"));
			sb.deleteCharAt(sb.indexOf("H"));
			sb.deleteCharAt(sb.indexOf("T"));
			s=sb.toString();//重新设置删除之后的字符串
			count[0]++;//计算原字母0出现的次数
		}
		//找剩余的中不重复的
		while(s.contains("O"))
		{
			sb.deleteCharAt(sb.indexOf("O"));//首先找到代表1的字符串，删除1所代表的字符
			sb.deleteCharAt(sb.indexOf("N"));
			sb.deleteCharAt(sb.indexOf("E"));
			s=sb.toString();//重新设置删除之后的字符串
			count[3]++;//计算原字母3出现的次数
		}
		while(s.contains("T"))
		{
			sb.deleteCharAt(sb.indexOf("T"));//首先找到代表3的字符串，删除30所代表的字符
			sb.deleteCharAt(sb.indexOf("H"));
			sb.deleteCharAt(sb.indexOf("R"));
			sb.deleteCharAt(sb.indexOf("E"));
			sb.deleteCharAt(sb.indexOf("E"));
			s=sb.toString();//重新设置删除之后的字符串
			count[5]++;//计算原字母5出现的次数
		}
		while(s.contains("F"))
		{
			sb.deleteCharAt(sb.indexOf("F"));//首先找到代表5的字符串，删除5所代表的字符
			sb.deleteCharAt(sb.indexOf("I"));
			sb.deleteCharAt(sb.indexOf("V"));
			sb.deleteCharAt(sb.indexOf("E"));
			s=sb.toString();//重新设置删除之后的字符串
			count[7]++;//计算原字母7出现的次数
		}
		while(s.contains("S"))
		{
			sb.deleteCharAt(sb.indexOf("S"));//首先找到代表7的字符串，删除7所代表的字符
			sb.deleteCharAt(sb.indexOf("E"));
			sb.deleteCharAt(sb.indexOf("V"));
			sb.deleteCharAt(sb.indexOf("E"));
			sb.deleteCharAt(sb.indexOf("N"));
			s=sb.toString();//重新设置删除之后的字符串
			count[9]++;//计算原字母9出现的次数
		}
		while(s.contains("E"))
		{
			sb.deleteCharAt(sb.indexOf("N"));//首先找到代表9的字符串，删除9所代表的字符
			sb.deleteCharAt(sb.indexOf("I"));
			sb.deleteCharAt(sb.indexOf("N"));
			sb.deleteCharAt(sb.indexOf("E"));
			s=sb.toString();//重新设置删除之后的字符串
			count[1]++;//计算原字母9出现的次数
		}	
		sb.setLength(0);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
List<String> list=new ArrayList<String>();
StringBuilder sb=new StringBuilder();
while(sc.hasNextInt())
{
	int count=sc.nextInt();
	for(int i=0;i<count;i++)
	{
		String s=sc.next();//输入的字符串
		int a[]=Divide(s);
		for(int j=0;j<a.length;j++)
			for(int k=0;k<a[j];k++)
				sb.append(j);
		list.add(sb.toString());
		sb.setLength(0);
	}
	for(String str:list)
		System.out.println(str);
}
	}

}
