package com.lec.exercise.Exercise15_8;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.awt.event.*;

public class Exercise15_8 extends Frame {

	Button first = new Button("<<");
	Button prev = new Button("<");
	Button next = new Button(">");
	Button last = new Button(">>");
	Panel buttons = new Panel();
	TextArea ta = new TextArea();
	ArrayList wordList = new ArrayList();
	final String WORD_FILE = "word_data.txt";
	final String CR_LF = System.getProperty("line.separator");
	int pos = 0;

	Exercise15_8(String title){

		super(title); 

		

		buttons.add(first); 
		buttons.add(prev); 
		buttons.add(next); 
		buttons.add(last); 
		add("South",buttons);
		add("Center",ta); 

		

		EventHandler handler=new EventHandler(); 
		addWindowListener(handler); 
		first.addActionListener(handler); 
		prev.addActionListener(handler); 
		next.addActionListener(handler); 
		last.addActionListener(handler); 

		

		loadFile(WORD_FILE); 

		
     	setBackground(Color.BLACK); 
		setSize(300,200); 
		setLocation(200,200); 
		setResizable(true); 
		setVisible(true); 
		showFirst(); 

	}

	void showFirst() {
		pos = 0;
		display(pos);

	}

	void showPrevious() {
		pos = (pos > 0) ? --pos : 0;
		display(pos);

	}

	void showNext() {
		int size = wordList.size();
		pos = (pos < size - 1) ? ++pos : size - 1;
		display(pos);

	}

	void showLast() {
		pos = wordList.size() - 1;
		display(pos);

	}

	void display(int pos) { // pos위치에 있는 라인의 내용을 보여준다.
		String tmp = (String)wordList.get(pos);
		StringBuffer sb = new StringBuffer(tmp.length());
		StringTokenizer st = new StringTokenizer(tmp,"");
				while(st.hasMoreTokens()) {
			sb.append(st.nextToken()).append(CR_LF);
		}
		ta.setText(sb.toString());
		
		/*
		 * 
		 * (1) 아래의 로직에 맞게 코드를 작성하시오.
		 * 
		 * 1. wordList에서 pos번째의 위치에 있는 데이터를 읽어온다.
		 * 
		 * 2. StringTokenizer를 이용해서 ‘|’를 구분자로 자른다.
		 * 
		 * 3. 잘라진 Token에 개행문자(CR_LF)를 붙여서 StringBuffer에 붙인다.(append)
		 * 
		 * 4. StringBuffer의 내용을 뽑아서 TextArea에 보여준다.
		 * 
		 */

	}

	void loadFile(String fileName) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line="";
			
			while((line=br.readLine())!=null){
				wordList.add(line);
			}
		} catch (IOException e) {
			System.out.println("데이터 파일을 읽을 수 없습니다.");
			System.exit(pos);
		}
		/*
		 * 
		 * (2) 아래의 로직에 맞게 코드를 작성하시오.
		 * 
		 * 1. BuffredReader와 FileReader를 이용해서 파일의 내용을 라인 단위로 읽는다.
		 * 
		 * 2. 읽어온 라인을 wordList에 저장한다.
		 * 
		 * 3. 만일 예외가 발생하면 프로그램을 종료한다.
		 * 
		 */

	}

	public static void main(String args[]) {

		Exercise15_8 mainWin = new Exercise15_8("WordStudy");

	}

	class EventHandler extends WindowAdapter implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			Button b = (Button) ae.getSource();
			if (b == first) {
				showFirst();
			} else if (b == prev) {
				showPrevious();
			} else if (b == next) {
				showNext();
			} else if (b == last) {
				showLast();

			}

		}

		public void windowClosing(WindowEvent e) {

			System.exit(0);

		}

	}

}