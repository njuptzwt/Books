package com.NiukeWang.program;

import java.util.Scanner;
import java.util.TreeMap;

public class CountChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			int lastindex = 0;
			char[] count = s.toCharArray();
			for (int i = 0; i < count.length-2; i++) {
				sb.append(s);//每一次更新的位置不一样！！
				int totalcount = 1;
				if (!map.containsKey(String.valueOf(count[i]))) {
					if ((count[i] >= 'a' && count[i] <= 'z') || (count[i] >= 'A' && count[i] <= 'Z'))// 在这个范围内的数据可以考虑
					{
						for (int j = 0; j < 2; j++) {
							sb.deleteCharAt(sb.toString().indexOf(count[i]));// 删除一次字符之后的数据
							if (sb.toString().contains(String.valueOf(count[i]))) {
								totalcount++;
								lastindex = sb.toString().indexOf(count[i]);
							} else
								break;
						}
						if (totalcount == 3) {
							map.put(String.valueOf(count[i]), lastindex + 2);// 这边要注意
							map1.put(lastindex + 2, String.valueOf(count[i]));
						}
					}
				}
				sb.setLength(0);
			}
			if (map1 != null) {
				Integer a = map1.firstKey();
				System.out.println(map1.get(a));
//				for(Integer a:map1.keySet())
//				{
//					System.out.println(a);
//					System.out.println(map1.get(a));
//				}
			}

		}
	}

}
