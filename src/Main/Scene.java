package Main;

import java.awt.*; //
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import object.Pipe;
import person.Lantern;

public class Scene extends JPanel {

	//Variables
	private ImageIcon IconBackground;
	private Image imgBackground;

	public Pipe pipeTop1;
	public Pipe pipeBottom1;
	public Pipe pipeTop2;
	public Pipe pipeBottom2;
	public Pipe pipeTop3;
	public Pipe pipeBottom3;
	public Lantern flappy;
	public static int score;
	private Font font;
	private final int BACKGROUND_WIDTH = 140;
	private final int DISTANCE_PIPE = 250;
	private final int DIFFERENCE_PIPE = 120;
	public int xbackground;
	private int xPIPEx;
	public boolean end;
	private Random random;

	//Construct
	public Scene() {

 		super();
		this.IconBackground = new ImageIcon(getClass().getResource("/images/BGinGame.jpg"));
		this.imgBackground = this.IconBackground.getImage();

		this.xbackground = 0;
		this.xPIPEx = 400;
		this.end = false;
		this.pipeTop1 = new Pipe(this.xPIPEx, -150, "/images/TOP.png");
		this.pipeBottom1 = new Pipe(this.xPIPEx, 250, "/images/Buttom.png");

		this.pipeTop2 = new Pipe(this.xPIPEx + this.DISTANCE_PIPE, -150, "/images/TOP.png");
		this.pipeBottom2 = new Pipe(this.xPIPEx + this.DISTANCE_PIPE, 270, "/images/Buttom.png");

		this.pipeTop3 = new Pipe(this.xPIPEx + this.DISTANCE_PIPE * 2, -150, "/images/TOP.png");
		this.pipeBottom3 = new Pipe(this.xPIPEx + this.DISTANCE_PIPE * 2, 270, "/images/Buttom.png");

		this.flappy = new Lantern(70, 70, "/images/1.png");
		random = new Random();
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Keyboard());

		this.score = 0;
		this.font = new Font("Arial", Font.PLAIN,50);

		Thread Screen = new Thread(new endgame());
		Screen.start();
	}
	//Methods
	//วาด BackGround
	private void displacementBackground(Graphics g) {
		if (this.xbackground == -this.BACKGROUND_WIDTH) {
			this.xbackground = 0;
		}
		boolean b = g.drawImage(this.imgBackground, this.xbackground, 0, null);
		g.drawImage(this.imgBackground, this.xbackground + this.BACKGROUND_WIDTH, 0, null);
		

	}
	//วาด PIPE
	private void displacementPIPE(Graphics g) {


		//pipe1
		this.pipeTop1.setX(this.pipeTop1.getX() - 1);
		this.pipeBottom1.setX(this.pipeTop1.getX());

		if (this.pipeTop1.getX() == -100) {
			this.pipeTop1.setX(this.pipeTop3.getX() + this.DISTANCE_PIPE);
			this.pipeTop1.setY(-100 - 10 * this.random.nextInt(18));
			this.pipeBottom1.setY(this.pipeTop1.getY() + this.pipeTop1.getheight() + this.DIFFERENCE_PIPE );

		}
		g.drawImage(this.pipeTop1.getImgPIPE(), this.pipeTop1.getX(), this.pipeTop1.getY(), null);
		g.drawImage(this.pipeBottom1.getImgPIPE(), this.pipeBottom1.getX(), this.pipeBottom1.getY(), null);


		//pipe2
		this.pipeTop2.setX(this.pipeTop2.getX() - 1);
		this.pipeBottom2.setX(this.pipeTop2.getX());

		if (this.pipeTop2.getX() == -100) {
			this.pipeTop2.setX(this.pipeTop1.getX() + this.DISTANCE_PIPE);
			this.pipeTop2.setY(-100 - 10 * this.random.nextInt(18));
			this.pipeBottom2.setY(this.pipeTop2.getY() + this.pipeTop2.getheight() + this.DIFFERENCE_PIPE );

		}
		g.drawImage(this.pipeTop2.getImgPIPE(), this.pipeTop2.getX(), this.pipeTop2.getY(), null);
		g.drawImage(this.pipeBottom2.getImgPIPE(), this.pipeBottom2.getX(), this.pipeBottom2.getY(), null);

		//pipe3
		this.pipeTop3.setX(this.pipeTop3.getX() - 1);
		this.pipeBottom3.setX(this.pipeTop3.getX());

		if (this.pipeTop3.getX() == -100) {
			this.pipeTop3.setX(this.pipeTop2.getX() + this.DISTANCE_PIPE);
			this.pipeTop3.setY(-100 - 10 * this.random.nextInt(18));
			this.pipeBottom3.setY(this.pipeTop3.getY() + this.pipeTop3.getheight() + this.DIFFERENCE_PIPE );

		}
		g.drawImage(this.pipeTop3.getImgPIPE(), this.pipeTop3.getX(), this.pipeTop3.getY(), null);
		g.drawImage(this.pipeBottom3.getImgPIPE(), this.pipeBottom3.getX(), this.pipeBottom3.getY(), null);

	}
	//เช็คเงื่อนไขของแต่ละท่อที่บินผ่าน
	private boolean HitFlappy(){
		boolean end = false;
		//Pipe1
	if(this.flappy.getX() + this.flappy.getwidth() > this.pipeBottom1.getX() - 20 &&
			this.flappy.getX() < this.pipeBottom1.getX() + this.pipeBottom1.getwidth() + 20){
		end = this.flappy.Hit(this.pipeBottom1);
		if(end == false){end = this.flappy.Hit(this.pipeTop1);}
	}else{
		//Pipe2
		if(this.flappy.getX() + this.flappy.getwidth() > this.pipeBottom2.getX() - 20 && this.flappy.getX()
				< this.pipeBottom2.getX() + this.pipeBottom2.getwidth() + 20){
			end = this.flappy.Hit(this.pipeBottom2);
			if(end == false){end = this.flappy.Hit(this.pipeTop2);}
		}else{
			//Pipe3
			if(this.flappy.getX() + this.flappy.getwidth() > this.pipeBottom3.getX() - 20 && this.flappy.getX()
					< this.pipeBottom3.getX() + this.pipeBottom3.getwidth() + 20){
				end = this.flappy.Hit(this.pipeBottom3);
				if(end == false){end = this.flappy.Hit(this.pipeTop3);}
			}else{
				// contact
				if(this.flappy.getY() < 0 || this.flappy.getY() + this.flappy.getheight() > 355){end = true;}
				else{end = false;}
			}
		}
	}
		return end;
}
	//ถ้าโคมลอยบินผ่านท่อ getx + getwidth == 95 จะ score ++
	private void score(){
		if(this.pipeBottom1.getX()+this.pipeBottom1.getwidth() == 95 || this.pipeBottom2.getX() + this.pipeBottom2.getwidth() == 95 || this.pipeBottom3.getX()+this.pipeBottom3.getwidth() == 95)
			this.score++;
	}
	//เอาไว้ return score ให้ class endgame
	public static int getScore() {
		return score;
	}
	//วาดทุกอย่างลงไปใน Frame
	public void paint(Graphics g) {
		this.displacementBackground(g);
		this.displacementPIPE(g);
		this.score();
		g.setFont(font);
		g.drawString(""+score,10,50);
		this.end = this.HitFlappy();
		this.flappy.setY(this.flappy.getY()+1);
		g.drawImage(this.flappy.getImglantern(),this.flappy.getX(),this.flappy.getY(),null);
	}
}
