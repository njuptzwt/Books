package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 密码强度等级
 * 
 * @author 18362
 *
 */
public class PasswordStrength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str2 = "abcdefghijklmnopqrstuvwxyz";
		while (sc.hasNext()) {
			String str = sc.next();// 获取字符串
			int score = 0;// 得分
			if (str.length() <= 4) {
				score = 5;
			} else if (str.length() >= 5 && str.length() <= 7)
				score = 10;
			else
				score = 25;
			// 二次判断
			Boolean flag1 = true;// 是否有小写字母
			Boolean flag2 = true;// 是否有大写字母
			for (int i = 0; i < str.length(); i++) {
				if (flag1 && str1.contains(String.valueOf(str.charAt(i)))) {
					score += 10;// 有大写字母
					flag1 = false;
				}
				if (flag2 && str2.contains(String.valueOf(str.charAt(i)))) {
					score += 10;// 有小写字母
					flag2 = false;
				}
				if (!flag1 && !flag2) {
					break;
				}
			}
			// 第三次判断是否有数字
			int total = 0;// 统计数字的个数
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) >= '0' && str.charAt(j) <= '9')
					total++;// 统计数字的个数
				if (total >= 2)
					break;
			}
			if (total == 1)
				score += 10;
			else if (total == 2)
				score += 20;
			// 第四次判别
			int total1 = 0;
			for (int k = 0; k < str.length(); k++) {
				if (!str1.contains(String.valueOf(str.charAt(k))) && (!str2.contains(String.valueOf(str.charAt(k))))
						&& !(str.charAt(k) >= '0' && str.charAt(k) <= '9')) {
					total1++;// 如果有非字符，非字符得分
					if (total1 >= 2)
						break;
				}
			}
			if (total1 == 1)
				score += 10;
			if (total1 == 2)
				score += 25;
			// 加分项
			if ((!flag1 || !flag2) && total > 0) {
				score += 2;// 有字母和数字
				if (total1 > 0) {
					score += 1;// 如果还有其他符号
					if (!flag1 && !flag2)
						score += 2;// 如果大小写字母都有
				}
			}
			/**
			 * 开始评分
			 */
			if (score >= 50) {
				switch (score / 10) {
				case (9):
					System.out.println("VERY_SECURE");
					break;
				case (8):
					System.out.println("SECURE");
					break;
				case (7):
					System.out.println("VERY_STRONG");
					break;
				case (6):
					System.out.println("STRONG");
					break;
				case (5):
					System.out.println("AVERAGE");
				}
			} else {
				if (score >= 25)
					System.out.println("WEAK");
				else
					System.out.println("VERY_WEAK");
			}
		}

	}

}
