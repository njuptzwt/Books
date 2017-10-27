package com.NiukeWang.program;

import java.util.Scanner;

public class LuckyNumber {
	public static Boolean isLucky(int count) {
		int temp1 = 0;
		int temp2 = 0;
		int i = count;
		int j = count;
		while (i > 0) {
			temp1 += i % 10;
			i = i / 10;
		}
		temp1 += i;
		while (j / 2 > 0)// 二进制相加
		{
			temp2 += j % 2;
			j = j / 2;
		}
		temp2 += j;
		if (temp1 == temp2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int count = sc.nextInt();
			int totalcount = 0;
			for (int i = 1; i <= count; i++) {
				if (isLucky(i))
					totalcount++;
			}
			System.out.println(totalcount);
		}
	}

}
