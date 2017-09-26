package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reapeat {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");//和hashset和hashmap一样，如果没有用构造函数初始化，会出现空指针异常！
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int num = sc.nextInt();// 阻塞等待输入int型的数据（默认以空格隔开)
		while (num > 0) {
			if (!list.contains(num % 10))// list的contains函数的使用，很有用,如果不存在该元素
				list.add(num % 10);
			num = num / 10;
		}
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		Integer fi = Integer.valueOf(sb.toString());
		System.out.println(fi);
	}

}
