package com.NiukeWang.program;

import java.util.Scanner;

//人民币转换
public class Test {
	public static String Exchange(int i) {
		StringBuilder sb = new StringBuilder();
		if (i >= 1000) {
			sb.append(IntToString(i / 1000)).append("仟");
			i = i % 1000;
			if (i >= 100) {
				sb.append(IntToString(i / 100)).append("佰");
				i = i % 100;
				if (i >= 10) {
					sb.append(IntToString(i / 10)).append("拾");
					i = i % 10;
					if (i > 0)
						sb.append(IntToString(i));
				} else if (i > 0) {
					sb.append("零");
					sb.append(IntToString(i));
				}
			} else if (i >= 10) {
				sb.append("零");
				sb.append(IntToString(i / 10)).append("拾");
				i = i % 10;
				if (i > 0)
					sb.append(IntToString(i));
			} else if (i > 0) {
				sb.append("零");
				sb.append(IntToString(i));
			}
			return sb.toString();
		} else if (i >= 100) {
			sb.append(IntToString(i / 100)).append("佰");
			i = i % 100;
			if (i >= 10) {
				sb.append(IntToString(i / 10)).append("拾");
				i = i % 10;
				if (i > 0)
					sb.append(IntToString(i));
			} else if (i > 0) {
				sb.append("零");
				sb.append(IntToString(i));
			}
			return sb.toString();
		} else if (i >= 10) {
			sb.append(IntToString(i / 10)).append("拾");
			i = i % 10;
			if (i > 0)
				sb.append(IntToString(i));
			return sb.toString();
		} else if (i > 0) {
			sb.append(IntToString(i));
			return sb.toString();
		}
		return null;
	}

	public static String IntToString(int i) {
		switch (i) {
		case 1:
			return "壹";
		case 2:
			return "贰";
		case 3:
			return "叁";
		case 4:
			return "肆";
		case 5:
			return "伍";
		case 6:
			return "陆";
		case 7:
			return "柒";
		case 8:
			return "捌";
		case 9:
			return "玖";
		case 0:
			return "零";
		}
		return null;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			StringBuilder sb1 = new StringBuilder();
			sb1.append("人民币");
			String s = sc.next();
			String[] str = s.split("[.]");// 特殊符号的格式用[.]或者//.表示123

			if (str[0].length() > 8) {
				sb1.append(Exchange(Integer.valueOf(str[0].substring(0, str[0].length() - 8)))).append("亿");
				if (Integer.valueOf(str[0].substring(str[0].length() - 8, str[0].length() - 4)) != 0) {
					sb1.append(Exchange(Integer.valueOf(str[0].substring(str[0].length() - 8, str[0].length() - 4))))
							.append("万");
				}
				sb1.append(Exchange(Integer.valueOf(str[0].substring(str[0].length() - 4, str[0].length()))))
						.append("元");
			} else if (str[0].length() > 4) {
				sb1.append(Exchange(Integer.valueOf(str[0].substring(0, str[0].length() - 4)))).append("万");
				sb1.append(Exchange(Integer.valueOf(str[0].substring(str[0].length() - 4, str[0].length()))))
						.append("元");
			} else {
				if (Integer.valueOf(str[0].substring(0, str[0].length())) > 0) {
					sb1.append(Exchange(Integer.valueOf(str[0].substring(0, str[0].length())))).append("元");
				}
			}
			if (Integer.valueOf(str[1]) == 0) {
				{
					sb1.append("整");
					if (String.valueOf(sb1.charAt(3)).equals("壹") && String.valueOf(sb1.charAt(4)).equals("拾")) 
					{
						sb1.deleteCharAt(3);
					}
				   System.out.println(sb1.toString());
				}

			} else {
				if (str[1].length() > 1) {
					if (Integer.valueOf(String.valueOf(str[1].charAt(0))) > 0) {
						sb1.append(IntToString(Integer.valueOf(String.valueOf(str[1].charAt(0))))).append("角");
						if(Integer.valueOf(String.valueOf(str[1].charAt(1)))>0)
								sb1.append(IntToString(Integer.valueOf(String.valueOf(str[1].charAt(1))))).append("分");
					} else
						sb1.append(IntToString(Integer.valueOf(String.valueOf(str[1].charAt(1))))).append("分");

				} else {
					sb1.append(IntToString(Integer.valueOf(String.valueOf(str[1].charAt(0))))).append("角");

				}
			}
			if (String.valueOf(sb1.charAt(3)).equals("壹") && String.valueOf(sb1.charAt(4)).equals("拾"))
				sb1.deleteCharAt(3);
			System.out.println(sb1.toString());
		}
	}
}
