package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 找组成一个偶数的最近的质数
 * 
 * @author 18362
 *
 */
public class TwoPrime {
	// 判断是否是质数
	private static Boolean NumberIsPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			for (int i = a / 2; i > 0; i--) {
				if (NumberIsPrime(i) && NumberIsPrime(a - i)) {
					System.out.println(i);
					System.out.println(a - i);
					break;
				}

			}
		}
	}

}
