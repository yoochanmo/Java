package com.lec.exercise.Exercise15_9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class Exercise15_9 extends Frame {

	String fileName;
	TextArea content;
	MenuBar mb;
	Menu mFile;
	MenuItem miNew, miOpen, miSaveAs, miExit;



	Exercise15_9(String title) { 

		super(title); 
		content = new TextArea(); 
		add(content); 

		

		mb = new MenuBar(); 
		mFile = new Menu("File"); 
		miNew = new MenuItem("New"); 
		miOpen = new MenuItem("Open"); 
		miSaveAs = new MenuItem("Save As..."); 
		miExit = new MenuItem("Exit"); 

		

		mFile.add(miNew); 
		mFile.add(miOpen); 
		mFile.add(miSaveAs);  
		mFile.addSeparator(); // 메뉴 분리선(separator)을 넣는다. 
		mFile.add(miExit);


  

	mb.add(mFile); // MenuBar에 Menu를 추가한다.  
	setMenuBar(mb); // Frame에 MenuBar를 포함시킨다.
	

	

	//메뉴에 이벤트 핸들러를 등록한다 . 

	MyHandler handler = new MyHandler(); 
	miNew.addActionListener(handler); 
	miOpen.addActionListener(handler); 
	miSaveAs.addActionListener(handler); 
	miExit.addActionListener(handler); 

	

	setSize(300, 200); 
	setVisible(true);

}

	

	//선택된 파일의 내용을 읽어서 TextArea에 보여주는 메서드  

	void fileOpen(String fileName) { 

		FileReader fr = null;
		BufferedReader br = null;
		StringWriter sw = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			sw = new StringWriter();
			
			String line ="";
			
			while((line = br.readLine()) !=null) {
				sw.write(line);
				sw.write('\n');
			}
			
			content.setText(sw.toString());
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(br!=null)
					br.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
		/* (1) 아래의 로직에 맞게 코드를 작성하시오 .  

		 *  1. BuffredReader와 FileReader를 이용해서 지정된 파일을 읽는다.  

		 *  2. StringWriter에 출력한다.  

		 *  3. StringWriter의 내용을 content(TextArea)에 보여준다. 

		 */ 

	} // fileOpen메서드의 끝 

	

	// TextArea의 내용을 지정된 파일에 저장하는 메서드

	void saveAs(String fileName) { 
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			try {
				fw = new FileWriter(fileName);
				bw = new BufferedWriter(fw);
				
				bw.write(content.getText());
			} catch (IOException ie) {
				ie.printStackTrace();
			}finally {
				try {
					if(bw != null)
						bw.close();
				} catch (IOException ie) {
				
				}
			}

		/* (2) 아래의 로직에 맞게 코드를 작성하시오. 

		 *  1. BuffredWriter와 를 FileWriter생성한다.   

		 *  2. content에 있는 내용을 가져와서 BufferedWriter에 출력한다.  

		 *  3. BufferedWriter를 닫는다. 

		 */ 

	} // saveAs메서드의 끝

	

	public static void main(String args[]) { 

		Exercise15_9 mainWin = new Exercise15_9("Text Editor"); } // main메서드의 끝

	

	//메뉴를 클릭했을 때 메뉴별 처리코드

	class MyHandler implements ActionListener { 

		public void actionPerformed(ActionEvent e) { 
			String command = e.getActionCommand(); 

			

			if(command.equals("New")) { 

				content.setText(""); 

			} else if(command.equals("Open")) { 

				FileDialog fileOpen = new FileDialog(Exercise15_9.this, "파일열기"); 
				fileOpen.setVisible(true); 
				fileName = fileOpen.getDirectory() + fileOpen.getFile(); 
				System.out.println(fileName);  //선택된 파일의 내용을 TextArea에 보여준다. 
				fileOpen(fileName); 

			} else if(command.equals("Save As...")) { 

				FileDialog fileSave = new FileDialog(Exercise15_9.this, "파일저장",FileDialog.SAVE); 
				fileSave.setVisible(true); 
				fileName = fileSave.getDirectory() + fileSave.getFile(); 
				System.out.println(fileName); 
				//현재 TextArea의 내용을 선택된 파일에 저장한다. 

				saveAs(fileName); 

			} else if(command.equals("Exit")) { 
				System.exit(0); //프로그램을 종료시킨다. 

			} 

		} 

	} // class MyHandler 

} // Exercise15_9클래스의 끝