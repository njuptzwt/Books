package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
List<String>list=new ArrayList<String>();
while(sc.hasNext())
{
	int a=sc.nextInt();
	String s;
	for(int i=0;i<a;i++)
	{
		s=sc.next();
		list.add(s);
	}
    for(int k=0;k<list.size();k++)
    {
    	StringBuilder sb=new StringBuilder(list.get(k));//通过这个家伙来操作
    	if(sb.length()%8!=0)
    	{
    		for(int j=sb.length()%8;j<=8;j++)
    			sb.append("0");
    		while(sb.length()>=8)
    		{
    			System.out.println(sb.substring(0,8));
    			sb.delete(0, 8);
    		}
    	}
    	else//能被整除
    	{
    		while(sb.length()>=8)
    		{
    			System.out.println(sb.substring(0, 8));
    			sb.delete(0, 8);//StringBuilder的各种丰富的功能
    		}
    	}
    	sb.setLength(0);
    	
    }
    list.clear();
}
	}

}
