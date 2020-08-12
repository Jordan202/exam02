package com.exam.encapsulation;



public class Student {

	String Name;
	int Age;
	int Dept;
	public static void main (String []args) {
		
		Student ob=new Student();
		ob.setName("Jordan");
		ob.setAge(22);
		ob.setDept(2);
		ob.print();
		}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getDept() {
		return Dept;
	}
	public void setDept(int dept) {
		Dept = dept;
	}
	public  void print() {
		
		System.out.println(Name+"  "+Age+"  "+Dept);
	}
}
