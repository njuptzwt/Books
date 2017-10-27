package com.NiukeWang.program;
//核心想法，字符串中是否包含最长的子字符串
import java.util.Scanner;
public class AppendString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 while(sc.hasNext())
 {
	 int count=sc.nextInt();
	 StringBuilder sb=new StringBuilder("1");
	 int temp=0;
	 int i=1;
	 String str=Integer.toBinaryString(count);
	 for( ;i<1000;i++)
	 {
		if(str.contains(sb.toString()))
		{
			temp++;
			sb.append("1");//字符串的长度从1一直加到1111.......11(100)个
		}
		else
			break;
	 }
	 System.out.println(temp);
 }
	}

}
