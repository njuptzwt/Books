package com.NiukeWang.program;

import java.util.Scanner;

public class CountRabbit {
	public static int getTotalCount(int monthCount) {
		int totalcount = 0;
		int a[] = { 1, 0, 1 };
		for (int j = 3; j < monthCount; j++) {
			a[0] = a[0] + a[1];
			a[1] = a[2];
			a[2] = a[0];
		}
		totalcount = a[0] + a[1] + a[2];
		return totalcount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int totalcount = 0;
			int a[] = { 1, 0, 1 };
			int count = sc.nextInt();
			if (count <= 2)
				totalcount = 1;
			else if (count == 3)
				totalcount = 2;
			else {
				totalcount = getTotalCount(count);
			}
			System.out.println(totalcount);
		}
	}

}
