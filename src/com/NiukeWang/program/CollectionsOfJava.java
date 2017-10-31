package com.NiukeWang.program;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 集合合并,用插入排序最快
 * 
 * @author 18362
 *
 */
public class CollectionsOfJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new TreeSet<Integer>();
		while (sc.hasNext()) {
			int numberA = sc.nextInt();
			int numberB = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < numberA + numberB; i++) {
				int temp = sc.nextInt();
				set.add(temp);
			}
			for (Integer i : set)
				sb.append(i).append(" ");
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}

}
