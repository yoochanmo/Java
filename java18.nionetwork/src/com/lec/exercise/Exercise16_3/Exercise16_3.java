package com.lec.exercise.Exercise16_3;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Exercise16_3 extends Frame {

	TextField tf = new TextField();
	TextArea ta = new TextArea();

	Exercise16_3(String title) {

		super(title);
		add(tf, "North");
		add(ta, "Center");
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				displaySource();

			}

		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);

			}

		});

		setBounds(500, 200, 500, 300);
		setVisible(true);

	}

	void displaySource() {

		URL url = null;
		BufferedReader input = null;
		String address = tf.getText().trim();
		String line = "";
		ta.setText("");

		try {

			if (!address.startsWith("http://"))
				address = "http://" + address;

			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			
			while((line=input.readLine()) != null) {
				ta.append(line);
				ta.append("\n");
			}
			/*
			 * 
			 * (1) 알맞은 코드를 넣어 완성하시오.
			 * 
			 */

			input.close();

		} catch (Exception e) {
			ta.setText("유효하지 않은 URL입니다.");

		}

	} // displaySource()

	public static void main(String[] args) {
		Exercise16_3 mainWin = new Exercise16_3("Source Viewer");

	}

}