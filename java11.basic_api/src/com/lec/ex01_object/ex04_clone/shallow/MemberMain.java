package com.lec.ex01_object.ex04_clone.shallow;

public class MemberMain {

	public static void main(String[] args) {
		
			// 1 . 원본객체
			Member org_member = new Member("hong","홍길동","12345",40,true);
			
			// 2 . 객체를 복제 후에 패스워드를 변경
			Member clone_member = org_member.getMember();
			System.out.println("변경전 비밀번호 = " + org_member.password);
			clone_member.password = "67890";
			System.out.println();
			
			System.out.println("[복제객체 clone_member]");
			System.out.println(clone_member.id);
			System.out.println(clone_member.name);
			System.out.println(clone_member.password);
			System.out.println(clone_member.age);
			System.out.println(clone_member.adult);
			System.out.println();
			
			System.out.println("[원본객체 clone_member]");
			System.out.println(org_member.id);
			System.out.println(org_member.name);
			System.out.println(org_member.password);
			System.out.println(org_member.age);
			System.out.println(org_member.adult);
			System.out.println();
			
			System.out.println(clone_member.password.hashCode());
			System.out.println(org_member.password.hashCode());
			System.out.println();
			
			System.out.println(clone_member.scores.hashCode());
			System.out.println(org_member.scores.hashCode());
			System.out.println();
			
			
			org_member.scores[0] = 100;
			System.out.println("원본[0] : 변경전 점수 = " + org_member.scores[0]);
			System.out.println("복제[0] : 변경후 점수 = " + clone_member.scores[0]);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
