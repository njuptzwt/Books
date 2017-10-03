package com.NiukeWang.program;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Apple {
	public static int AppleDivide(int total, int count, List<Integer> list) {
		int applecount = 0;
		if (total % count != 0)
			return -1;
		else if ((total / count) % 2 == 0) {
			// 每个人是偶数的时候开始分苹果
			for (int i = 0; i < count; i++) {
				// 如果存在奇数不能分配
				if (list.get(i) % 2 == 1) {
					return -1;
				}
				if (list.get(i) < total / count)
					applecount += ((total / count) - list.get(i)) / 2;
			}
		} else {
			for (int i = 0; i < count; i++) { // 如果存在偶数不能分配
				if (list.get(i) % 2 == 0) {
					return -1;
				}
				if (list.get(i) < total / count)
					applecount += ((total / count) - list.get(i)) / 2;
			}

		}
		return applecount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		while (sc.hasNextInt()) {
			int total = 0;
			int count = sc.nextInt();
			if (count >= 1 && count <= 100) {
				for (int j = 0; j < count; j++) {
					int temp = sc.nextInt();
					list.add(temp);
					total += temp;
				}
				int applecount = AppleDivide(total, count, list);
				list.clear();
				System.out.println(applecount);
			}

		}
	}
}
