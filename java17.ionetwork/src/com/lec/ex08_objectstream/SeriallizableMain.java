package com.lec.ex08_objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SeriallizableMain {

	public static void main(String[] args) throws Exception {
		
		// 1 . 객체의 직렬화
		FileOutputStream fos = new FileOutputStream("src/com/lec/ex08_objectstream/class_a.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA class_a = new ClassA();
		class_a.field1 = 1000;
		class_a.field2.field1 = 2000;
		class_a.field3 = 3000;
		class_a.field4 = 4000;
		
		oos.writeObject(class_a);
		oos.flush();
		oos.close();
		fos.close();
		
		// 2 . 객체의 역직렬화
		FileInputStream fis = new FileInputStream("src/com/lec/ex08_objectstream/student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA obj = (ClassA) ois.readObject();
		System.out.println("ClassA.field1 = " + obj.field1);
		System.out.println("ClassA.field( = " + obj.field2.getClass() + ") = " + obj.field2.field1);
		System.out.println("ClassA.field3 = " + obj.field3); // 역직렬화(x), static 즉 공통영역의 값
		System.out.println("ClassA.field4 = " + obj.field4); // 역직렬화(x)
		
		ois.close();
		fis.close();

	}

}

class ClassA implements Serializable{
	
		// 1 . 직렬화에 포함
		int field1;
		ClassB field2 = new ClassB();
		
		// 2 . 직렬화에 불포함
		static int field3;
		transient int field4;
		public ClassA() {}
		public void method() {}
}

class ClassB implements Serializable{
	int field1;
}