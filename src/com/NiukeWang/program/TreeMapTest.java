package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//TreeMap<String,String>tm=new TreeMap<String,String>();
List<String>list=new ArrayList<String>();
while(sc.hasNextInt())//阻塞
{
	int count=sc.nextInt();
	for(int i=0;i<count;i++)
	{
		String s=sc.next();
		list.add(s);
	}
	Collections.sort(list);//利用list的排序
	for(Object key:list)
	{
		System.out.println(key);
	}
}
	}

}
