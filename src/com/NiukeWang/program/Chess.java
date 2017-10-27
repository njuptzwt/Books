package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 象棋的网格走法，和格子走法一摸一样 f(x,y)=f(x,y-1)+f(x-1,y)某个坐标的走的方法数的递推公式
 * 最左边的一列和最下边的一列只有一种走法，上面的递推不包括这两行
 * 
 * @author 18362
 *
 */
public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int count[][] = new int[a + 1][b + 1];// 点数比格子数多
			for (int i = 0; i < b + 1; i++)
				count[0][i] = 1;// 最左边的点的走法
			for (int i = 0; i < a + 1; i++)
				count[i][0] = 1;// 最底边的点的走法
			for (int i = 1; i < a + 1; i++)
				for (int j = 1; j < b + 1; j++)
					count[i][j] = count[i][j - 1] + count[i - 1][j];
			System.out.println(count[a][b]);
		}
	}

}
