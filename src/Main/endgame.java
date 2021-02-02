package Main;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


import javax.swing.*;

public class endgame implements Runnable {


	public JFrame Frame_End;
	private JButton PA_Button, E_Button;
	private JLabel Label_Score, Label_BG;
	private PlayAgainHandler PA = new PlayAgainHandler();
	private ExitHandler Ex = new ExitHandler();
	private final int PAUSE = 10;
	public void end(){
		//สร้าง JFrame 800*600
		Frame_End = new JFrame("FlappyChingMai");
		Frame_End.setBounds(350, 100, 800, 600);
		Frame_End.setResizable(false);
		Frame_End.getContentPane().setBackground(Color.white);
		Frame_End.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame_End.setLayout(null);
		Frame_End.setVisible(true);

		//มีปุ่ม Play Again เพื่อเกมอีกรอบ
		PA_Button = new JButton("Play Again");
		PA_Button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		PA_Button.setBounds(180, 350, 180, 50);
		PA_Button.addActionListener(PA);
		Frame_End.getContentPane().add(PA_Button);
		//ปุ่ม EXIT เพื่ออกจากโปรแกรม
		E_Button = new JButton("Exit");
		E_Button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		E_Button.setBounds(420, 350, 180, 50);
		E_Button.addActionListener(Ex);
		Frame_End.getContentPane().add(E_Button);
		//set ให้Score มีข้อความขึ้น
		Label_Score = new JLabel("Score : " + Scene.getScore());
		Label_Score.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Label_Score.setBounds(325, 280, 150, 50);
		Frame_End.getContentPane().add(Label_Score);
		//Background
		Label_BG = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/imageGUI/BG.png")).getImage();
		Label_BG.setIcon(new ImageIcon(img));
		Label_BG.setBounds(0, 0, 784, 561);
		System.out.print(Frame_End.getContentPane().add(Label_BG));


	}

	public void savescore() {
		//save score โดยดึงชื่อกับ score เพื่อ save ลงไฟล์
		try {
			FileWriter keepscore = new FileWriter("Score.txt", true);
			keepscore.write(GUI.GUIFlappyChingMai.text_inputname.getText() + " " + " Score = " + Scene.getScore() + "\n");
			keepscore.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	//ปุ่ม Event ที่รับมาจากค่ามาเพื่อทำงานเพื่อกลับไปเริ่มเกม 
	public class PlayAgainHandler implements ActionListener {
			public void actionPerformed(ActionEvent e) {

				main.main(null);
				Frame_End.dispose();

			}
		}
	//
	public class ExitHandler implements ActionListener{
	
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		}

	public void run() {
			while(!main.scene.end) {
				main.scene.xbackground--;
				main.scene.repaint();
				try {
					Thread.sleep(this.PAUSE);

				}catch (InterruptedException e) {
			}
		}
		
			this.end();
			main.window.dispose();
			savescore();
		}
}
