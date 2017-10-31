package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 回文字符串的统计
 * 
 * @author 18362
 *
 */
public class HuiWenString {
	public static Boolean IsHuiwen(String s) {
		for (int i = 0; i < s.length() / 2; i++)
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s1 = sc.next();
			String s2 = sc.next();
			int count = 0;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i <= s1.length(); i++) {
				sb.setLength(0);
				sb.append(s1);
				sb.insert(i, s2);
				if (IsHuiwen(sb.toString()))
					count++;
			}
			System.out.println(count);
		}
	}

}
