package com.NiukeWang.program;

import java.util.Scanner;

//try-catch捕捉转换异常
public class IntegerPlus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNext()) {
			String s1 = sc.next();
			String s2 = sc.next();
			int temp1 = Math.max(s1.length(), s2.length());
			int temp2 = Math.min(s1.length(), s2.length());
			int[] jiashu = new int[temp1];// 加数集合
			int[] beijiashu = new int[temp1];// 被加数集合
			int[] jinwei = new int[temp1];// 进位数组集合
			int[] result = new int[temp1];// 结果集合
			try {// 数据转化出错，抛异常
				if (s1.length() > s2.length()) {
					for (int i = 0; i < temp1; i++)
						jiashu[i] = Integer.valueOf(String.valueOf(s1.charAt(temp1 - i - 1)));
					for (int j = 0; j < temp2; j++)
						beijiashu[j] = Integer.valueOf(String.valueOf(s2.charAt(temp2 - j - 1)));// 补0
					result[0] = (jiashu[0] + beijiashu[0]) % 10;
					jinwei[0] = (jiashu[0] + beijiashu[0]) / 10;
					sb.insert(0, result[0]);
					for (int k = 1; k < temp1; k++) {
						result[k] = (jiashu[k] + beijiashu[k] + jinwei[k - 1]) % 10;
						jinwei[k] = (jiashu[k] + beijiashu[k] + jinwei[k - 1]) / 10;
						sb.insert(0, result[k]);// 结果集合
					}
					if (jinwei[temp1 - 1] > 0)
						sb.insert(0, 1);
				} else {
					for (int i = 0; i < temp1; i++)
						jiashu[i] = Integer.valueOf(String.valueOf(s2.charAt(temp1 - i - 1)));
					for (int j = 0; j < temp2; j++)
						beijiashu[j] = Integer.valueOf(String.valueOf(s1.charAt(temp2 - j - 1)));// 补0
					result[0] = (jiashu[0] + beijiashu[0]) % 10;
					jinwei[0] = (jiashu[0] + beijiashu[0]) / 10;
					sb.insert(0, result[0]);
					for (int k = 1; k < temp1; k++) {
						result[k] = (jiashu[k] + beijiashu[k] + jinwei[k - 1]) % 10;
						jinwei[k] = (jiashu[k] + beijiashu[k] + jinwei[k - 1]) / 10;
						sb.insert(0, result[k]);// 结果集合
					}
					if (jinwei[temp1 - 1] > 0)
						sb.insert(0, 1);
				}
				System.out.println(sb.toString());
				sb.setLength(0);
			} catch (Exception e) {
				System.out.println("Error");
				sb.setLength(0);
			}
		}
	}
}
