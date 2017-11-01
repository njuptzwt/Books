package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 拼凑面额 动态规划,算法计算
 * 
 * @author 18362
 *
 *         可以看做完全背包问题：每个数字面额有无限个，求拼成n的组合数   状态转移方程：f[i,j] = f[i-1,
 *         j-k*a[i]],其中0<=k*a[i]<=j   f[i,j]表示前i个面额拼成j的组合数   f[i-1,
 *         j-k*a[i]]表示前i-1个面额拼成j-k*a[i]的组合数   注意：当只有一个数字面额时，f[0,j]= j- k*a[0] ==
 *         0 ? 1 : 0
 */
public class ComBinationMoney {
	public static long getNumber(int n, int[] a) {
		long[][] dp = new long[a.length][n + 1];// 构建前几种面值构成数字的方法数
		for (int i = 0; i <= n; i++)
			dp[0][i] = 1;// 任何数值只由1构成的只有一种方法
		for (int i = 0; i < a.length; i++)
			dp[i][0] = 1;// 0元当作所有面值1中方法
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j <= n; j++) {
				int k = 0;
				while (j - k * a[i] >= 0) {
					dp[i][j] += dp[i - 1][j - k * a[i]];// 核心的递推公式处
					k++;
				}
			}
		}
		return dp[a.length - 1][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int count = sc.nextInt();
			int[] money = { 1, 5, 10, 20, 50, 100 };// 数据面额
			long result = getNumber(count, money);
			System.out.println(result);

		}
	}

}
