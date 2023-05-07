package com.lec.ex06_lifo_fifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueMain {

	public static void main(String[] args) {
		
		Queue<Message> message = new LinkedList<>();
		
		message.offer(new Message("Send Twitter", "홍길동"));
		message.offer(new Message("Send Mail", "홍길순"));
		message.offer(new Message("Send FaceBook", "이강인"));
		message.offer(new Message("Send KaKaoTalk", "김민재"));
		message.offer(new Message("Send KaKaoTalk", "김민재"));
		System.out.println("총 객체수 = " + message.size());
		System.out.println();
		
		while(!message.isEmpty()) {
			Message msg = message.poll();
			System.out.println(msg.to + " = " + msg.msg);
		}
		System.out.println();
		
		message.offer(new Message("Send Twitter", "홍길동"));
		message.offer(new Message("Send Mail", "홍길순"));
		message.offer(new Message("Send FaceBook", "이강인"));
		System.out.println("총 객체수 = " + message.size());
		System.out.println();
		
		while(!message.isEmpty()) {
			Message msg = message.poll();
			switch(msg.msg) {
			case "Send Mail":
				System.out.println(msg.to + "에게 메일을 보냈습니다."); break;
			case "Send Twitter":
				System.out.println(msg.to + "에게 문자를 보냈습니다."); break;
			case "Send FaceBook":
				System.out.println(msg.to + "에게 문자를 보냈습니다."); break;
			}
		}
		
	}

}

class Message {
	public String msg;
	public String to;
	
	public Message(String msg,String to ) {
		this.msg = msg;
		this.to = to;
	}
}