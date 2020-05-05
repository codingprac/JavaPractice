package com.d3.prac.corejava;

/**
 * @author deep
 * There are four ways of creating singleton classes 
 * 1) Eager Initialization --> private static final SingletonDemo singletonInstance = new SingletonDemo();
 * 2) Static Initialization --> static(singletonInstance = new SingletonDemo())
 * 3) Lazy Initialization described below as a public method
 * 4) Thread Safe Initialization described below
 */
public class SingletonDemo {
	
	private static SingletonDemo singletonInstance;
	private SingletonDemo(){}
	public static synchronized SingletonDemo getInstanceBySyncMethod(){
		if(singletonInstance == null){
			singletonInstance = new SingletonDemo();
		}
		return singletonInstance;
	}
	public static SingletonDemo getInstanceBySyncBlock(){
		if(singletonInstance == null){
			synchronized(singletonInstance){
				singletonInstance = new SingletonDemo();
			}
		}
		return singletonInstance;
	}

	public static void main(String args[]){
		System.out.println(getInstanceBySyncMethod());
		System.out.println(getInstanceBySyncBlock());
		
	}
}
