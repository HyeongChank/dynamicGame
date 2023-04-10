package dynamic_beat_15;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Game extends Thread {

	
	private Image notRouteLineImage = new ImageIcon(Main.class.getResource("../images/noteRouteLine.png")).getImage();
	private Image judgementLineImage = new ImageIcon(Main.class.getResource("../images/judgementLine.png")).getImage();
	private Image gameInfoImage = new ImageIcon(Main.class.getResource("../images/gameInfo.png")).getImage();
	private Image noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();

	private String titleName;
	private String difficulty;
	private String musicTitle;
	private Music gameMusic;
	
	ArrayList<Note> noteList = new ArrayList<Note>();
	
	public Game(String titleName, String difficulty, String musicTitle) {
		this.titleName = titleName;
		this.difficulty = difficulty;
		this.musicTitle = musicTitle;
		gameMusic = new Music(this.musicTitle, false);
		
		
	}
	
	
	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteSImage, 228, 30, null);
		g.drawImage(noteRouteDImage, 332, 30, null);
		g.drawImage(noteRouteFImage, 436, 30, null);
		g.drawImage(noteRouteSpace1Image, 540, 30, null);
		g.drawImage(noteRouteSpace2Image, 640, 30, null);
		g.drawImage(noteRouteJImage, 744, 30, null);
		g.drawImage(noteRouteKImage, 848, 30, null);
		g.drawImage(noteRouteLImage, 952, 30, null);
		g.drawImage(notRouteLineImage, 224, 30, null);
		g.drawImage(notRouteLineImage, 328, 30, null);
		g.drawImage(notRouteLineImage, 432, 30, null);
		g.drawImage(notRouteLineImage, 536, 30, null);
		g.drawImage(notRouteLineImage, 740, 30, null);
		g.drawImage(notRouteLineImage, 844, 30, null);
		g.drawImage(notRouteLineImage, 948, 30, null);
		g.drawImage(notRouteLineImage, 1052, 30, null);
		
	
		g.drawImage(gameInfoImage, 0, 660, null);
		g.drawImage(judgementLineImage, 0, 580, null);
		for(int i=0 ; i<noteList.size();i++){
			Note note = noteList.get(i);
			if(!note.isProceeded()) {
				noteList.remove(i);
				i--;
				
			}
			else {
			
			
				note.ScreenDraw(g);
			}
		}	
		g.setColor(Color.white);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString(titleName, 20, 702);
		
		g.drawString(difficulty, 1190, 702);
		g.setFont(new Font("Arial", Font.PLAIN, 26));
		g.setColor(Color.DARK_GRAY);
		g.drawString("S", 270, 609);
		g.drawString("D", 374, 609);
		g.drawString("F", 478, 609);
		g.drawString("Space Bar", 580, 609);
		g.drawString("J", 784, 609);
		g.drawString("K", 889, 609);
		g.drawString("L", 993, 609);
		g.setColor(Color.LIGHT_GRAY);
		g.setFont(new Font("Elephant", Font.BOLD, 30));
		g.drawString("000000", 565, 702);
	
	}

		
	
	public void pressS() {
		judge("S");
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}

	public void releaseS() {
		judge("S");
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		
	}

	public void pressD() {
		judge("D");
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}

	public void releaseD() {
		judge("D");
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressF() {
		judge("F");
		noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}

	public void releaseF() {
		judge("F");
		noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressSpace() {
		judge("Spcae");
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("centerPressedMusic.mp3", false).start();
	}

	public void releaseSpace() {
		judge("Space");
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressJ() {
		judge("J");
		noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}

	public void releaseJ() {
		judge("J");
		noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressK() {
		judge("K");
		noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}

	public void releaseK() {
		judge("K");
		noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressL() {
		judge("L");
		noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}

	public void releaseL() {
		judge("L");
		noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}

	
	public void run() {
		dropNotes(this.titleName);
	}
	public void close() {
		gameMusic.close();
		this.interrupt();
	}
	public void dropNotes(String titleName) {
//		Beat[] beats = {
//				new Beat(1000,"S"),
//				new Beat(2000,"D"),
//				new Beat(3000,"F"),
//				new Beat(1000,"S"),
		Beat[] beats = null;
		if(titleName.equals("goldn") && difficulty.equals("Easy")) {
			int startTime = 4460 - Main.REACH_TIME*1000;
			int gap = 125;
			beats = new Beat[] {
					new Beat(startTime, "S"),
					new Beat(startTime + gap*2, "D"),
					new Beat(startTime + gap*4, "S"),
					new Beat(startTime + gap*6, "D"),
					new Beat(startTime + gap*8, "S"),
					new Beat(startTime + gap*10, "D"),
					new Beat(startTime + gap*12, "J"),
					new Beat(startTime + gap*14, "K"),
					new Beat(startTime + gap*16, "L"),
					new Beat(startTime + gap*18, "K"),
					new Beat(startTime + gap*20, "D"),
					new Beat(startTime + gap*22, "K"),
					new Beat(startTime + gap*22, "D"),
					new Beat(startTime + gap*32, "D"),
					new Beat(startTime + gap*34, "S"),
					new Beat(startTime + gap*36, "D"),
					new Beat(startTime + gap*38, "S"),
					new Beat(startTime + gap*40, "D"),
					new Beat(startTime + gap*42, "J"),
					new Beat(startTime + gap*46, "K"),
					new Beat(startTime + gap*46, "L"),
					new Beat(startTime + gap*48, "K"),
					new Beat(startTime + gap*50, "D"),
					new Beat(startTime + gap*52, "K"),
					new Beat(startTime + gap*52, "D"),
			};
		}
		if(titleName.equals("goldn") && difficulty.equals("Hard")) {
			int startTime = 4460 - Main.REACH_TIME*1000;
			int gap = 125;
			beats = new Beat[] {
					new Beat(startTime, "J"),
					new Beat(startTime + gap*2, "K"),
					new Beat(startTime + gap*4, "L"),
			};		
		}			
		else if(titleName.equals("thefuturebass")) {
			int startTime = 1000;
			beats = new Beat[] {
					new Beat(startTime, "Space")
			};
		}
		else if(titleName.equals("weeknds")) {
			int startTime = 1000;
			beats = new Beat[] {
					new Beat(startTime, "Space")
			};
		}
		
		int i = 0;
		gameMusic.start();
		while(i < beats.length && !isInterrupted()) {
			boolean dropped = false;
			if(beats[i].getTime() <= gameMusic.getTime()) {
				Note note = new Note(beats[i].getNoteName());
				note.start();
				noteList.add(note);
				i++;
				dropped = true;
			}
			if(!dropped) {
				try {
					Thread.sleep(5);
					
				} catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}
//		noteList.add(new Note(228,120,"short"));
//		noteList.add(new Note(332,580,"short"));
//		noteList.add(new Note(436,500,"short"));
//		noteList.add(new Note(540,340,"long"));
//		noteList.add(new Note(744,325,"short"));
//		noteList.add(new Note(848,305,"short"));
//		noteList.add(new Note(952,305,"short"));
		
		
	}
	public void judge(String input) {
		for(int i=0; i<noteList.size(); i++) {
			Note note = noteList.get(i);
			if(input.equals(note.getNoteType())) {
				note.judge();
				break;
			}
		}
	}
}
