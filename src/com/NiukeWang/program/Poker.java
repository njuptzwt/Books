package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 扑克牌的比较大小，由输入控制合法性
 * 
 * @author 18362
 *
 */
public class Poker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String order = "345678910JQKA2jokerJOKER";
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] str = s.split("-");
			String[] str1 = str[0].split(" ");
			String[] str2 = str[1].split(" ");
			String result = "ERROR";
			// 如果两边比较的是相同长度的数字
			if (str1.length == str2.length)
				if (order.indexOf(str1[0]) < order.indexOf(str2[0]))
					result = str[1];
				else
					result = str[0];
			// 如果两边比较的是不同长度的字符串
			else {
				// 如果有王炸,字符串比较用equals，忘记了
				if (str[0].equals("joker JOKER") || str[1].equals("joker JOKER"))
					result = "joker JOKER";
				else if ((str1.length == 4 && str1[0].equals(str1[1])) || (str2.length == 4 && str2[0].equals(str2[1])))
				// 没有王炸,有炸弹
				{
					if (str1.length == 4)
						result = str[0];
					else
						result = str[1];
				}
			}
			System.out.println(result);
		}
	}

}
