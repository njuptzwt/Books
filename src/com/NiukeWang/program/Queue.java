package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();// 记录人数
		List<Integer> deletecount = new ArrayList<Integer>();// 记录删除个数
		for (int i = 0; i < count; i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		// 开始移除操作
		for (int i = 0; i < list.size(); i++) {//最外层循环控制以哪个人为中间节点
			int before = 0, after = 0;
			if (i == 0) {
				int temp=list.get(0);//定义temp作为比较节点
				for (int j = 1; j < list.size(); j++)
					if (temp>list.get(j))
						{
						temp=list.get(j);//后面比前面大，换数：//这个逻辑存在问题！不能达到最小的要求！
						}
					else
					{
						after++;
					}
				deletecount.add(after);
			} else if (i == list.size() - 1) {
				int temp=list.get(list.size()-1);
				for (int j = i - 1; j >= 0; j--)
					if (temp>list.get(j))
						{
						temp=list.get(j);
						}
					else{
						before++;
					}
				deletecount.add(before);
			} else {
				int temp1=list.get(i);
				for (int j = i + 1; j < list.size(); j++)
				{
                    if(temp1>list.get(j))
                    {
                    	temp1=list.get(j);
                    }
                    else{
                    after++;
                    }
				}
				temp1=list.get(i);//这个逻辑没有毛病啊
				for(int k=i-1;k>=0;k--)
				{
					if(temp1>list.get(k))
					temp1=list.get(k);
					else
					{
						before++;
					}
				}
				deletecount.add(after+before);
			}
		}
		System.out.println(Collections.min(deletecount));
	}
}
