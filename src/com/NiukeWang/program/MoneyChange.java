package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 拼凑面额 核心思想，算出个位数的拼凑方法，10的拼凑方法,输出是long型的数据
 * 
 * @author 18362
 *
 */
public class MoneyChange {
	private static int change[] = new int[10];//0-9
	private static int change1[] = new int[10];//10-90
	private static int change2[] = new int[10];//100-900
	private static int change3[] = new int[10];//1000-9000

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long result=0L;//结果集合
		change[10] = 3;//10的拼凑方式
		change[11] = 59049;//100的面值组合
		Long result100=59049*59049L;//1000的面值组合方法
		int i = 0;
		change[0] = 0;
		for (; i < 5; i++)
			change[i] = 1;
		for (; i < 10; i++)
			change[i] = 2;
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int count=sc.nextInt();
			if(count>=1000)
			{
				for(int j=0;j<4;j++);
			}
		}
	}

}
