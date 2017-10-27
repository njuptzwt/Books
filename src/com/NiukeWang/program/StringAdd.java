package com.NiukeWang.program;

/**
 * 数字前后加上*号
 */
import java.util.Scanner;

public class StringAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder(str);
			for (int i = 0; i < sb.length(); i++) {
				// 如果已经找到一个数为数字
				if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
					sb.insert(i, "*");
					int j = i + 2;
					for (; j < sb.length(); j++) {
						if (!(sb.charAt(j) >= '0' && sb.charAt(j) <= '9')) {
							sb.insert(j, "*");
							break;// 在非连续的子字符串下一位停止

						}
					}
					if (j == sb.length()) {
						sb.append("*");// 如果数字一直延续到最后一位；
					}
					i = j;// 下一轮循环从j下标开始
				}
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}
