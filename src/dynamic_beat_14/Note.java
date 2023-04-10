package dynamic_beat_14;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread{
	
	private Image noteBasicImage = new ImageIcon(Main.class.getResource("../images/noteBasic.png")).getImage();
	private int x,y = 580-(1000/ Main.SLEEP_TIME*Main.NOTE_SPEED)*Main.REACH_TIME;
	private String noteType;
	public Note(int x, String noteType) {
		this.x = x;
		this.noteType = noteType;
		
	}
	
	public Note(String noteType) {
		if(noteType.equals("S")) {
			x = 228;
		}
		else if(noteType.endsWith("D")) {
			x = 332;
		}
		else if(noteType.endsWith("F")) {
			x = 436;
		}
		else if(noteType.endsWith("Spcae")) {
			x = 540;
		}
		else if(noteType.endsWith("J")) {
			x = 744;
		}
		else if(noteType.endsWith("K")) {
			x = 848;
		}
		else if(noteType.endsWith("L")) {
			x = 952;
		}
		this.noteType = noteType;
	}
	
	public void ScreenDraw(Graphics2D g) {
		if(!noteType.equals("space")) {
			g.drawImage(noteBasicImage, x, y, null);
		}
		else {
			g.drawImage(noteBasicImage, x, y, null);
			g.drawImage(noteBasicImage, x+100, y, null);
		}
	}
	
	public void drop() {
		y += Main.NOTE_SPEED;
	}
	public void run() {
		try {
			while(true){
				drop();
				Thread.sleep(Main.SLEEP_TIME);
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
