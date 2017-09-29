package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//用插入排序做
public class StrSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();// 记录非ABCd的字符串的下标位置
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextLine()) {
			list.clear();//清空数组对象
			String str = sc.nextLine();
			char a[] = str.toCharArray();
			for (int i = 0; i < str.length(); i++) {
				if (!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')))
                     
					list.add(i);
				else {
					sb.append(str.charAt(i));
				}
			}
			char c[] = sb.toString().toCharArray();// 记录字母的顺序，排除了非字母的字符
			String d = sb.toString().toLowerCase();// 用来排序比较的字符串
			char e[] = d.toCharArray();
			// 插入排序代码
			for (int i = 1; i < e.length; i++) { // position
				for (int j = i; j > 0; j--) {
					if (e[j] < e[j - 1]) {
						char temp = e[j];
						e[j] = e[j - 1];
						e[j - 1] = temp;
						// 字母重新排序
						char temp1 = c[j];
						c[j] = c[j - 1];
						c[j - 1] = temp1;
					}
				}
			}
			sb.setLength(0);//清空StringBuilder的对象
			sb.append(new String(c));
			//将非字符数据插回原数组
			for(int j=0;j<list.size();j++)
			{ 
				int index=list.get(j);
				char con=a[index];
				sb.insert(index,con);
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}

}
