package com.NiukeWang.program;

import java.util.Scanner;

//酒店的价格，核心思想是使用数组来存取每一天的数据
public class HotelPrice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100000];// 上限只有这么几天
		int max = -1;
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			String str[] = s.split(" ");
			int begin = Integer.valueOf(str[0]);
			int end = Integer.valueOf(str[1]);
			int price = Integer.valueOf(str[2]);
			for (int i = begin; i <= end; i++)
				a[i] = price;
			max = Math.max(max, end);// 最大的天数
		}
		Boolean flag = false;
		int begin = 0;
		for (int i = 0; i <= max; i++) {
			if (a[i] != 0) {
				if (!flag) {
					// falg用来记录每一个区间的开始
					flag = true;
					begin = i;
				}
				if (a[i] != a[i + 1]) {// 标志一个区间的开始和结束
					if (i == max)
						System.out.print("[" + begin + "," + i + "," + a[i] + "]");
					else
						System.out.print("[" + begin + "," + i + "," + a[i] + "]" + ",");
					flag = false;// 标记，没一个区间都要有一个标记
				}
			}
		}
	}
}