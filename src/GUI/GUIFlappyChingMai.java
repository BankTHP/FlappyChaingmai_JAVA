package GUI;
import Main.endgame;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIFlappyChingMai {
	
	private static JFrame Frame_inputname;
	private static JLabel Label1_inputname,Label2_inputname;
	private static JButton Button_Enter , Button_Menu;
	public static JTextArea text_inputname;
	public  static JOptionPane JOptionPane_Alert;
	public static EnterNameHandler EN = new EnterNameHandler();
	public static ReturnMenuHandler RM = new ReturnMenuHandler();
	
	
	
	public static void inputname() {
		//สร้าง JFrame ขนาด 800*600
		Frame_inputname = new JFrame();
		Frame_inputname.setTitle("FlappyChiangmai");
		Frame_inputname.setBounds(350, 100, 800, 600);
		Frame_inputname.setResizable(false);
		Frame_inputname.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame_inputname.getContentPane().setLayout(null);
		Frame_inputname.setVisible(true);
		//สร้างข้อความข้อความว่า Enter your name
		Label1_inputname = new JLabel("Enter your name");
		Label1_inputname.setBounds(325, 275, 130, 20);
		Label1_inputname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Frame_inputname.getContentPane().add(Label1_inputname);
		//สร้าง JTextArea รับค่า input
		text_inputname = new JTextArea();
		text_inputname.setBounds(304, 315, 169, 23);
		Frame_inputname.getContentPane().add(text_inputname);
		//ปุ่ม Enter เพื่อเข้าสู่เกม
		Button_Enter = new JButton("Enter");Button_Enter .setFont(new Font("Tahoma", Font.PLAIN, 20));
		Button_Enter.setBounds(341, 350, 101, 27);
		Button_Enter.addActionListener(EN);
		Frame_inputname.getContentPane().add(Button_Enter);
		//ปุ่ม Menu เพื่อกลับไปสู่หน้า Menu
		Button_Menu = new JButton("Menu");
		Button_Menu .setFont(new Font("Tahoma", Font.PLAIN, 20));
		Button_Menu.setBounds(341, 400, 101, 27);
		Button_Menu.addActionListener(RM);
		Frame_inputname.getContentPane().add(Button_Menu) ;

		Label2_inputname = new JLabel("");
		Image img = new ImageIcon(GUIFlappyChingMai.class.getResource("/imageGUI/BG.png")).getImage();
		Label2_inputname.setIcon(new ImageIcon(img));
		Label2_inputname.setBounds(0, 0, 784, 561);
		System.out.print(Frame_inputname.getContentPane().add(Label2_inputname));
	}
	public static void Alert() {
		//เอาไว้เด้งขึ้นมาเตือนตอนไม่ใส่ชื่อ
		JOptionPane_Alert = new JOptionPane("");
		JOptionPane_Alert.showMessageDialog(JOptionPane_Alert,"Please enter your name.","FlappyChingMai",JOptionPane.WARNING_MESSAGE);

	}

	//รับค่าจาก Menu เพื่อไปหน้า Menu
	public static class ReturnMenuHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {

			StartandContent.main(null);
			Frame_inputname.dispose();


		}
	}
	////เช็ค JTextArea นำมาเช็ค
	public static class EnterNameHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (text_inputname.getText().trim().isEmpty()) {

				Alert();
			} else {
				Main.main.main(null);
				Frame_inputname.dispose();

			}

		}
	}
}

	



