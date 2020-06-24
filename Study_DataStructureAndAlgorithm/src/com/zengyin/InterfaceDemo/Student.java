package com.zengyin.InterfaceDemo;

public class Student implements Singer {
	private String name;
	public Student(){}
	public Student(String name){
		this.name = name;
	}
	public void study(){
		System.out.println("正在学习");
	}
	public String getName(){
		return this.name;
	} 
	public void sing(){
		System.out.println("正在唱歌");
	}
	public void sleep(){
		System.out.println("正在睡觉");
	}
}
