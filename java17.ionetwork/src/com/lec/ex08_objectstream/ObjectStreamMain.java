package com.lec.ex08_objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 	객체입출력보조스트림
 	
 	자바는 메모리에 생성된 객체를 파일로 저장 or 네트워크로 전송처리를 할 수가 있다. 객체는 문자가
 	아니기 때문에 바이트기반으로 입출력을 해야한다.
 	
 	객체를 출력할 때 객체의 데이터(필드값)를 연속적인 바이트데이터로 출력해야 하는데 이것을 직렬화(serialization)라고한다.
 	입력스트림으로 부터 연속적인 바이트 데이터를 객체로 변환하는 것을 역직렬화(deserialization)이라고 한다. 자바는 객체를 입출력할 수 있도록 ObjectOutputStream(직렬화)
 	ObjectInputStream(역직렬화)를 제공한다.
 	
 	직렬화가 가능한 클래스(Serializable)
 	
 	자바는 Serializable 인터페이스를 구현한 클래스만 직렬화가 가능하다. 객체를 직렬화할 때 private 필드를 포함한 모든 필드를 바이트 데이터로 입출력할 수 있다.
 	
 	객체를 직렬화하면 생성자와 메서드는 직렬화에 포함되지 않고 필드만 포함된다. 하지만 static 또는 transient로 선언된 필드는 직렬화되지 않는다.
 	
 	
 */
public class ObjectStreamMain {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("src/com/lec/ex08_objectstream/student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(Integer.valueOf(100));
		oos.writeObject(Double.valueOf(100));
		oos.writeObject(new int[] {1,2,3,4,5});
		oos.writeObject(new String ("홍길동"));
		oos.writeObject(new Student("홍길순",1));
		oos.flush();
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("src/com/lec/ex08_objectstream/student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		Student obj5 = (Student) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3 + " : " + obj3[0] + " , " +  obj3[4]);
		System.out.println(obj4);
		System.out.println(obj5 + " : " + obj5.name +  " , " + obj5.sno + " , " + obj5.gender);
		
	}

}

class Student implements Serializable{
	
	public String name;
	public int sno;
	public String gender; // transient로 선언된 필드는 직렬화대상에서 제외
	
	public Student(String name,int sno) {
		this.name = name;
		this.sno = sno;
		this.gender = "여자";
	}
}