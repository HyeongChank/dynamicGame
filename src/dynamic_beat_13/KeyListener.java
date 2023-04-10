package dynamic_beat_13;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class KeyListener extends KeyAdapter {

	
	public void keyPressed(KeyEvent e) {  //k대문자로 해서 반응안했었음
		if(DynamicBeat.game == null) 
			return; 
		
		if(e.getKeyCode() == KeyEvent.VK_S) {
			DynamicBeat.game.pressS();
		}
		 else if (e.getKeyCode() == KeyEvent.VK_D) {
			DynamicBeat.game.pressD();

		} else if (e.getKeyCode() == KeyEvent.VK_F) {
			DynamicBeat.game.pressF();
		
		} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			DynamicBeat.game.pressSpace();
		} else if (e.getKeyCode() == KeyEvent.VK_J) {
			DynamicBeat.game.pressJ();
		} else if (e.getKeyCode() == KeyEvent.VK_K) {
			DynamicBeat.game.pressK();
		} else if (e.getKeyCode() == KeyEvent.VK_L) {
			DynamicBeat.game.pressL();
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if(DynamicBeat.game == null) 
			return;  //게임이 시작중이지 않으면 아래 작업 거치지 않도록
		
		if (e.getKeyCode() == KeyEvent.VK_S) {
			DynamicBeat.game.releaseS();

		} else if (e.getKeyCode() == KeyEvent.VK_D) {
			DynamicBeat.game.releaseD();
		} else if (e.getKeyCode() == KeyEvent.VK_F) {
			DynamicBeat.game.releaseF();
		
		} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			DynamicBeat.game.releaseSpace();
		} else if (e.getKeyCode() == KeyEvent.VK_J) {
			DynamicBeat.game.releaseJ();
		} else if (e.getKeyCode() == KeyEvent.VK_K) {
			DynamicBeat.game.releaseK();
		} else if (e.getKeyCode() == KeyEvent.VK_L) {
			DynamicBeat.game.releaseL();
		}	
	}
}

