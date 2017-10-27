package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 合法IP地址用try-catch来实现，数字转换异常
 * String []str1=ip.split("\\.");特殊地方
 * 
 * @author 18362
 *
 */
public class IlligalIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] str = s.split("\\.");
			Boolean flag = true;
			if (str.length < 4 || str.length > 4)
				System.out.println("NO");
			else {
				try {
					for (int i = 0; i < 4; i++) {
						int temp = Integer.parseInt(str[i]);
						if (temp < 0 || temp > 255) {
							flag = false;
							break;
						}
					}
				} catch (Exception e) {
					flag = false;
				}
				if (flag)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}
