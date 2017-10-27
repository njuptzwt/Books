package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 最大连续的子字符串
 * 
 * @author 18362
 *
 */
public class MaxiumStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> list1 = new ArrayList<String>();// 记录字符串
		List<Integer> list2 = new ArrayList<Integer>();// 记录数字长度
		while (sc.hasNextLine()) {
			list1.clear();
			list2.clear();
			String str = sc.nextLine();
			if (str.length() <= 0) {
				System.out.println("" + "," + "0");
			} else {
				for (int i = 0; i < str.length(); i++) {
					// 找到所有的数字字符串，首先找到第一个数字所在处
					if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
						int j = i + 1;
						for (; j < str.length(); j++) {
							// 数字结束处
							if (!(str.charAt(j) >= '0' && str.charAt(j) <= '9')) {
								list1.add(str.substring(i, j));// 总共几个字符串
								list2.add(j - i);// 每一个字符串的长度
								break;
							}
						}
						if (j == str.length()) {
							// 如果不巧，恰好是最后一个数字字符串
							list1.add(str.substring(i, j));// 总共几个字符串
							list2.add(j - i);// 每一个字符串的长度
						}
						i = j;// 下一轮从j开始
					}
				}
				if (list1.size() > 0) {
					Collections.sort(list2);
					int max = list2.get(list2.size() - 1);
					for (String s : list1) {
						if (s.length() == max)
							System.out.print(s + ",");
					}
					System.out.println(max);
				} else
					System.out.println("" + "," + "0");// 没有数字串
			}
		}
	}

}
