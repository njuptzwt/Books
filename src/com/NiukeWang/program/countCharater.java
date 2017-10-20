package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//冒泡排序算法的使用
public class countCharater {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = " 0123456789ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";// 按照ASCII码表来放置大小顺序
		while (sc.hasNext()) {
			StringBuilder sb = new StringBuilder();
			List<Integer> list1 = new ArrayList<Integer>();
			List<Character> list2 = new ArrayList<Character>();
			int[] count = new int[str.length()];
			char[] ch;
			String s = sc.nextLine();
			ch = s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (str.contains(String.valueOf(ch[i]))) {
					int index = str.indexOf(ch[i]);
					count[index]++;// 统计字符的个数
				}
			}
			// 选择有效的数组
			for (int i = 0; i < count.length; i++) {
				if (count[i] != 0) {
					list1.add(count[i]);
					list2.add(str.charAt(i));// 对应值
				}
			}
			// 循环输出最大值
			while (list1.size() > 0) {
				int index = list1.indexOf(Collections.max(list1));// 返回第一个返回的最大值下标
				sb.append(list2.get(index));
				list1.remove(index);
				list2.remove(index);
			}
			list1.clear();
			list2.clear();
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}
