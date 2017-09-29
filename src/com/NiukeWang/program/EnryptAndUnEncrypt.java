package com.NiukeWang.program;

import java.util.Scanner;

//使用查表的方法来替换字符串，古典密码学专用！
public class EnryptAndUnEncrypt {
 static char origin[]="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
 static char after[]="BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyza1234567890".toCharArray();
 public static void Encrypt (char aucPassword[], char aucResult[])
 {//加入continue节省时间
	 for(int i=0;i<aucPassword.length;i++)
		 for(int j=0;j<origin.length;j++)
			 if(aucPassword[i]==origin[j])
			 { aucPassword[i]=after[j];break;}
	 System.out.println(new String(aucPassword));
 }
 public static void unEncrypt (char result[], char password[])
 {
	 for(int i=0;i<result.length;i++)
		 for(int j=0;j<after.length;j++)
			 if(result[i]==after[j])
			 { result[i]=origin[j];break;}
	 System.out.println(new String(result));
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
char aucPassword[]=null;
char result[]=null;
while(sc.hasNextLine())
{
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	if(s1.length()<=100&&s2.length()<=100)//判断是否字符串长度小于100
	{
	aucPassword=s1.toCharArray();
	result=s2.toCharArray();
	Encrypt(aucPassword,aucPassword);
	unEncrypt(result,result);	}
}
	}

}
