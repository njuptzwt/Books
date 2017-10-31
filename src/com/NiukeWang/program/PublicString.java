package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 求最大的公共子字符串
 * 
 * @author 18362
 *
 */
public class PublicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			Boolean flag = false;// 标
			int finalresult = 1;//最终的结果
			if (str1.length() < str2.length()) {
				// 最外层循环控制子字符串的个数，里层控制个数
				for (int i = str1.length(); i >= 1; i--) {
					for (int k = 0; k < str1.length() + 1 - i; k++) {
						String str = str1.substring(k, k + i);
						if (str2.contains(str)) {
							flag = true;
							finalresult = i;
							break;
						}
					}
					if (flag)
						break;
				}
				System.out.println(finalresult);
			} else {
				for (int i = str2.length(); i >= 1; i--) {
					for (int k = 0; k < str2.length() + 1 - i; k++) {
						String str = str2.substring(k, k + i);
						if (str1.contains(str)) {
							flag = true;
							finalresult = i;
							break;
						}
					}
					if (flag)
						break;
				}
				System.out.println(finalresult);
			}

		}
	}

}
