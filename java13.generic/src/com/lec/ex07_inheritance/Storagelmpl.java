package com.lec.ex07_inheritance;

public class Storagelmpl<T> implements Storage<T> {

	private T[] array;
	
		public Storagelmpl(int capacity) {
			this.array = (T[]) new Object[capacity];
		}
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		
		return array[index];
	}

}
