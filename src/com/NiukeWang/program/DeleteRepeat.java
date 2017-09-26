package com.NiukeWang.program;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
//主要思想都差不多,使用map，使用ContainsKey方法，主要的思想都差不多
public class DeleteRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext())//这种语句用来客户端多行输入，没有结束标志
		{
			StringBuilder sb=new StringBuilder("");
			HashMap<Character,Integer>total=new HashMap<Character,Integer>();
			String str=sc.next();
			if(str.length()<=20){
			char a[]=str.toCharArray();
			for(int i=0;i<a.length;i++)
			{
				if(total.containsKey(a[i]))
				{
					total.put(a[i], total.get(a[i])+1);
				}
				else
					total.put(a[i], 1);
			}
			Collection<Integer> col=total.values();//主要思想取出每一个字符的重复值,取出MAP对象中的值，返回Collection<T>值
			int index=Collections.min(col);//找出最小值中的下表！用map实现。很新颖~，找出集合最小值。
			for(int j=0;j<a.length;j++)
			{
				if(total.get(a[j])!=index)
					sb.append(a[j]);
			}
			}
			System.out.println(sb.toString());
		}
	}
}
//		while (sc.hasNextLine()) {
//			String str = sc.nextLine();
//			// 记录每个字符重复的次数，默认为1
//			if (str.length() <= 20) {
//				for (int i = 0; i < str.length() - 1; i++) {
//					temp = 1;
//					// 跳过已经计算过的部分
//					if (list2.contains(str.charAt(i))) {
//						continue;
//					} else {
//						for (int j = i + 1; j < str.length(); j++)
//
//						{
//							if (str.charAt(i) == str.charAt(j))
//								temp++;
//
//						}
//					}
//					list2.add(str.charAt(i));
//					list.add(temp);
//				}
//				if (!list2.contains(str.charAt(str.length() - 1))) {
//					list2.add(str.charAt(str.length() - 1));
//					list.add(1);// 最后一个数字单独加1
//				}
//				int index = Collections.min(list);// 记录字符数目
//				for (int k = 0; k < list.size(); k++)
//					// 寻找最小下标
//					if (list.get(k) == index) {
//						String s = String.valueOf(list2.get(k));// 将char类型字符集合结果集强制转化成String类型的字符
//						str = str.replace(s, "");
//					}
//				System.out.println(str);
//			}
//		}
	//借鉴别人的思路，使用HashMap来使用
//		
//	}
//}
