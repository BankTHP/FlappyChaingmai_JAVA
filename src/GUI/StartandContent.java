package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartandContent {
    private static JFrame Frame_Start,Frame_Content1,Frame_Content2,Frame_Content3,Frame_Content4,Frame_Content5,Frame_Content6,Frame_Content7;
    private static JLabel Label_BG,Label_Content1,Label_Content2,Label_Content3,Label_Content4,Label_Content5,Label_Content6,Label_Content7;
    private static JButton Button_Stat, Button_Content,Button_Exit,Button_Next1,Button_Next2
            ,Button_Next3,Button_Next4,Button_Next5,Button_Next6,Button_Home1,Button_Home2,Button_Home3,Button_Home4,Button_Home5,Button_Home6,
            Button_Home7,Button_Back1, Button_Back2,Button_Back3,Button_Back4,Button_Back5,Button_Back6;

    public static StatHandler SH = new StatHandler();
    public static ContentHandler CH = new ContentHandler();
    public static ExitStartHandler ES = new ExitStartHandler();

    public static Home1Handler HH1 = new Home1Handler();
    public static Home2Handler HH2 = new Home2Handler();
    public static Home3Handler HH3 = new Home3Handler();
    public static Home4Handler HH4 = new Home4Handler();
    public static Home5Handler HH5 = new Home5Handler();
    public static Home6Handler HH6 = new Home6Handler();
    public static Home7Handler HH7 = new Home7Handler();

    public static Next1Handler NH1 = new Next1Handler();
    public static Next2Handler NH2 = new Next2Handler();
    public static Next3Handler NH3 = new Next3Handler();
    public static Next4Handler NH4 = new Next4Handler();
    public static Next5Handler NH5 = new Next5Handler();
    public static Next6Handler NH6 = new Next6Handler();

    public static Back1Handler BH1 = new Back1Handler();
    public static Back2Handler BH2 = new Back2Handler();
    public static Back3Handler BH3 = new Back3Handler();
    public static Back4Handler BH4 = new Back4Handler();
    public static Back5Handler BH5 = new Back5Handler();
    public static Back6Handler BH6 = new Back6Handler();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StartandContent window = new StartandContent();
                    window.Frame_Start.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public StartandContent() {
        Start();

    }
    // JFrame ที่มีปุ่ม Start Content Exit
    public static void Start() {
        Frame_Start = new JFrame();
        Frame_Start.setTitle("FlappyChiangmai");
        Frame_Start.setBounds(350, 100, 800, 600);
        Frame_Start.setResizable(false);
        Frame_Start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame_Start.getContentPane().setLayout(null);

        Button_Stat = new JButton("Start");
        Button_Stat.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Button_Stat.setBounds(420, 350, 100, 27);
        Button_Stat.addActionListener(SH);
        Frame_Start.getContentPane().add(Button_Stat);

        Button_Content = new JButton("Content");
        Button_Content.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Button_Content.setBounds(250, 350, 110, 27);
        Button_Content.addActionListener(CH);
        Frame_Start.getContentPane().add(Button_Content);

        Button_Exit = new JButton("Exit");
        Button_Exit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Button_Exit.setBounds(325, 400, 110, 27);
        Button_Exit.addActionListener(ES);
        Frame_Start.getContentPane().add(Button_Exit);

        Label_BG = new JLabel("");
        Image img = new ImageIcon(GUIFlappyChingMai.class.getResource("/imageGUI/BG.png")).getImage();
        Label_BG.setIcon(new ImageIcon(img));
        Label_BG.setBounds(0, 0, 784, 561);
        System.out.print(Frame_Start.getContentPane().add(Label_BG));

    }
    
    
    //เป็น JFrame ที่มีปุ่ม home กับ next 
    public static void ContentPage1(){
        Frame_Content1 = new JFrame();
        Frame_Content1.setTitle("FlappyChiangmai");
        Frame_Content1.setBounds(80, 50, 1280, 720);
        Frame_Content1.setResizable(false);
        Frame_Content1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame_Content1.getContentPane().setLayout(null);


        Button_Next1 = new JButton("NEXT");
        Button_Next1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Next1.setBounds(1030, 600, 200, 50);
        Button_Next1.addActionListener(NH1);
        Frame_Content1.getContentPane().add(Button_Next1);

        Button_Home1 = new JButton("HOME");
        Button_Home1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Home1.setBounds(500, 600, 200, 50);
        Button_Home1.addActionListener(HH1);
        Frame_Content1.getContentPane().add(Button_Home1);

        Label_Content1 = new JLabel("");
        Image img = new ImageIcon(GUIFlappyChingMai.class.getResource("/imageGUI/ContentPage1.jpg")).getImage();
        Label_Content1.setIcon(new ImageIcon(img));
        Label_Content1.setBounds(-8, -10, 1280, 720);
        System.out.print(Frame_Content1.getContentPane().add(Label_Content1));

    }
    //เป็น JFrame ที่มีปุ่ม home กับ next กับ Back
    public static void ContentPage2(){
        Frame_Content2 = new JFrame();
        Frame_Content2.setTitle("FlappyChiangmai");
        Frame_Content2.setBounds(80, 50, 1280, 720);
        Frame_Content2.setResizable(false);
        Frame_Content2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame_Content2.getContentPane().setLayout(null);

        Button_Next2 = new JButton("NEXT");
        Button_Next2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Next2.setBounds(1030, 600, 200, 50);
        Button_Next2.addActionListener(NH2);
        Frame_Content2.getContentPane().add(Button_Next2);

        Button_Back1 = new JButton("Back");
        Button_Back1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Back1.setBounds(30, 600, 200, 50);
        Button_Back1.addActionListener(BH1);
        Frame_Content2.getContentPane().add(Button_Back1);

        Button_Home2 = new JButton("HOME");
        Button_Home2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Home2.setBounds(500, 600, 200, 50);
        Button_Home2.addActionListener(HH2);
        Frame_Content2.getContentPane().add(Button_Home2);

        Label_Content2 = new JLabel("");
        Image img = new ImageIcon(GUIFlappyChingMai.class.getResource("/imageGUI/ContentPage2.jpg")).getImage();
        Label_Content2.setIcon(new ImageIcon(img));
        Label_Content2.setBounds(-8, -10, 1280, 720);
        System.out.print(Frame_Content2.getContentPane().add(Label_Content2));
    }
    public static void ContentPage3(){
        Frame_Content3 = new JFrame();
        Frame_Content3.setTitle("FlappyChiangmai");
        Frame_Content3.setBounds(80, 50, 1280, 720);
        Frame_Content3.setResizable(false);
        Frame_Content3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame_Content3.getContentPane().setLayout(null);

        Button_Next3 = new JButton("NEXT");
        Button_Next3.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Next3.setBounds(1030, 600, 200, 50);
        Button_Next3.addActionListener(NH3);
        Frame_Content3.getContentPane().add(Button_Next3);

        Button_Back2 = new JButton("Back");
        Button_Back2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Back2.setBounds(30, 600, 200, 50);
        Button_Back2.addActionListener(BH2);
        Frame_Content3.getContentPane().add(Button_Back2);

        Button_Home3 = new JButton("HOME");
        Button_Home3.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Home3.setBounds(500, 600, 200, 50);
        Button_Home3.addActionListener(HH3);
        Frame_Content3.getContentPane().add(Button_Home3);

        Label_Content3 = new JLabel("");
        Image img = new ImageIcon(GUIFlappyChingMai.class.getResource("/imageGUI/ContentPage3.jpg")).getImage();
        Label_Content3.setIcon(new ImageIcon(img));
        Label_Content3.setBounds(-8, -10, 1280, 720);
        System.out.print(Frame_Content3.getContentPane().add(Label_Content3));
    }
    public static void ContentPage4(){
        Frame_Content4 = new JFrame();
        Frame_Content4.setTitle("FlappyChiangmai");
        Frame_Content4.setBounds(80, 50, 1280, 720);
        Frame_Content4.setResizable(false);
        Frame_Content4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame_Content4.getContentPane().setLayout(null);

        Button_Next4 = new JButton("NEXT");
        Button_Next4.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Next4.setBounds(1030, 600, 200, 50);
        Button_Next4.addActionListener(NH4);
        Frame_Content4.getContentPane().add(Button_Next4);

        Button_Back3 = new JButton("Back");
        Button_Back3.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Back3.setBounds(30, 600, 200, 50);
        Button_Back3.addActionListener(BH3);
        Frame_Content4.getContentPane().add(Button_Back3);

        Button_Home4 = new JButton("HOME");
        Button_Home4.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Home4.setBounds(500, 600, 200, 50);
        Button_Home4.addActionListener(HH4);
        Frame_Content4.getContentPane().add(Button_Home4);

        Label_Content4 = new JLabel("");
        Image img = new ImageIcon(GUIFlappyChingMai.class.getResource("/imageGUI/ContentPage4.jpg")).getImage();
        Label_Content4.setIcon(new ImageIcon(img));
        Label_Content4.setBounds(-8, -10, 1280, 720);
        System.out.print(Frame_Content4.getContentPane().add(Label_Content4));
    }
    public static void ContentPage5(){
        Frame_Content5 = new JFrame();
        Frame_Content5.setTitle("FlappyChiangmai");
        Frame_Content5.setBounds(80, 50, 1280, 720);
        Frame_Content5.setResizable(false);
        Frame_Content5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame_Content5.getContentPane().setLayout(null);

        Button_Next5 = new JButton("NEXT");
        Button_Next5.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Next5.setBounds(1030, 600, 200, 50);
        Button_Next5.addActionListener(NH5);
        Frame_Content5.getContentPane().add(Button_Next5);

        Button_Back4 = new JButton("Back");
        Button_Back4.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Back4.setBounds(30, 600, 200, 50);
        Button_Back4.addActionListener(BH4);
        Frame_Content5.getContentPane().add(Button_Back4);

        Button_Home5 = new JButton("HOME");
        Button_Home5.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Home5.setBounds(500, 600, 200, 50);
        Button_Home5.addActionListener(HH5);
        Frame_Content5.getContentPane().add(Button_Home5);

        Label_Content5 = new JLabel("");
        Image img = new ImageIcon(GUIFlappyChingMai.class.getResource("/imageGUI/ContentPage5.jpg")).getImage();
        Label_Content5.setIcon(new ImageIcon(img));
        Label_Content5.setBounds(-8, -10, 1280, 720);
        System.out.print(Frame_Content5.getContentPane().add(Label_Content5));
    }
    public static void ContentPage6(){
        Frame_Content6 = new JFrame();
        Frame_Content6.setTitle("FlappyChiangmai");
        Frame_Content6.setBounds(80, 50, 1280, 720);
        Frame_Content6.setResizable(false);
        Frame_Content6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame_Content6.getContentPane().setLayout(null);

        Button_Next6 = new JButton("NEXT");
        Button_Next6.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Next6.setBounds(1030, 600, 200, 50);
        Button_Next6.addActionListener(NH6);
        Frame_Content6.getContentPane().add(Button_Next6);

        Button_Back5 = new JButton("Back");
        Button_Back5.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Back5.setBounds(30, 600, 200, 50);
        Button_Back5.addActionListener(BH5);
        Frame_Content6.getContentPane().add(Button_Back5);

        Button_Home6 = new JButton("HOME");
        Button_Home6.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Home6.setBounds(500, 600, 200, 50);
        Button_Home6.addActionListener(HH6);
        Frame_Content6.getContentPane().add(Button_Home6);

        Label_Content6 = new JLabel("");
        Image img = new ImageIcon(GUIFlappyChingMai.class.getResource("/imageGUI/ContentPage6.jpg")).getImage();
        Label_Content6.setIcon(new ImageIcon(img));
        Label_Content6.setBounds(-8, -10, 1280, 720);
        System.out.print(Frame_Content6.getContentPane().add(Label_Content6));

    }
    //เป็น JFrame ที่มีปุ่ม home กับ back
    public static void ContentPage7(){
        Frame_Content7 = new JFrame();
        Frame_Content7.setTitle("FlappyChiangmai");
        Frame_Content7.setBounds(80, 50, 1280, 720);
        Frame_Content7.setResizable(false);
        Frame_Content7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame_Content7.getContentPane().setLayout(null);

        Button_Back6 = new JButton("Back");
        Button_Back6.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Back6.setBounds(30, 600, 200, 50);
        Button_Back6.addActionListener(BH6);
        Frame_Content7.getContentPane().add(Button_Back6);

        Button_Home7 = new JButton("HOME");
        Button_Home7.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Button_Home7.setBounds(500, 600, 200, 50);
        Button_Home7.addActionListener(HH7);
        Frame_Content7.getContentPane().add(Button_Home7);

        Label_Content7 = new JLabel("");
        Image img = new ImageIcon(GUIFlappyChingMai.class.getResource("/imageGUI/ContentPage7.jpg")).getImage();
        Label_Content7.setIcon(new ImageIcon(img));
        Label_Content7.setBounds(-8, -10, 1280, 720);
        System.out.print(Frame_Content7.getContentPane().add(Label_Content7));

    }
    
    
    //ปุ่มเพื่อกลับไปหน้า Start
    public static class Home1Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Start();
        Frame_Content1.dispose();
        Frame_Start.setVisible(true);
    }

}
    public static class Home2Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Start();

            Frame_Content2.dispose();
            Frame_Start.setVisible(true);
    }

}
    public static class Home3Handler implements ActionListener {


    public void actionPerformed(ActionEvent e) {

        Start();

        Frame_Content3.dispose();
        Frame_Start.setVisible(true);
    }

}
    public static class Home4Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Start();
        Frame_Content4.dispose();
        Frame_Start.setVisible(true);
    }

}
    public static class Home5Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Start();
        Frame_Content5.dispose();
        Frame_Start.setVisible(true);
    }

}
    public static class Home6Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Start();
        Frame_Content6.dispose();
        Frame_Start.setVisible(true);
    }

}
    public static class Home7Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Start();
        Frame_Content7.dispose();
        Frame_Start.setVisible(true);
    }

}
    
    //ปุ่มกลับไปก่อนหน้า
    public static class Back1Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage1();
        Frame_Content1.setVisible(true);
        Frame_Content2.dispose();
    }

}
	public static class Back2Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage2();
        Frame_Content2.setVisible(true);
        Frame_Content3.dispose();
    }

}
	public static class Back3Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage3();
        Frame_Content3.setVisible(true);
        Frame_Content4.dispose();
    }

}
	public static class Back4Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage4();
        Frame_Content4.setVisible(true);
        Frame_Content5.dispose();
    }

}
	public static class Back5Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage5();
        Frame_Content5.setVisible(true);
        Frame_Content6.dispose();
    }

}
	public static class Back6Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage6();
        Frame_Content6.setVisible(true);
        Frame_Content7.dispose();
    }

}
	
	//ปุ่มไปหน้าถัดไป
	public static class Next1Handler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        ContentPage2();
        Frame_Content1.dispose();
        Frame_Content2.setVisible(true);
    }

}
	public static class Next2Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage3();
        Frame_Content2.dispose();
        Frame_Content3.setVisible(true);
    }

}
	public static class Next3Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage4();
        Frame_Content3.dispose();
        Frame_Content4.setVisible(true);
    }

}
	public static class Next4Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage5();
        Frame_Content4.dispose();
        Frame_Content5.setVisible(true);
    }

}
	public static class Next5Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage6();
        Frame_Content5.dispose();
        Frame_Content6.setVisible(true);
    }

}
	public static class Next6Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        ContentPage7();
        Frame_Content6.dispose();
        Frame_Content7.setVisible(true);
    }

}
	//ปุ่มไปหน้า content
	public static class ContentHandler implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        ContentPage1();
        Frame_Content1.setVisible(true);
        Frame_Start.dispose();

    }
}
	//ปุ่มเริ่มเกม
	public static class StatHandler implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        GUIFlappyChingMai.inputname();
        Frame_Start.dispose();
    }

    
}
	//ปุ่มออกจากโปรแกรม
    public static class ExitStartHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}

