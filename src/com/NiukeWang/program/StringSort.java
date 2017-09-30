package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//对list类型往往需要实现自己的重排序方法，treemap的实现字典顺序排列(String 的compareTo方法改造)
public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>newlist=new ArrayList<String>();
newlist.add("678");
newlist.add("67845");
newlist.add("12");
newlist.add("67217");
for(String str:newlist)
	System.out.println(str);
Collections.sort(newlist);
System.out.println("按照字符串(默认)升序排列");
for(String s:newlist)
	System.out.println(s);
//按照降序排列(自定义的排序) new Comparator()指定sort中元素的排序方式
	Collections.sort(newlist, new Comparator<String>() {
		@Override
	
		public int compare(String o1, String o2) {
			//按照降序的方式排列（改写变成O2和o1对比，降序排列，非字典序列)
			return o2.compareTo(o1);
		}
	});
	System.out.println("按照(改写排序方式)降序排列");
	for(String s:newlist)
	System.out.println(s);
//按照自定义的排列排序
	Collections.sort(newlist, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			//按照降序的方式排列,且需要满足别的条件（这边排序的规则是两个字符串看谁组成的字符串大，谁就在前面）
			return (o2+o1).compareTo(o1+o2);
		}
	});
	System.out.println("按照指定格式降序排列");
	for(String s:newlist)
	System.out.println(s);
}
}
