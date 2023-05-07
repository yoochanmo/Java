package com.lec.ex01_intro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 	Stream(스트림)?
 	
 	스트림은 Java8부터 추가된 컬렉션, 배열에 저장된 요소(값 or 객체)를 하나씩 꺼내와서 람다식(Functional Inteface)으로
 	처리할 수 있도록 해주는 반복자이다. Java7까지는 List컬렉션에서 요소를 순차적으로 처리하기 때문에 iterator를 사용해 왔지만
 	컬렉션의 stream()메서드로 Stream객체를 얻은 후에 람다식으로 컬렉션의 요소를 하나식 처리할 수 있게 되었다.
 	
 	Iterator와 Stream을 비교해 보면 Stream을 사용하는 것이 훨씬 단순하게 사용할 수 있다. Stream은 Iterator와 비슷한
 	역할을 하는 반복자이지만 
 	 1 . 람다식으로 처리할 수 있다.
 	 2 . 내부반복자를 사용함으로써 병렬처리가 쉽다는 점이다.
     3 . 중간처리, 최종처리작업을 수행한다는 점에서 많은 차이가 있다.
     
     Stream의 장점
     
     1 . 람다식으로 요소를 처리하는 코드를 제공한다.
     	 
     	 Stream이 제공하는 대부분의 메서드는 fucntion Interface 매개타입을 가지기 때문에 람다식 또한 메서드
     	 참조를 이용해서 요소처리내용을 매개값으로 전달할 수 있다.
     
     
     2 . 내부반복자를 사용함으로써 병렬처리가 쉽다.
     
     	 외부반복자란 개발자가 코드를 직접 컬렉션의 요소를 반복해서 처리해야 하는 코드를 작성해야 한다는 의미이다.
     	 index를 이용하는 for문 or Iterator를 처리하는 while문을 이용하는 것 모두 외부반복자를 이용하는 것이지만
     	 내부반복자는 Collection내부에서 요소를 반복시키고 개발자는 요소를 처리해야할 코드만 제공하는 코드패턴을
     	 말한다.
     	 
     	 
     3 . 중간처리와 최종처리를 할 수 있다.
     
     	 스트림은 컬렉션의 요소에 중간처리, 최종처리를 수행할 수 있는데 중간처리는 매핑, 필터링, 정렬등의 작업을 수행하고
     	 최종처리메서드는 반복, 카운팅,평균, 합계등의 처리를 말한다.
 */
public class StreamMain {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동","홍길순","소향");
		
		// 1 . Iterator
		Iterator<String> names = list.iterator();
		while(names.hasNext()) {
			String name = names.next();
			System.out.print(name + ", ");
		}
		System.out.println();
		
		// 2 . stream
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.print(name + ", "));
				

	}

}
