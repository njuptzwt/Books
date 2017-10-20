package com.NiukeWang.program;

public enum ENUMRation {
	red("红色",1),blue("蓝色",2),yellow("黄色",3);
	String color;
	int index;
	
	private ENUMRation(String color, int index) {
		this.color = color;
		this.index = index;
	}
	

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}


	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//循环遍历枚举类型的各个参数
		for(ENUMRation Color:ENUMRation.values())
		{
			System.out.println("枚举名称"+" "+Color.name()+" "+"枚举常量第一个参数"+" "+Color.getColor()+" "+"枚举参量的第二个数"+" "+Color.getIndex());
		}
	}

}
