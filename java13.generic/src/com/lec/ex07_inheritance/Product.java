package com.lec.ex07_inheritance;

public class Product<K, M> {
	private K kind;
	private M model;
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Product [kind=" + kind.getClass() + ", model=" + model + "]";
	}
	
}
class Car{}
class TV{}
