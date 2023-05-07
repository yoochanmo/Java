package com.lec.ex01_object.ex02_hashcode;

/*
 	객체의 해쉬코드(hashCode)
 	
 	객체의 해쉬코드란? 객체를 식별하는 하나의 정수값을 말한다. Object의 hashCode()
 	메서드는 객체의 메모리번지를 이용해서 해쉬코드를 만들어 리턴하기 때문에 객체마다
 	다른 값을 가지고 있다. 논리적으로 동등비교시에 hashCode()를 재정의(오버라이드)
 	할 필요성이 있는 Collection FrameWork에서 HashSet, HashWap, HashTable()은
 	equals메서드를 이용해서 비교한다.
 */

public class Key {
	
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
		public int hashCode() {
		return this.number;
			//return super.hashCode();
		}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(this.number == key.number) {
				return true;
			}
		}
		return false;
	}
	
}
