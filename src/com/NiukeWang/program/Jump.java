package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//袋鼠过河，最优化问题！！
public class Jump {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		while (sc.hasNextInt()) {
			int count = sc.nextInt();
			int total[] = new int[count];// 记录每一个节点最少跳的次数
			for (int i = 0; i < count; i++) {
				int a = sc.nextInt();
				list.add(a);
			}
			// 使用递归思想，用while循环来实现，先求最后一个的情况
			if (list.get(count - 1) == 0)
				total[count - 1] = -1;
			else
				total[count - 1] = 1;// 否则只需要一步
			//遍历循环前面的节点，直到第一个
			for (int j = list.size() - 2; j >= 0; j--) {
				if (list.get(j) == 0)
					total[j] = -1;
				else if (list.get(j) > list.size() - j - 1)
					total[j] = 1;// 如果可以直接跳到对面，只需要一步
				else {
					// 否则需要从下面几个中找最小的跳数
					int min=10000;
					for (int i = j + 1; i <= j + list.get(j); i++) {
						if (total[i] != -1)
						{
							if (min > total[i])
								min = total[i];//求最小值
					}
					}
					if (min != 10000)
						total[j] = 1 + min;
					else
						total[j] = -1;// 不行的方案
				}
			}
			list.clear();
				System.out.println(total[0]);
		}
	}
}
