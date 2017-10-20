package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdentityCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			StringBuilder sb = new StringBuilder(s);
			for (int i = 0; i < s.length(); i++) {
				if (s.contains(" ")) {
					sb.deleteCharAt(s.indexOf(" "));
					s = sb.toString();
					i--;
				}
			}
			list.add(s);
		}
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).length() <= 6)
				System.out.println(list.get(j));
			else if (list.get(j).length() > 6 && list.get(j).length() <= 14)
				System.out.println(list.get(j).substring(0, 6) + " " + list.get(j).substring(6, list.get(j).length()));
			else
				System.out.println(list.get(j).substring(0, 6) + " " + list.get(j).substring(6, 14) + " "
						+ list.get(j).substring(14, list.get(j).length()));
		}
	}

}
