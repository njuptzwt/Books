package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 高精度的加法计算,加法操作容易实现，减法操作，加一个负数
 * 实现了BigInteger类型的加操作~，BigInteger和BigDecimal的使用
 * 
 * @author 18362
 *
 */
public class HighRatePlus {
	// 加法函数
	public static String Plus(String str1, String str2) {
		int length = str1.length();
		int JinWei[] = new int[length];// 保留进位的数组
		JinWei[length - 1] = 0;// 个位数的进位是0
		int result[] = new int[length + 1];// 结果数组，多一位，进位标志
		StringBuilder sb = new StringBuilder();
		// 循环计算
		for (int i = length - 1; i >= 0; i--) {
			result[i] = (Integer.parseInt(str1.substring(i, i + 1)) + Integer.parseInt(str2.substring(i, i + 1))
					+ JinWei[i]) % 10;// 结果
			sb.insert(0, result[i]);
			if (i > 0) {
				JinWei[i - 1] = (Integer.parseInt(str1.substring(i, i + 1)) + Integer.parseInt(str2.substring(i, i + 1))
						+ JinWei[i]) / 10;// 进位
			}
		}
		if ((Integer.parseInt(str1.substring(0, 1)) + Integer.parseInt(str2.substring(0, 1)) + JinWei[0]) / 10 > 0)
			sb.insert(0, 1);// 如果最高位有进位
		return sb.toString();
	}

	// 减法函数
	public static String Minus(String str1, String str2) {
		int length = str1.length();
		int[] JieWei = new int[length];// 借位数组
		JieWei[length - 1] = 0;
		int[] result = new int[length];// 结果数组
		StringBuilder sb = new StringBuilder();// 结果集合
		for (int j = length - 1; j >= 0; j--) {
			if ((Integer.parseInt(str1.substring(j, j + 1)) - JieWei[j]
					- Integer.parseInt(str2.substring(j, j + 1)) < 0)) {
				if (j != 0) {
					JieWei[j - 1] = 1;// 像前面借了一位数
				}
				result[j] = Integer.parseInt(str1.substring(j, j + 1)) + 10 - JieWei[j]
						- Integer.parseInt(str2.substring(j, j + 1));
				sb.insert(0, result[j]);
			} else {
				result[j] = Integer.parseInt(str1.substring(j, j + 1)) - JieWei[j]
						- Integer.parseInt(str2.substring(j, j + 1));
				sb.insert(0, result[j]);
			}
		}
		String str = sb.toString();
		for (int k = 0; k < str.length(); k++) {
			if (str.charAt(k) != '0') {
				str = str.substring(k, str.length());
				break;
			}
		}

		return str;
	}

	// 字符串补0的操作
	public static String newString(String str, int i) {
		StringBuilder sb = new StringBuilder(str);
		for (int j = 0; j < i; j++)
			sb.insert(0, 0);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str1 = sc.next();// 第一个字符串
			String str2 = sc.next();// 第二个字符串
			String result = new String();
			if ((!str1.substring(0, 1).equals("-") && !str2.substring(0, 1).equals("-"))) {
				if (str1.length() > str2.length())
					str2 = newString(str2, str1.length() - str2.length());
				else if (str1.length() < str2.length())
					str1 = newString(str1, str2.length() - str1.length());
				result = Plus(str1, str2);
			} else if (str1.substring(0, 1).equals("-") && str2.substring(0, 1).equals("-")) {
				str1 = str1.substring(1, str1.length());
				str2 = str2.substring(1, str2.length());
				if (str1.length() > str2.length())
					str2 = newString(str2, str1.length() - str2.length());
				else if (str1.length() < str2.length())
					str1 = newString(str1, str2.length() - str1.length());
				result = "-" + Plus(str1, str2);

			} else {
				// 一正一负情况,字符串比较大小的情况，有点问题，减法这边
				if (str1.contains("-")) {
					str1 = str1.substring(1, str1.length());
					if (str1.length() > str2.length()) {
						str2 = newString(str2, str1.length() - str2.length());
						result = "-" + Minus(str1, str2);
					} else if (str1.length() < str2.length()) {
						str1 = newString(str1, str2.length() - str1.length());
						result = Minus(str2, str1);
					} else {
						if (str1.compareTo(str2) > 0)
							result = "-" + Minus(str1, str2);
						else if (str1.compareTo(str2) < 0)
							result = Minus(str2, str1);
						else
							result = "0";
					}
				} else {
					str2 = str2.substring(1, str2.length());
					if (str1.length() > str2.length()) {
						str2 = newString(str2, str1.length() - str2.length());
						result = Minus(str1, str2);
					} else if (str1.length() < str2.length()) {
						str1 = newString(str1, str2.length() - str1.length());
						result = "-" + Minus(str2, str1);
					} else {
						if (str1.compareTo(str2) > 0)
							result = Minus(str1, str2);
						else if (str1.compareTo(str2) < 0)
							result = "-" + Minus(str2, str1);
						else
							result = "0";
					}
				}
			}
			System.out.println(result);
		}
	}

}
