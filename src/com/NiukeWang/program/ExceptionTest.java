/*
 * throw 允许我们抛出自己定义的对象异常
 * 
 * 
 * 异常的知识
 * 5、Exception（异常）：出现原因取决于程序，所以程序也理应通过try-catch处理。 
异常分为两类：可查异常与不可查异常。
可查异常：编译器要求必须处理，否则不能通过编译，使用try-catch捕获或者throws抛出。常见的可查异常有IOException（IO错误）及其子类EOFExcption(文件已结束异常)、FileNotFound（文件未找到异常）。
不可查异常（也叫运行时异常）：编译期不会检查，所以在程序中可不处理，但如果发生，会在运行时抛出。所以这类异常要尽量避免！常见的不可查异常都是RuntimeException类及其子类。
1’ NullPointerException：空指针异常。调用了不存在的对象或未经实例化或初始化的对象时会抛出，如当试图操作一个空对象（赋值为null）的属性、方法时就会抛出。
（实例化：通俗的理解就是为对象开辟空间，使其可在规定范围内被调用。注意：User u;这只是一个对象声明，并没有进行实例化或初始化。 
初始化：就是把实例化后的对象中的基本数据类型字段赋默认值或设定值，为非基本类型赋值null，对于static字段只会初始化一次。）
2’ ArithmeticException：算术条件异常。最常见的就是0作除数时会抛出。
3’ ClassNotFoundException：类未找到异常。在通过反射Class.forName(“类名”)来获取类时，如果未找到则会抛出异常。
4’ ArrayIndexOutOfBoundsException：数组索引越界异常。当试图操作数组的索引值为负数或大于等于数组大小时会抛出。
5’ NegativeArraySizeException：数组长度为负值异常。一般在初始化数组大小为负值时抛出。
6’ ArrayStoreException：数组类型不匹配值异常。例如将一个Object数组中加入一个Integer对象与一个String对象时，类型不匹配就会抛出。
7’ IllegalArgumentException：非法参数异常。会在使用Java类库方法时传入参数值越界时抛出。
二、异常处理 
Java中的异常处理原则：必须声明抛出异常或捕获可查异常，允许忽略Error与不可查异常。

四、异常链与异常栈轨迹

常规异常：由Java所定义的异常，不需要异常声明，在未被try-catch的情况下，会被默认上报到main()方法。
异常的冒泡上传机制：当一个异常对象产生了以后，其会按照调用层次（一般是方法的调用层次）进行冒泡，直到被try-catch处理，或上报至main()方法。
 */
package com.NiukeWang.program;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest {
	// 通过throw抛出的是对象的异常
	// 通过throws抛出的是方法的异常
	// throws或者throw会从找到异常的某个方法中冒泡将异常传出相应的调用方法中
	// 当异常遇到了try-catch语句后进行处理，如果没有try-catch语句那么会由main函数抛出
	// 自定义的异常类
	public class MyException extends Exception {
		String message; // 定义String类型变量

		public MyException(String ErrorMessagr) { // 父类方法
			message = ErrorMessagr;
		}

		public String getMessage() { // 覆盖getMessage()方法
			return message;
		}
	}

	// 测试自定义的异常类
	void firstThrow() throws MyException { // 抛出自定义异常
		System.out.println("Oringinally creat a MyException and throw it out");
		throw new MyException("MyException"); // 真正的抛出异常处
	}

	void secondThrow() throws MyException { // 抛出自定义异常
		firstThrow(); // 调用firstThrow()
	}

	public ExceptionTest() throws MyException { // 构造方法，抛出自定义异常
		secondThrow(); // 调用secondThrow()
	}

	// thorws，主函数扔给JVM处理，返回信息，一层一层抛出异常
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		// double sum=0;
		// double a=0;
		// int temp=1;
		// sum =temp/a;
		// String str=null;//空指针异常，对象不存在，没有定义相应的异常处理方法，由JVM自动的抛出
		// //System.out.println(str.length());
		// //如果使用try catch语句捕捉异常由，try catch 语句捕捉，执行异常处理方法
		// //try 可能发生异常的地方，发生异常后的代码不在执行，直接跳转到catch语句块执行，
		// //最终由finally语句块执行最终结果，如果在try或者catch中有return语句在return之前执行finally语句快
		// //try-catch-finally语句块后面的代码继续执行
		// //往往需要自定义异常来完成很多的功能；
		// //catch中没有处理，直接到finally语句块
		// try
		// {
		// System.out.println(str.length());
		// }
		// catch(NullPointerException e)
		// {
		// System.out.println("发生了空指针异常");
		// }
		// finally
		// {
		// str="finally";
		// }
		// System.out.println(str);
		/*
		 * 
		 * 
		 * 
		 */
		 try{
		 //调用构造方法
		 ExceptionTest testException=new ExceptionTest();
		 }
		 catch(MyException e)
		 {
		 e.printStackTrace();
		 System.out.println("Catch a my exception!");
		 }
		//ExceptionTest testException = new ExceptionTest();
	}
}