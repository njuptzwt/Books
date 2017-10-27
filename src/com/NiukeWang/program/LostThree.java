package com.NiukeWang.program;
//算法本身没毛病，挺好的
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 丢失的三个数，先排序在对比
 * 
 * @author 18362
 *
 */
public class LostThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();// 输入的数组
		StringBuilder sb = new StringBuilder();
		int[] flag = new int[3];// 最终的三个数
		int totalcount = 0;// 计算缺少的数的数量
		int begin = 0;
		for (int i = 0; i < 9997; i++) {
			int temp = sc.nextInt();
			list.add(temp);
		}
		Collections.sort(list);// 重排序
		for (int j = 0; j < 9996; j++) {
			if (list.get(0) == 4) {
				totalcount = 3;
				flag[0] = 1;
				flag[1] = 2;
				flag[2] = 3;
			} else if (list.get(0) == 3) {
				totalcount = 2;
				flag[0] = 1;
				flag[1] = 2;
			} else if (list.get(0) == 2) {
				totalcount = 1;
				flag[0] = 1;
			} else {
				if (list.get(j + 1) - list.get(j) == 2) {
					flag[begin++] = list.get(j) + 1;
					totalcount++;
				} else if (list.get(j + 1) - list.get(j) == 3) {
					flag[begin++] = list.get(j) + 1;
					flag[begin++] = list.get(j) + 2;
					totalcount += 2;
				} else if (list.get(j + 1) - list.get(j) == 4) {
					flag[begin++] = list.get(j) + 1;
					flag[begin++] = list.get(j) + 2;
					flag[begin++] = list.get(j) + 3;
					totalcount = 3;
					;
				}
			}
			if (totalcount == 3)
				break;
		}
		if (totalcount == 0) {
			flag[0] = 9998;
			flag[1] = 9999;
			flag[2] = 10000;
		} else if (totalcount == 1) {
			flag[1] = 9999;
			flag[2] = 10000;
		} else if (totalcount == 2) {
			flag[2] = 10000;
		}
		sb.append(flag[0]).append(flag[1]).append(flag[2]);
		System.out.println(sb.toString());
		int finalresult = Integer.valueOf(sb.toString());
		System.out.println(finalresult % 7);

	}

}
