package com.app.bytebrains;

public class ArrayListCustom<E> {
	
	private int size = 0;
	private static final int INITIAL_CAPACITY = 10;
	private Object data[]= {};
	
	public ArrayListCustom() {
		data = new Object[INITIAL_CAPACITY];
	}
	
	public void add(int value) {
		data[size++] = value;
	}
	
	public void display() {
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
}
