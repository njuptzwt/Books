package com.NiukeWang.program;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
//    while(sc.hasNextInt())//当程序运行到此阻塞，等待用户键盘输入，如果输入整数返回true继续运行，如果输入其他返回false跳出循环！
//    {
//    	System.out.println("请输入第一次");
//    	int count=sc.nextInt();
//    	int count1=sc.nextInt();
//    	System.out.println("请输入第二次"+count1);
//    	int count2=sc.nextInt();
//    	System.out.println("请输入第三次"+count2);
//    }
    while(sc.hasNext())
    {
    	System.out.println("先写next()"+sc.next());//next不会读取回车键，把回车键当作另一行处理，写入scanner,那么nextLine()会读取到回车符号！
    	System.out.println("输出nextline()"+sc.nextLine());//光标落在下一行起始位置
    	while(sc.hasNextLine())
    	{
    	System.out.println("先写nextline()"+sc.nextLine());//光标落在下一行起始位置,此时scanner中没有可读的字符串，阻塞直到键盘有输入
    	System.out.println("输出next()"+sc.next());//没有东西读取，会一直阻塞，直到有东西读取！
    	}
    }
	}

}
