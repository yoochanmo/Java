package com.lec.ex11_collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 	사용자정의 컨테이너에 수집하기
 	
 	List, Set, Map 컬렉션을 사용하는 것이 아니라 사용자가 만든 컨테이너(즉, 사용자가 정의한 컬렉션)로 stream 저장하는 방법을 실습
 	
 	stream은 요소들을 필터링 or 매핑을 사용자가 정의한 컨테이너에 요소들을 저장할 수 있도록 collect()메서드를 이용해서 사용자정의 컨테이너(MaleStudent)에
 	저장할 수가 있다. 
 */
public class CollectMain2 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 0,Student.Gender.MALE),
				new Student("홍길순", 0,Student.Gender.FEMALE),
				new Student("홍길녀", 0,Student.Gender.FEMALE),
				new Student("홍길상", 0,Student.Gender.MALE));

		MaleStudent 남학생 = list.stream().filter(s -> s.getGender() == Student.Gender.MALE)
				//.collect(() -> new MaleStudent(), (m, s) -> m.accumulate(t), (m1, m2) -> m1.combine(m2));
				.collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
		남학생.getList().stream().forEach(s -> System.out.print(s.getName() + ", "));
		
		// 남학생을 사용자컨테이너(MaleStudent)에 저장(수집)하는 과정
		
		// 1 ) Stream<Student> tot_stream = list.stream();
		// 2 ) Stream<Student> mal_stream = tot_stream.filter(s -> s.getGender() == Student.Gender.MALE)
		// 3 ) Supplier<MaleStudent> suppiler = () -> new MaleStudent()
		// 4 ) BiConsumer<MaleStudent, Student> accumulator = (m, t) -> m.accumulate(t)
		// 5 ) BiConsumer<MaleStudent, MaleStudent> combine = (m1,m2) -> m1.combine(m2)
	}

}

class MaleStudent {
	
	// 남학생들만 저장할 컨테이너
	private List<Student> list; // 남학생들의 요소만 저장할 컬렉션
	
	public MaleStudent() {
		this.list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName()+ "] 생성자를 호출한 쓰레드");
	}
	// 요소들을 저장할 메서드
	public void accumulate(Student student) {
		this.list.add(student);
		System.out.println("[" + Thread.currentThread().getName()+ "] accumulate()호출한 쓰레드");
	}
	
	// 두 MaleStudent를 결합하는 메서드(병렬처리시에만 처리)
	public void combine(MaleStudent other) {
		this.list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName()+ "] combine()호출한 쓰레드");
	}
	List<Student> getList() {
		// TODO Auto-generated method stub
		return this.list;
	}
	
	
	
}