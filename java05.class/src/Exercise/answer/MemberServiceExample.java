package Exercise.answer;

public class MemberServiceExample {
public static void main(String[] args) {
		
		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong","12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberservice.logout("hong");
		}else {
			System.out.println("id 또는 비밀번호를 잘못입력하셨습니다.");
		}
		
		
		
		
		
		
		
		
	}

	

}
