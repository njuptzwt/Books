package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 分成两组指定的数据,运用递归的做法
 * 
 * @author 18362
 *
 */
public class GroupByTwo {
	public static Boolean Digui(int i, int length, List<Integer> list, int result, int sum) {
		if (i == length)
			return Math.abs(result) == Math.abs(sum);// 递推的出口，结束标志
		else
			return Digui(i + 1, length, list, result + list.get(i), sum)
					|| Digui(i + 1, length, list, result - list.get(i), sum);// 递归的思路，递推公式
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();// 存放非3和非5的倍数
		while (sc.hasNext()) {
			list.clear();
			int count = sc.nextInt();
			int sum = 0;
			int sum1 = 0;// 3的那组
			int sum2 = 0;// 5的那组
			for (int i = 0; i < count; i++) {
				int temp = sc.nextInt();
				sum += temp;
				if (temp % 5 == 0) {
					sum2 += temp;
					continue;
				} else if (temp % 3 == 0) {
					sum1 += temp;
				} else
					list.add(temp);
			}
			if ((sum %2 == 1))
				System.out.println("false");
			else {
				/**
				 * 如果都满足上述的条件，开始递归 将问题转化为 1、在剩余的数中找出绝对值差等于abs(sum1-sum2)
				 * 2、剩余的数字中是否存在几个组合的数的和等于sum/2-sum1或者sum/2-sum2 主要思路是这样的
				 */
				int tempsum = Math.abs(sum1 - sum2);
				System.out.println(Digui(0, list.size(), list, 0, tempsum));// 从剩余的数据中找出绝对值等于abs(sum1-sum2)的数据
			}
		}
	}
}
