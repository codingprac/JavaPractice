package com.d3.prac.collections;

import java.util.Comparator;

public class ComparatorDemo implements Comparator{

	int id;
	String name;
	long salary;

	
	public ComparatorDemo() {
		super();
		System.out.println("Default Constructor");
	}

	public ComparatorDemo(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//main
	public static void main(String[] args) {

	}
	
	@Override
	public String toString() {
		return "ComparatorDemo [id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
