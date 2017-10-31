package com.NiukeWang.program;

import java.util.Scanner;

/**
 * 尼科彻斯定理
 * @author 18362
 *
 */
public class NiGuCheSiPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNext())
{
	int m=sc.nextInt();
	int result=m*m*m;
	int minus=0;
	for(int i=1;i<m;i++)
		minus+=2*i;
	int begin=(result-minus)/m;
	for(int i=0;i<m-1;i++)
		System.out.print(begin+i*2+"+");
	System.out.println(begin+2*(m-1));
}
	}

}
