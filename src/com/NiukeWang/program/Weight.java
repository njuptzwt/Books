package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * 称砝码的重量
 * @author 18362
 *
 */
public class Weight {
public static int GetNumber(int n,int []weight,int []number)
{
	Set<Integer> set=new HashSet<Integer>();
	for(int i=0;i<=number[0];i++)
		set.add(weight[0]*i);//首先添加好第一组的代码
	for(int i=1;i<n;i++)
	{
		//从第二类砝码开始相加
		List<Integer> list=new ArrayList<Integer>(set);//每一轮用set集合给list初始化
		for(int j=1;j<=number[i];j++)
			for(int k=0;k<list.size();k++)
				set.add(list.get(k)+j*weight[i]);
	}
	return set.size();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNext())
{
	int count=sc.nextInt();//输入砝码的种类
	int []weight=new int[count];//砝码的重量
	int []number=new int[count];//砝码的数量
	for(int i=0;i<count;i++)
	{
		weight[i]=sc.nextInt();
	}
	for(int i=0;i<count;i++)
	{
		number[i]=sc.nextInt();
	}
	System.out.println(GetNumber(count,weight,number));
}
	}

}
