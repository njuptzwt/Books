package com.NiukeWang.program;
/**
 * 注意String是不可变的变量！常量池！！ 
 * StringBuilder类型或者是StringBuffer类型的数据！！！！
 * 他们指向的是引用数据类型！！
 * 地址，值可以改变！！！
 * @author 18362
 *
 */
public class InterfaceTest{
    String str=new String("tarena");//String是常量池，不可改变！！需要改变可以构建StringBUilder变量！！！！需要多注意！！！
    char[]ch={'a','b','c'};
    public static void main(String args[]){
    	System.out.println(Math.floor(-8.5));
    	InterfaceTest ex=new InterfaceTest();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
   //引用类型变量，传递的是地址，属于引用传递。
        str="test ok";
        ch[0]='g';
    }
}

