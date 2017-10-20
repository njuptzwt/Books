package com.NiukeWang.program;
import java.util.Scanner;
//最长递增子序列的动态规划求解
public class MaxLengthsubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int count = sc.nextInt();
			int[] array = new int[count];
			for (int i = 0; i < count; i++)
				array[i] = sc.nextInt();// 登记数组
			/**
			 * 动态规划，求最长的子序列，从每一个节点开始
			 * 
			 */
			int[] dp = new int[count];// 每一个节点的背包数
			int max = -1;
			for (int i = 0; i < count; i++) {
				dp[i] = 1;// 初始化每个背包的长度为1字符
				for (int j = 0; j < i; j++) {
					if (array[j] < array[i])
						dp[i] = Math.max(dp[i], dp[j] + 1);// 关键代码，依次找出下标的最大子序列，从最前面开始
				}
				max = Math.max(max, dp[i]);
			}
			System.out.println(max);
		}
	}
}
