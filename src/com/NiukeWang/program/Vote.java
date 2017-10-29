package com.NiukeWang.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 使用Map投票,不会按照顺序
 * 
 * @author 18362
 *
 */
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();// 记录每一位人的得票
		List<String> list1 = new ArrayList<String>();// 记录候选人的名字
		while (sc.hasNext()) {
			int number1 = sc.nextInt();// 输入参与选票的人
			int Invalid = 0;
			for (int i = 0; i < number1; i++) {
				String name = sc.next();
				list1.add(name);
				map.put(name, 0);// 每一位竞选者初始化
			}
			int number2 = sc.nextInt();// 投票者投票
			for (int j = 0; j < number2; j++) {
				String vote = sc.next();
				if (map.containsKey(vote))
					map.put(vote, map.get(vote) + 1);
				else
					Invalid++;
			}
			for (String key : list1) {
				System.out.println(key + " : " + map.get(key));
			}
			System.out.println("Invalid : " + Invalid);
			map.clear();// 清空
			list1.clear();// 清空
		}
	}

}
