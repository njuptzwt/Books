package com.NiukeWang.program;

import java.io.IOException;
import java.util.Scanner;

public class Flower {
	public static void count(int a, int b) {
		Boolean flag = true;
		StringBuilder sb = new StringBuilder();
		for (int i = a; i <= b; i++) {
			int temp = i;
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += (temp % 10) * (temp % 10) * (temp % 10);
				temp = temp / 10;
			}
			if (sum == i) {
				sb.append(i).append(" ");
				flag = false;
			}
		}
		if(sb.length()>1)
		sb.deleteCharAt(sb.lastIndexOf(" "));
		if (flag)
			System.out.println("no");
		else
			System.out.println(sb.toString());
		sb.setLength(0);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			count(a,b);
			
		}
}
}