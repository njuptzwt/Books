package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 排序找出前k个最小的值
 * 
 * @author 18362
 *
 */
public class SortK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int temp = sc.nextInt();
				list.add(temp);
			}
			Collections.sort(list);
			for (int j = 0; j < k - 1; j++)
				System.out.print(list.get(j) + " ");
			System.out.println(list.get(k - 1));
			list.clear();
		}
	}

}
