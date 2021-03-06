package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//使用二分图最大匹配算法求解（匈牙利算法）
public class ERFenMaximumAllocation {
	private static List<Integer> list1 = new ArrayList<Integer>();// 奇数的个数
	private static List<Integer> list2 = new ArrayList<Integer>();// 偶数的个数
	private static int count = 0;// 记录总个数
	private static int[] used;// 标记是否被用过，每次初始化全部为0
	private static int[][] graph;
	private static int[] flag;// 初始匹配
	// 二分图分配算法的核心部分

	public static Boolean CanAllocation(int cur) {
		for (int j = 0; j < list2.size(); j++) {
			if (graph[cur][j] == 1 && used[j] == 0) {
				used[j] = 1;// 这轮循环下次不能在使用这个点（嵌套的循环)
				if (flag[j] == -1 || CanAllocation(flag[j]))// 如果当前的节点没有被匹配或者可以找到下一匹配点
				{
					flag[j] = cur;
					return true;
				}
			}
		}
		return true;
	}
//判断是否为质数
	public static Boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
//主函数部分
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			for (int i = 0; i < a; i++) {
				int temp = sc.nextInt();
				if (temp % 2 == 1)
					list1.add(temp);// 奇数的个数
				else
					list2.add(temp);// 偶数的个数
			}
			// 构建二分图
			graph = new int[list1.size()][list2.size()];
			for (int j = 0; j < list1.size(); j++)
				for (int k = 0; k < list2.size(); k++)
					if (isPrime(list1.get(j) + list2.get(k)))
						graph[j][k] = 1;
			flag = new int[list2.size()];// 初始匹配全部设计为-1,这边貌似有点问题。。(meiyou匹配值)
			for(int p=0;p<list2.size();p++)
				flag[p]=-1;
			for (int i = 0; i < list1.size(); i++) {
				used = new int[list2.size()];
				if (CanAllocation(i))
					count++;
			}
			System.out.println(count);
			list1.clear();
			list2.clear();
			count=0;
		}
	}

}
