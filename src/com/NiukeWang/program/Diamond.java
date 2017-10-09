package com.NiukeWang.program;

import java.util.Scanner;

public class Diamond {
	// 字符串中截取子字符串（用最笨的方法实现），StringBuilder也可以！
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			// 从5开始比较字符串(长度为5）
			int i = 5;
			Boolean flag = false;// 标记是否找到最小的串
			String s = sc.nextLine();
			while (i <= s.length())// 循环找字符串的长度
			{
				for (int j = 0; j <= s.length() - i; j++)// (不用考虑循环的时候)
				{
					String str = s.substring(j, j + i);// 首尾相接的字符串
					if (str.contains("A") && str.contains("B") && str.contains("C") && str.contains("D")
							&& str.contains("E")) {
						flag = true;
						break;
					}
				}
				for (int k = s.length() - i + 1; k < s.length(); k++) {
					String str = s.substring(k, s.length()) + s.substring(0, (i + k) % (s.length()));// 首尾相应
					if (str.contains("A") && str.contains("B") && str.contains("C") && str.contains("D")
							&& str.contains("E")) {
						flag = true;
						break;
					}
				}
				if (flag == true) {
					break;
				} else {
					i++;
				}
			}
			if (i > s.length())//如果最终没有输出0
				System.out.println("0");
			else
				System.out.println(s.length() - i);
		}
	}

}
