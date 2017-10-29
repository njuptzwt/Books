package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 完备数的解法
 * 
 * @author 18362
 *
 */
public class PerfectNumber {
	public static Boolean IsPerfectNumber(int n) {
		int sum = 1;
		for (int i = 2; i <= n / i + 1; i++) {// 这里是核心控制的逻辑
			if (n % i == 0)
				sum += i + n / i;
			if (sum > n)
				break;
		}
		if (sum == n)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long starttime=System.currentTimeMillis();
			int count = 0;
			int a = sc.nextInt();
			if (a > 1000) {
				count = 3;
				for (int j = 1001; j <= a; j++)
					if (IsPerfectNumber(j))
						count += 1;
			} else
			{
				for (int j = 1; j <= a; j++)
					if (IsPerfectNumber(j))
						count += 1;
			}
			long endtime=System.currentTimeMillis();
			System.out.println(endtime-starttime+"ms");
			System.out.println(count);
		}

	}
}
