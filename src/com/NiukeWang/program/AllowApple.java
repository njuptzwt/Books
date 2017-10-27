package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 分配苹果,使用递归的思想
 * 1、递归的推导表达式 
 * 2、递归的结束点合理定义
 * 这边的f(m,n)=f(m,n-1)+f(m-n,n)讨论在m>=n的情况中所使用
 * 当前的总数量等于全部盘子中都有苹果的方案+当前至少有一个盘子没有苹果的方案
 * 如果m<n那么注定有盘子是空的返回f(m,m)
 * 递归的两条路，第一条n会逐渐减少，终会到达出口n==1;
        第二条m会逐渐减少，因为n>m时，我们会return f(m,m)　所以终会到达出口m==0．
 * @author 18362
 *
 */
public class AllowApple {
public static int f(int m,int n)
{
	if(m==0||n==1)
		return 1;//递归的出口
	else if(n>m)
		return f(m,m);//讨论的情况
	else
		return f(m,n-1)+f(m-n,n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNext())
{
	int a=sc.nextInt();//苹果数目
	int b=sc.nextInt();//盘子数目
	int count=0;//统计符合条件的情况
	if((a>=1&&a<=10)&&(b>=1&&b<=10))
	{
		count=f(a,b);
	}
	else
		count=-1;
	System.out.println(count);
}
	}

}
