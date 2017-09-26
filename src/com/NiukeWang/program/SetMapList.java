package com.NiukeWang.program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//验证set集合和list集合他们都继承于collection集合，拥有他们的方法，set集合中不允许出现相同的值，相同的值会覆盖掉
public class SetMapList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();// 需要用nextline取去接收完整的字符串
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 0 && s.charAt(i) <= 127) {
				set.add(s.charAt(i));// 利用set的不可重复性解决问题
			}
		}

		for (Iterator it = set.iterator(); it.hasNext();) {
			it.next();
			j++;
		}
		System.out.println(j);
	}

}
