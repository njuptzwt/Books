package com.NiukeWang.program;

import java.util.Scanner;

public class Reverse2 {
	public static String reverse(String s) {
		String[] str = s.split(" ");
		StringBuilder sb = new StringBuilder("");
		//首个单词后面不要再加空格了
		for (int i = str.length - 1; i >0; i--) {//i>0,i=0单独考虑
			sb.append(str[i]).append(" ");
		}
		// for(String str1:str)
		// {
		// sb.append(str1)
		// }
		sb.append(str[0]);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String res = reverse(s);
		System.out.println(res);
	}

}
