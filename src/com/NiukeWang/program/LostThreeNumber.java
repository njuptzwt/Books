package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 遗失的三个数
 * 
 * @author 18362
 *
 */
public class LostThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] result = new int[3];// 最终的结果
		int flag = 0;// 标记是否有三个数字丢失了
		StringBuilder sb = new StringBuilder();// 存放最后的数据
		int now[] = new int[10001];// 定义10001的数，其中now[0]是没用的，初始化全部为0
		for (int i = 0; i < 9997; i++) {
			int temp = sc.nextInt();
			now[temp] = temp;
		}
		for (int j = 1; j < 10001; j++) {
			if (now[j] == 0)
				result[flag++] = j;
			if (flag > 3)
				break;
		}
		sb.append(result[0]).append(result[1]).append(result[2]);
		Long finalresult = Long.valueOf(sb.toString());// 长整形数据
		System.out.println(finalresult % 7);

	}

}
