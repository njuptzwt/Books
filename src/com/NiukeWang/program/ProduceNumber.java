package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.List;

public class ProduceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=new ArrayList<Integer>();
for(int i=1;i<10001;i++)
	list.add(i);
list.remove(0);
list.remove(0);
list.remove(9997);
for(int j:list)
	System.out.println(j+" ");
	}

}
