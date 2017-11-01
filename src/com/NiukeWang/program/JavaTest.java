package com.NiukeWang.program;
/**
 *（1）基本数据类型传值，对形参的修改不会影响实参；int double (String，Integer,Double,也可以当作，自动装箱）
 *特殊对待。。。。。。。。。
（2）引用类型传引用，形参和实参指向同一个内存地址（同一个对象），所以对参数的修改会影响到实际的对象；
（3）String, Integer, Double等immutable的类型特殊处理，可以理解为传值，最后的操作不会修改实参对象。

 * @author 18362
 *
 *
 *这里要特殊考虑String，以及Integer、Double等几个基本类型包装类，它们都是immutable类型，
    因为没有提供自身修改的函数，每次操作都是新生成一个对象，所以要特殊对待，可以认为是和基本数据类型相似，传值操作。
 *
 *
 *
 *
 *类方法中的参数,例如Change(Integer a, String str)
 *我们称之为局部变量，局部变量，在方法结束之后自动销毁！！！变量的生命周期！
 *当某处调用方法的时候：
 *1、如果是值传递，那么参数就是传递值的拷贝
 *2、如果是引用的传递，那么变量值是引用的拷贝（地址的拷贝）
 *不对原来的东西直接操作，拷贝一份出来操作！！
 *
 *这边有详细解释：http://blog.csdn.net/qq_32371887/article/details/73467677
 *基本类型和引用类型
 *Java中数据类型分为两大类，基本类型和对象类型。相应的，变量也有两种类型：基本类型和引用类型。
基本类型的变量保存原始值，即它代表的值就是数值本身；
而引用类型的变量保存引用值，"引用值"指向内存空间的地址，代表了某个对象的引用，而不是对象本身，
对象本身存放在这个引用值所表示的地址的位置。
基本类型包括：byte,short,int,long,char,float,double,Boolean,returnAddress，
引用类型包括：类类型，接口类型和数组。（Class，Interface，数组char[])等
相应的，变量也有两种类型：基本类型和引用类型


String，StringBuffer,StringBuilder对象的直接赋值。相当于是隐式的构建了一个新对象（重新指定引用的所在位置）

 */
public class JavaTest
{
	/**
	 * 测试String类型的数据传递的值属于那种，传递值（默认看作传递值）
	 * @param str
	 */
	public static void change(String str)
	{
		str=str+"world";//String,Integer,Double这些没有提供自身修改的函数，每次修改操作都是需要重新new一个对象！
	}
	/**
	 * 测试stringBuffer的传递和StringBuilder一个类型，传递引用值
	 * @param args0
	 */
	public static void change1(StringBuffer str,StringBuilder sb)
	{
		str=str.append("world");
		sb=sb.append("wdsk");
	}
	/**
	 * Interger和Double包装类是传递何种值
	 * @param args0
	 */
	public static void change2(Integer a,Double b)
	{
		a=10;
		b=3.2;
	}
	public static void main(String []args0)
	{
		String str=new String("hello");
		StringBuffer s=new StringBuffer("hello");
		StringBuilder sb=new StringBuilder("hello");
		Double a=10.9;
		Integer b=1;
		change(str);
		change1(s,sb);
		change2(b,a);
		System.out.println(str);
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(sb.toString());
	}
}