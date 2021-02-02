package object;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Pipe {

	//Variable
	private int width;
	private int height;
	private int x;
	private int y;
	private String strImage;
	private ImageIcon iconPipe;
	private Image imgPIPE;
	
	//Construct
	//กำหนดขนาดท่อ
	public Pipe(int x,int y,String strImage) {
		this.width = 50;
		this.height = 300;
		this.x = x;
		this.y = y;
		this.strImage = strImage;
		
		this.iconPipe = new ImageIcon(getClass().getResource(this.strImage));
		this.imgPIPE = this.iconPipe.getImage();
		
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
	public int getheight() {
		return height;
		
	}
	public Image getImgPIPE() {
		return imgPIPE;
	}
	//Setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
}

