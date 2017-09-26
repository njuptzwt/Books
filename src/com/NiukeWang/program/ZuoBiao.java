package com.NiukeWang.program;

import java.util.Scanner;

public class ZuoBiao {
//自己的答案！！！！！
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int r = 0, c = 0;// 初始化横坐标纵坐标
//		Boolean flag = true;
//		String s = sc.nextLine();
//		String[] s1 = s.split(";");
//		for (int i = 0; i < s1.length; i++) {
//			if (s1[i].length() > 3||s1[i].length()<2)// 字符串大于3舍弃
//			{
//				continue;
//			}
//			switch (s1[i].charAt(0)) {
//			case 'A':
//				String s2 = s1[i].substring(1);
//				flag = true;
//				for (int j = 0; j < s2.length(); j++) {
//					if (s2.charAt(j) < '0' || s2.charAt(j) > '9') {
//						flag = false;
//						break;
//					}
//				}
//				if (flag) {
//					r-= Integer.valueOf(s2);
//				}
//				break;
//			case 'D':
//				String s3 = s1[i].substring(1);
//				flag = true;
//				for (int j = 0; j < s3.length(); j++) {
//					if (s3.charAt(j) <'0' || s3.charAt(j) > '9') {
//
//						flag = false;
//						break;
//					}
//				}
//				if (flag) {
//					r += Integer.valueOf(s3);
//				}
//				break;
//			case 'W':
//				String s4 = s1[i].substring(1);
//				flag = true;
//				for (int j = 0; j < s4.length(); j++) {
//					if (s4.charAt(j) < '0' || s4.charAt(j) > '9') {
//
//						flag = false;
//						break;
//					}
//				}
//				if (flag) {
//					c += Integer.valueOf(s4);
//				}
//				break;
//			case 'S':
//				String s5 = s1[i].substring(1);
//				flag = true;
//				for (int j = 0; j < s5.length(); j++) {
//					if (s5.charAt(j) < '0' || s5.charAt(j) > '9') {
//
//						flag = false;
//						break;
//					}
//				}
//				if (flag) {
//					c -= Integer.valueOf(s5);
//				}
//				break;
//				default:break;
//			}
//		}
//System.out.println(r+","+c);
//	}
//
//}//别人的答案，没有限制输入的数据范围
	public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
//        Object ob=new Object();
//        ob.equals(ob);//equals的方法属于非静态的方法，这种方法可以重写，比较对象是否形同！instanceof是判断是否可以对象转化的子句。
        while(scan.hasNextLine()){
            int x=0;
            int y=0;
            String[]tokens=scan.nextLine().split(";");
            for(int i=0;i<tokens.length;i++){
                try{
                	//将不正确的输入当作异常处理(不能识别为整数的字符串,此处),异常抛出尽心继续操作！！
                    int b=Integer.parseInt(tokens[i].substring(1,tokens[i].length()));//通过trycatch语句捕捉异常，然后异常中直接继续下一步操作
                    if(tokens[i].charAt(0)=='A'){
 
                        x-=b;
                    }
                     if(tokens[i].charAt(0)=='W'){
                        y+=b;
                    }
                     if(tokens[i].charAt(0)=='S'){
                        y-=b;
                    }
                     if(tokens[i].charAt(0)=='D'){
                        x+=b;
                    }
                     
                     
                }catch(Exception e){
                    continue;
                }
            }
            System.out.println(x+","+y);
        
        }
    }
}