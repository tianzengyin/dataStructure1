package com.zengyin.InterfaceDemo;

public class Teacher implements Singer , Pinter{
	private String name;
	public Teacher(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void teach(){
		System.out.println("正在教学");
	}
	
	public void sing(){
		System.out.println("老师唱歌");
	}
	public void sleep(){
		System.out.println("老师睡觉");
	}
	public void paint(){
		System.out.println("老师画画");
	}
	public void eat(){
		System.out.println("老师吃饭");
	}
	public static void main(String[] args){
		Singer s1 = new Student("le");
		s1.sing();
		s1.sleep();
		//s1.study();
		Singer t1 = new Teacher("张三");
		t1.sing();
		t1.sleep();
		Pinter p1 = (Pinter)t1;
		p1.paint();
		p1.eat();
		
	}
}
