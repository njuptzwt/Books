package com.NiukeWang.program;
//自然数包括0
import java.util.Scanner;

public class Defender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0;
		Boolean flag=false;
		while (sc.hasNext()) {
			int n = sc.nextInt();
			for (int j = 1; j < n + 1; j++) {
				//额外多算一个0就可以了，不需要计算以0结尾的数字
				if (j % 10 == 1 || j % 10 == 5 || j % 10 == 6)
				{
					int i=j;
					flag = true;// 标记是否是自卫数
					int sum = i * i;
					sum = sum / 10;
					i = i / 10;
					while (i > 0) {
						if (i % 10 == sum % 10) {
							i = i / 10;
							sum = sum / 10;
						} else {
							flag = false;
							break;
						}
					}
				}
				if(flag)
					{
					count++;
					flag=false;
					}
				
			}
			System.out.println(count+1);//输出0多一个
			count=0;
		}
	}

}
