package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//整数排序
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
List<Integer> list=new ArrayList<Integer>();
while(sc.hasNext())
{
	int count=sc.nextInt();
	for(int i=0;i<count;i++)
	{
		int temp=sc.nextInt();
		list.add(temp);
	}
	int flag=sc.nextInt();
	Collections.sort(list);
	if(flag==0)
	{
		for(int j=0;j<list.size()-1;j++)
			System.out.print(list.get(j)+" ");
		System.out.println(list.get(list.size()-1));
	}
	else
	{
		for(int k=list.size()-1;k>0;k--)
			System.out.print(list.get(k)+" ");
		System.out.println(list.get(0));
	}
	list.clear();
}
	}

}
