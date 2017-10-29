package com.NiukeWang.program;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * java中处理高精度的数字的计算
 * 大数相乘。大数相加，大数相减！！
 * 节省很多时间
 * @author 18362
 *
 */
public class BigIntegerAndBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNext())
{
	BigInteger a=sc.nextBigInteger();
	BigInteger b=sc.nextBigInteger();
	System.out.println(a.add(b));
}
	}

}
