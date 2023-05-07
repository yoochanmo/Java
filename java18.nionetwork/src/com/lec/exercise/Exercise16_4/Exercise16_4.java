package com.lec.exercise.Exercise16_4;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class Exercise16_4 extends Frame {

	String nickname = "";
	DataOutputStream out;
	DataInputStream in;
	Panel p = new Panel();
	TextArea ta = new TextArea();
	TextField tf = new TextField();

	Exercise16_4(String nickname) {

		super("Chatting");
		this.nickname = nickname;

		p.setLayout(new BorderLayout());
		p.add(tf, "Center");
		add(ta, "Center");
		add(p, "South");

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}

		});

		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);
		ta.setEditable(false);
		setBounds(200, 200, 300, 200);
		setVisible(true);
		tf.requestFocus();

	}

	void startServer() {

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {

//			(1) 아래의 로직에 맞게 코드를 작성하시오.

//			1. 서비소켓을 생성하여 7777번 포트와 결합시킨다.
			serverSocket = new ServerSocket(7777);
//			2. ta에 "서버가 준비되었습니다." 라고 보여준다.
			ta.setText("서버가 준비되었습니다.");
//			3. 상대방의 연결을 기다린다.
			socket = serverSocket.accept();
//			4. ta에 "상대방과 연결되었습니다." 라고 보여준다.
			ta.append("\r\n" + "상대방과 연결되었습니다.");
//			ta.append("\r\n" +"상대방과 연결되었습니다.");
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
//			5. 반복문을 이용해서 입력스트림이 null이 아닌 동안
			while (in != null) {
				try {
					String msg = in.readUTF();
					ta.append("\r\n" + msg);
				} catch (IOException e) {

				}
			}
//			입력스트림으로부터 데이터를 읽어서 변수 msg에 저장한다

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("USAGE : java ChatServer NICKNAME");
			System.exit(0);

		}

		Exercise16_4 chatWin = new Exercise16_4(args[0]);
		chatWin.startServer();

	} // main

	class EventHandler extends FocusAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();
			if ("".equals(msg))
				return;

			if (out != null) {
				try {
					out.writeUTF(nickname + ">" + msg);
				} catch (IOException e) {

				}
			}
			/*
			 * 
			 * (2) 알맞은 코드를 넣어 완성하시오.
			 * 
			 */

			ta.append("\r\n" + nickname + ">" + msg);
			tf.setText("");

		}

		public void focusGained(FocusEvent e) {
			tf.requestFocus();

		}

	} // class EventHandler

} // class

class ChatClient extends Frame {

	String nickname = "";
	String serverIp = "";
	int serverPort = 0;
	DataOutputStream out;
	DataInputStream in;
	Panel p = new Panel();
	TextArea ta = new TextArea();
	TextField tf = new TextField();
	ChatClient(String nickname, String serverIp, String serverPort) {

		super("Chatting with " + serverIp + ":" + serverPort);
		this.nickname = nickname;
		this.serverIp = serverIp;
		this.serverPort = Integer.parseInt(serverPort);
		setBounds(600, 200, 300, 200);
		p.setLayout(new BorderLayout());
		p.add(tf, "Center");
		add(ta, "Center");
		add(p, "South");
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}

		});

		EventHandler handler = new EventHandler();

		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);
		ta.setEditable(false);
		setVisible(true);
		tf.requestFocus();

	}

	void startClient() {

		try {

			
//			(3) 아래의 로직에 맞게 코드를 작성하시오.
			
//			1. 소켓을 생성하여 serverIp의 serverPort에 연결한다.
			Socket socket = new Socket(serverIp, serverPort);
			
//			2. ta에 "상대방과 연결되었습니다."라고 보여준다
			ta.setText("상대방과 연결되었습니다.");
	
//			3. 연결된 상대방 소켓의 입력스트림과 출력스트립을 얻어온다.
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
			
//			4. 반복문을 이용해서 입력스트림이 null이 아닌 동안
			while(in!=null) {
				try {
					String msg = in.readUTF();
					ta.append("\r\n" + msg);
				} catch (IOException e) {}
					
				
			}

//			입력스트림으로부터 데이터를 읽어서 변수 msg에 저장한다.
	
	
			} catch (ConnectException ce) {

			ta.setText("상대방과 연결할 수 없습니다.");
			ce.printStackTrace();

		} catch (IOException ie) {
			ie.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("USAGE : java ChatClient NICKNAME SERVER_IP SERVER_PORT");
			System.exit(0);

		}

		ChatClient chatWin = new ChatClient(args[0], args[1], args[2]);
		chatWin.startClient();

	} // main

	class EventHandler extends FocusAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();
			if ("".equals(msg))
				return;
			if(out!=null) {
				try {
					out.writeUTF(nickname + ">" + msg); 
				} catch (IOException e) {}
					
			
			}
			/*
			 * 
			 * (4) 알맞은 코드를 넣어 완성하시오.
			 * 
			 */

			ta.append("\r\n" + nickname + ">" + msg);
			tf.setText("");

		}

		public void focusGained(FocusEvent e) {
			tf.requestFocus();

		}

	} // class EventHandler

} // class