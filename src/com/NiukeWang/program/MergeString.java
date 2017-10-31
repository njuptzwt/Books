package com.NiukeWang.program;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 数组合并.treeSet或者treemap的有序性，无重复性Hashset和Hashmap的随机性和不可重复性
 * 
 * @author 18362
 *
 */
public class MergeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new TreeSet<Integer>();
		while (sc.hasNext()) {
			set.clear();
			int first = sc.nextInt();// 第一个数组的个数
			for (int i = 0; i < first; i++) {
				int temp = sc.nextInt();
				set.add(temp);
			}
			int second = sc.nextInt();
			for (int i = 0; i < second; i++) {
				int temp = sc.nextInt();
				set.add(temp);
			}
			for (Integer temp : set)
				System.out.print(temp);
			System.out.println();
		}
	}

}
