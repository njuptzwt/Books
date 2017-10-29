package com.NiukeWang.program;
/**
 * 找到第一个单个字符
 */
import java.util.Scanner;

public class FirstChracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			Boolean flag = false;
			int i = 0;
			for (; i < str.length(); i++) {
				sb.append(str);
				sb.deleteCharAt(i);
				if (!sb.toString().contains(String.valueOf(str.charAt(i)))) {
					flag = true;
					break;
				}
				sb.setLength(0);
			}
			if (flag)
				System.out.println(String.valueOf(str.charAt(i)));
			else
				System.out.println("-1");
		}
	}

}
