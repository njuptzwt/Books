package com.NiukeWang.program;
/**
 * 一般设计的时候需要将某个类的属性设计为private的属性
 * 私有化，只有在本类的方法中才可以访问，外部类不允许访问
 * 一般通过设置对象的getter和setter方法设置，该私有属性
 * 获取和设置
 * @author 18362
 *
 */
public class Test2
{
    private int a=10;//在外部类中无法访问，在本类和本类的方法中可以直接访问private类型的数据
    int b=20;
    static int c=1;
    /**
     * 为了在其他类中获取到类中的私有变量，会使用getter()和setter()函数
     * 方便操作....(忽略了基础)
     * @param arg
     */
    
    public static void main(String arg[])
    {
        Test2 t = new Test2();
        int temp=t.a;//本类中直接使用
    }
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
 }
class Another
{
	private int i=10;
	Test2 test=new Test2();
	public void swap()
{
		i=test.getA();
}
}