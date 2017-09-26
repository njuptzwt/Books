package com.NiukeWang.program;

import java.util.Scanner;
//优化方法查表法
public class PasswordExchange {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//		String s2="bcdefghijklmnopqrstuvwxyza22233344455566677778889999";//查表法
		Scanner sc = new Scanner(System.in);
		StringBuffer newString = new StringBuffer();
		while (sc.hasNext()) {
			// 字符串超过100或者字符串有空不计算
			String s = sc.next();
			if (s.length() > 100 || s.contains(" ")) {
				continue;
			}
			newString.append(s);
			for (int j = 0; j < s.length(); j++) {
				// 第一类
				if (s.charAt(j) - 'a' >= 0 && s.charAt(j) - 'a' <= 2) {
					newString.setCharAt(j, '2');
				}
				// 第二类
				else if (s.charAt(j) - 'd' >= 0 && s.charAt(j) - 'd' <= 2) {
					newString.setCharAt(j, '3');
				} else if (s.charAt(j) - 'g' >= 0 && s.charAt(j) - 'g' <= 2) {
					newString.setCharAt(j, '4');
				} else if (s.charAt(j) - 'j' >= 0 && s.charAt(j) - 'j' <= 2) {
					newString.setCharAt(j, '5');
				} else if (s.charAt(j) - 'm' >= 0 && s.charAt(j) - 'm' <= 2) {
					newString.setCharAt(j, '6');
				} else if (s.charAt(j) - 'p' >= 0 && s.charAt(j) - 'p' <= 3) {
					newString.setCharAt(j, '7');
				} else if (s.charAt(j) - 't' >= 0 && s.charAt(j) - 't' <= 2) {
					newString.setCharAt(j, '8');
				} else if (s.charAt(j) - 'w' >= 0 && s.charAt(j) - 'w' <= 3) {
					newString.setCharAt(j, '9');
				}
				// 大写字母转化
				else if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
					newString.setCharAt(j, (char) (newString.charAt(j) + 32));
					if (newString.charAt(j) != 'z') {
						newString.setCharAt(j, (char) (newString.charAt(j) + 1));
					} else {
						newString.setCharAt(j, 'a');
					}

				}

			}
			System.out.println(newString.toString());
		}
	}

}
