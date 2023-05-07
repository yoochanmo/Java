package com.lec.ex02_class;
/*
 	인스턴스(instance)란?
 	
 	인스턴스는 클래스(class)를 기반으로 만들어진 객체(object)다. 클래스는 객체를 만들기 위한 틀이며,
 	인스턴스는 클래스를 바탕으로 실제 만들어진 객체이다.
 	
 	예를 들어, 클래스는 사람의 공통적인 특징과 기능을 담고 있는 것이라면, 인스턴스는 실제로 만들어진 사람이다.
 	각각의 인스턴스는 공통적인 특징을 가지고 있지만, 각각 다른 속성을 가지고 있다.
 	
 	다시 예를 들어, 모든 사람은 이름, 나이, 성별 등의 공통적인 특징을 가지고 있지만, 각각 다른 이름, 나이, 성별등의
 	속성을 가지고 있다.
 	
 	인스턴스를 만들기 위해서는 클래스를 먼저 정의해야 하며 클래스를 정의하는 것은 새로운 데이터 타입을 만드는것과
 	비슷하다. 클래스는 변수와 함수로 이루어져 있으며 클래스 내부에 정의된 변수는 클래스의 속성,함수는 클래스의 기능을 나타낸다.
 	
 	인스턴스는 클래스를 기반으로 "new" 연산자를 사용하여 생성한다. "new" 연산자는 클래스의 생성자를 호출하여 인스턴스를 초기화하고,
 	생성된 인스턴스의 참조(reference)를 반환된다. 이 참조는 생성된 인스턴스를 식별하는데 사용된다. 
 	즉 , 인스턴스 변수나 메서드를 호출 할 때에는, 해당 인스턴스의 참조를 사용하여 접근한다.
 */

// Person클래스를 정의하고 인스턴스를 생성하여 사용할 수 있다.
class Person {
    String name;
    int age;
    
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Blog {
    public static void main(String[] args) {
        // Person 클래스의 인스턴스를 생성
        Person person1 = new Person();
        
        // 인스턴스의 속성 설정
        person1.name = "Alice";
        person1.age = 25;
        
        // 인스턴스의 메서드 호출
        person1.sayHello(); // 출력: "Hello, my name is Alice and I am 25 years old."
    }
}
