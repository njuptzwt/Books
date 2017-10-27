package com.NiukeWang.program;

import java.util.Scanner;

//走网格
/**
 * 思路很重要，某个点的走法和上一部走法的联系 递推思想f(x,y)=f(x,y-1)+f(x-1,y);边缘除外
 * 
 * @author 18362
 *
 */
public class NetBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int[][] net = new int[x + 1][y + 1];// 网格点的定位，从左上角往左下角走，类似与左下角向右上角走
			for (int i = 0; i < x + 1; i++)
				net[i][0] = 1;// 边缘的点都是一种走法
			for (int j = 0; j < y + 1; j++)
				net[0][j] = 1;// 边缘
			for (int i = 1; i < x + 1; i++)
				for (int j = 1; j < y + 1; j++)
					net[i][j] = net[i - 1][j] + net[i][j - 1];// 网格中的节点处理的方式
			System.out.println(net[x][y]);

		}

	}

}
