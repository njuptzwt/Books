package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 文件的后缀名
 * 
 * @author 18362
 *
 */
public class FileNameExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.next();
			if (s.contains(".")) {
				int index = s.lastIndexOf(".");
				String str = s.substring(index + 1, s.length());
				System.out.println(str);
			} else
				System.out.println("null");
		}
	}

}
