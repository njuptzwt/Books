package com.NiukeWang.program;

import java.util.Scanner;

//简单点的方法，可以用正则表达式验证IP的合法性！
public class IP {
	static int count[] = new int[7];// 计数，ABCDE错误，私有IP分类

	public static void countIP(String s) {
		String str[] = s.split("~");// IP和掩码分离
		// 验证合法IP

		String substr[] = str[0].split("\\.");// IP分字符串分割需要转义符号！！
		String substr1[] = str[1].split("\\.");// IP的掩码分段
		if (substr.length != 4 || substr1.length != 4) {// 不等于4的字段不符合
			count[5]++;// IP不合法
		}
		// A类地址
		else if (Integer.valueOf(substr[0]) >= 1 && Integer.valueOf(substr[0]) <= 126) {
			Boolean flag = Yanzheng(substr);
			Boolean flag1 = YanzhengMask(substr1);
			if (flag && flag1) {
				count[0]++;
				if (Integer.valueOf(substr[0]) == 10) {
					count[6]++;// 私有地址加一
				}
			} else {
				count[5]++;
			}
		}
		// B类
		else if (Integer.valueOf(substr[0]) >= 128 && Integer.valueOf(substr[0]) <= 191) {
			Boolean flag = Yanzheng(substr);
			Boolean flag1 = YanzhengMask(substr1);
			if (flag && flag1) {
				count[1]++;
				// 判断私有地址范围
				if (Integer.valueOf(substr[0]) == 172 && (Integer.valueOf(substr[1]) >= 16)
						&& Integer.valueOf(substr[1]) <= 31) {
					count[6]++;// 私有地址加一
				}
			} else {
				count[5]++;// 否则错误
			}

		}
		// c类
		else if (Integer.valueOf(substr[0]) >= 192 && Integer.valueOf(substr[0]) <= 223) {
			Boolean flag = Yanzheng(substr);
			Boolean flag1 = YanzhengMask(substr1);
			if (flag && flag1) {
				count[2]++;
				// 判断私有地址范围！
				if (Integer.valueOf(substr[0]) == 192 && Integer.valueOf(substr[1]) == 168) {
					count[6]++;// 私有地址加一
				}
			} else {
				count[5]++;
			}
		}
		// D类
		else if (Integer.valueOf(substr[0]) >= 224 && Integer.valueOf(substr[0]) <= 239) {
			Boolean flag = Yanzheng(substr);
			Boolean flag1 = YanzhengMask(substr1);
			if (flag && flag1) {
				count[3]++;
			} else {
				count[5]++;
			}
		}
		// E类
		else if (Integer.valueOf(substr[0]) >= 240 && Integer.valueOf(substr[0]) <= 255) {
			Boolean flag = Yanzheng(substr);
			Boolean flag1 = YanzhengMask(substr1);
			if (flag && flag1) {
				count[4]++;
			} else {
				count[5]++;
			}
		} else {
			count[5]++;
		}
//		for (int i = 0; i < 6; i++)
//			System.out.print(count[i] + " ");
//		System.out.println(count[6]);
	}

	// 验证非法子网掩码，这个地方需要修改下！
	public static Boolean YanzhengMask(String[] str) {
		// 子网掩码也需要进行进一步的验证！！全部为255不正确
		if ((Integer.valueOf(str[0]) == 255 && Integer.valueOf(str[1]) == 255 && Integer.valueOf(str[2]) == 255
				&& Integer.valueOf(str[3]) == 255)||(Integer.valueOf(str[0]) == 0 && Integer.valueOf(str[1]) == 0 && Integer.valueOf(str[2]) == 0
				&& Integer.valueOf(str[3]) == 0)) {
			return false;
		}
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < 4; j++) {
			try {
				// 用异常捕捉处理空字符串或者其他不合理字符串
				if (!(Integer.valueOf(str[j]) >= 0 && Integer.valueOf(str[j]) <= 255)) {
					return false;// 超出的字符码范围也不合理
				}
				//toBinaryString这个函数不会显示8位byte值,掩码出错,增加判断掩码
				if(Integer.toBinaryString(Integer.valueOf(str[j])).length()<8)
				{
					StringBuilder newsb=new StringBuilder();
					for(int k=0;k<8-Integer.toBinaryString(Integer.valueOf(str[j])).length();k++)
                     newsb.append("0");
					sb.append(Integer.toBinaryString(Integer.valueOf(str[j])));
					sb.insert(8*j, newsb.toString());
				}
				else
					{
					sb.append(Integer.toBinaryString(Integer.valueOf(str[j])));
					}
				
			} catch (Exception e) {
				return false;
			}
		}
		String result = sb.toString();// 转化成十进制形式
//		System.out.println(result);
		int i = result.lastIndexOf("1");
		String subs = result.substring(0, i + 1);// 判断转换以后的二进制格式的IP最后一个1之前的代码是否存在0
		if (subs.contains("0")) {
			// 掩码不合法
			return false;
		}
		return true;
	}

	// 验证IP的格式是否合法
	private static Boolean Yanzheng(String[] substr) {
		// TODO Auto-generated method stub
		// try-catch的技巧性质很高！！！可以过滤异常数据！
		try {
			for (int i = 1; i < 4; i++) {
				// 用异常捕捉处理空字符串或者其他不合理字符串
				if (!(Integer.valueOf(substr[i]) >= 0 && Integer.valueOf(substr[i]) <= 255)) {
					return false;// 超出的字符码范围也不合理
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			count[i] = 0;
		}
		while (sc.hasNext()) {
			String s = sc.nextLine();
			countIP(s);
		}
		for (int i = 0; i < 6; i++)
			System.out.print(count[i] + " ");
		System.out.println(count[6]);
        sc.close();
	}

}
