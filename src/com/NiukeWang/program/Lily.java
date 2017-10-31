package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lily {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
List<Character>list=new ArrayList<Character>();
while(sc.hasNext())
{
	String s=sc.nextLine();
	
	for(int i=0;i<s.length();i++)
		list.add(s.charAt(i));
	Collections.sort(list);
	for(int i=0;i<list.size();i++)
		System.out.print(list.get(i));
	System.out.println();
	list.clear();
}
	}

}
