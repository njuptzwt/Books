package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 进制转化
 * 
 * @author 18362
 *
 */
public class JinZhiZhuanHuan {
	/**
	 * 辗转相除法求最大公约数,欧几里得算法
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int pub(int a, int b) {
		if (b == 0)
			return a;
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		return pub(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int sum = 0;
			int i = 2;
			int input = sc.nextInt();
			int temp = input;
			for (; i < input; i++) {
				while (input > 0) {
					sum += input % i;
					input = input / i;
				}
				input = temp;
			}
			int Yueshu = pub(sum, temp - 2);
			System.out.println(sum / Yueshu + "/" + (temp - 2) / Yueshu);
		}
	}
}
