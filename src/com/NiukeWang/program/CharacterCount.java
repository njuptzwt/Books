package com.NiukeWang.program;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNextLine())
{
	String s=sc.nextLine();
	char[] ch=s.toCharArray();
	int []count=new int[4];
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==32)
			count[1]++;//空格
		else if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
			count[0]++;//英文
		else if(ch[i]>='0'&&ch[i]<='9')
			count[2]++;//数字
		else
			count[3]++;//其他
	}
	for(int i=0;i<4;i++)
		System.out.println(count[i]);
}
	}

}
