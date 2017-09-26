package com.NiukeWang.program;
import java.util.Scanner;

public class DrinkWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;// 初始化输入的数据
		int count = 0;// 计算喝水的数量
		int count1 = 0;// 每次喝的瓶子
		// 喝水的数量
		while (sc.hasNextInt()) {//这行语句可以	控制多行输入
			count = 0;
			int k = sc.nextInt();
			if (k == 0) {
				break;// 跳出for循环和while循环都可以，可以终止输入！！方法
			}
			while (k > 0) {
				if (k < 2) {
					k = 0;
				} else if (k == 2) {
					count++;
					k = 0;
				} else {
					count1 = k / 3;// 每次喝多的瓶子
					count += count1;
					k = k % 3 + count1;
				}
			}
System.out.println(count);
		}
	}
}
