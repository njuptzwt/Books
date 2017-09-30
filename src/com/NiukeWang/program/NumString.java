package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//利用List的按照字典排序的顺序(重写sort方法)排序方法
public class NumString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		while (sc.hasNextInt()) {
			int count = sc.nextInt();
			if (count > 0 && count <= 100) {
				for (int i = 0; i < count; i++) {
					int result = sc.nextInt();
					if (result <= 1000) {
						String s = String.valueOf(result);
						list.add(s);
					}
				}
				//重新写Collections的比较器，实现Comparator的接口。
				Collections.sort(list, new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						//按照降序的方式排列
						return (o2 + o1).compareTo(o1 + o2);
					}
				});
				for (String str : list)
					sb.append(str);// 利用字符出串数组重新排列数字
				System.out.println(sb.toString());
				sb.setLength(0);// 清空字符串
				list.clear();// 清空存储的数组

			}
		}
	}
}