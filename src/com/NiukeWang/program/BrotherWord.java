package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//字典顺序，有些时候要对Collections的sort()方法进行重新改写
public class BrotherWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();// 记录字典
		List<String> sublist = new ArrayList<String>();// 记录兄弟字典集合
		while (sc.hasNextInt()) {
			int count = sc.nextInt();
			if (count >= 0 && count <= 1000) {
				for (int i = 0; i < count; i++) {
					String s = sc.next();
					if (s.length() < 1 || s.length() > 50)
						i--;
					else
						list.add(s);// 字典
				}
				Collections.sort(list);// 字典排序
				String str = sc.next();// 输入要查找的单词
				int index = sc.nextInt();// 兄弟节点的第几个
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).length() == str.length() && !(list.get(j).equals(str))) {
						StringBuilder sb = new StringBuilder();
						Boolean flag = true;
						sb.append(list.get(j));
						for (int k = 0; k < str.length(); k++) {
							if (sb.toString().contains(String.valueOf(str.charAt(k))))
								sb.deleteCharAt(sb.toString().indexOf(str.charAt(k)));
							else {
								flag = false;
								sb.setLength(0);
								break;
							}
						}
						sb.setLength(0);
						if (flag) {
							sublist.add(list.get(j));
						}
					}
				}
				if (sublist != null) {
					System.out.println(sublist.size());
					if (index <= sublist.size()) {
						System.out.println(sublist.get(index - 1));
					}
				} else {
					System.out.println("0");
				}
				list.clear();
				sublist.clear();
			}
		}
	}

}
