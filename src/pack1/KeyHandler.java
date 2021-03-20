package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	
	static int tempKeyHandler = 0;
	
	//Aktion, wenn Button kurz gedrückt wird
	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	//Aktion, wenn Button lange gedrückt wird
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			Var.moveup=true;
		}
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			Var.movedown=true;
		}
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			Var.moveleft=true;
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			Var.moveright=true;
		}
		
		if (tempKeyHandler == 0) {
			//Menü
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				Var.imSpiel = false;
				Var.imMenue = true;
				Var.btnResume.setVisible(true);
				Var.btnExit.setVisible(true);
				Var.btnReplay.setVisible(true);
				tempKeyHandler++;
			}
		}else if (tempKeyHandler == 1) {
			if (e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				Var.imSpiel = true;
				Var.imMenue = false;
				Var.btnResume.setVisible(false);
				Var.btnExit.setVisible(false);
				Var.btnReplay.setVisible(false);
				tempKeyHandler--;
				Aktualisierung.tempAktualisierung = 0;
			}
		}	
	}
	
	//Aktion, wenn Button los gelassen wird
	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			Var.moveup=false;
		}
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			Var.movedown=false;
		}
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			Var.moveleft=false;
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			Var.moveright=false;
		}
	}	
}
