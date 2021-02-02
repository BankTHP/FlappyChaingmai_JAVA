package person;
import object.Pipe;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Lantern implements Runnable {
	//Variables
	private int width;
	private int height;
	private int x;
	private int y;
	private int dy;
	private String strImage;
	private ImageIcon iconlantern ;
	private Image imglantern;

	private final int PAUSE = 50;
	//กำนหนดขนาดของโคมลอย
	public Lantern(int x, int y, String strImage) {
			this.width = 34;
			this.height = 24;
			this.x = x;
			this.y = y;
			this.strImage = strImage;
			this.iconlantern = new ImageIcon((getClass().getResource(this.strImage)));
			this.imglantern = this.iconlantern.getImage();

			Thread fly = new Thread(this);
			fly.start();


	}
	//Getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getwidth() {
		return width;
	}
	public int getheight() { return height; }
	public Image getImglantern() {
		return imglantern;
	}
	//Setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	//Methods
	
	//รับมาจาก keyboard เมื่อกดปุ่ม SPACEBAR
	public void Up() {
		this.dy = 50;
		this.y = this.y - this.dy;
	}
	//ถ้าไม่มีจากกด SPACEBAR
	private void Down(int dy) {
		if (dy > 10) {
			this.iconlantern = new ImageIcon(getClass().getResource("/images/2.png"));
			this.imglantern = this.iconlantern.getImage();
			this.y = this.y ;
		}
		else if (dy > 5) {
			this.y = this.y -2;
		} else if (dy > 1) {
			this.y = this.y -4 ;
		} else if (dy == 1) {
			this.iconlantern = new ImageIcon(getClass().getResource("/images/1.png"));
			this.imglantern = this.iconlantern.getImage();
		}
	}
	//เช็คว่าโคมลอยได้ชนกับท่อ ตำแหน่ง x,y ที่ค่า return มาหรือเปล่า
	public boolean Hit(Pipe pipe) {
		if (pipe.getY() < 50) {
			if (this.y <= pipe.getY() + pipe.getheight() && this.x + this.width >=
					pipe.getX() && this.x <= pipe.getX() + pipe.getwidth()) {
				return true;
			} else {
				return false;
			}
		}else
			if (this.y + this.height >= pipe.getY()&&this.x+this.width
					>=pipe.getX()&& this.x<= pipe.getX() +pipe.getwidth()){
				return true;}
			else{
				return  false; }
			}
	@Override
	public void run() {
		while (true) {
			this.Down(dy);
			this.dy--;
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {
			}
		}
	}
}
