package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//0-1背包的最优化问题,从后往前考虑
public class Bag01 {
	private static List<Integer> list = new ArrayList<Integer>();
	private static List<Integer> finallist = new ArrayList<Integer>();
	public static void repeate(int[] array,int count)
	{
		// 从数组最后一组算起
					if (count == 1)
						list.add(1);
					else {
						if (array[count - 2] < array[count - 1]) {
							list.add(array[count - 2]);
							list.add(array[count - 1]);
						} else
							list.add(array[count - 2]);// 始终把较大的值留下
						if (count >= 3) {
							for (int j = count - 3; j >= 0; j--) {
								// 主要逻辑，如果，小于后面的最小值，直接加入，为了节省时间可以用list.get(0);
								if (array[j] < Collections.min(list))
									list.add(array[j]);
								else {
									if (list.size() != 1)//
									{
										if (array[j] < list.get(1) && array[j] > list.get(0)) {
											// 如果不是，如果在list.get(0)和list.get(1)
											if (array[j] < list.get(1))
												list.set(0, array[j]);// 始终以大的值替换小的值
										}
									} else
										list.set(0, array[j]);// 考虑只有一种情况，从大到小分配
								}
								Collections.sort(list);
							}
						}
					}
					finallist.add(list.size());
					list.clear();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int count = sc.nextInt();
			int[] array = new int[count];
			for (int i = 0; i < count; i++)
				array[i] = sc.nextInt();// 登记数组
			for(int i=0;i<count;i++)
				repeate(array,i+1);
			System.out.println(Collections.max(finallist));
		}
	}

}
