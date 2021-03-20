package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == Var.btnResume) {
			Var.imSpiel = true;
			Var.imMenue = false;
			Var.btnResume.setVisible(false);
			Var.btnExit.setVisible(false);
			
			KeyHandler.tempKeyHandler = 0;
			Aktualisierung.tempAktualisierung = 0;
			
			Var.jf1.requestFocus();
	
		}else if (e.getSource() == Var.btnExit) {
			System.exit(0);
			
		}else if (e.getSource() == Var.btnReplay && Var.verloren == false) {
			Var.imSpiel = true;
			Var.imMenue = false;
			Var.btnResume.setVisible(false);
			Var.btnExit.setVisible(false);
			
			Var.sterne = 0;
			
			//Standardposition der Gegner
			int temp1 = 0;
			for (int i = 0; i <= 4; i++) {
				Var.gegnerX[i]= 20 + temp1;
				Var.gegnerY[i]= -100 - temp1;
				temp1 += 160;
			}
			
			//Standardposition der Sterne
			int temp2 = 0;
			for (int i = 0; i <= 4; i++) {
				Var.sterneX1[i] = 20 + temp2;
				Var.sterneY1[i] = -200 - temp2;
				
				temp2 += 160;
			}
			
			Var.sterneX2[0] = 266;
			Var.sterneX2[1] = 532;
			Var.sterneY2[0] = -1000;
			Var.sterneY2[1] = -1500;
			
			Var.sterneX3 = 375;
			Var.sterneY3 = -4000;
			
			//Startposition Rakete
			Var.x = 400;
			Var.y = 400;
					
			KeyHandler.tempKeyHandler = 0;
			Aktualisierung.tempAktualisierung = 0;
			
			Var.jf1.requestFocus();
			
		}else if (e.getSource() == Var.btnReplay && Var.verloren == true) {
			Var.imSpiel = true;
			Var.imMenue = false;
			Var.btnResume.setVisible(false);
			Var.btnExit.setVisible(false);
			
			Var.verloren = false;
			Var.sterne = 0;
			Var.leben = 2;
			
			//Standardposition der Gegner
			int temp1 = 0;
			for (int i = 0; i <= 4; i++) {
				Var.gegnerX[i]= 20 + temp1;
				Var.gegnerY[i]= -100 - temp1;
				temp1 += 160;
			}
			
			//Standardposition der Sterne
			int temp2 = 0;
			for (int i = 0; i <= 4; i++) {
				Var.sterneX1[i] = 20 + temp2;
				Var.sterneY1[i] = -200 - temp2;
				
				temp2 += 160;
			}
			
			Var.sterneX2[0] = 266;
			Var.sterneX2[1] = 532;
			Var.sterneY2[0] = -1000;
			Var.sterneY2[1] = -1500;
			
			Var.sterneX3 = 375;
			Var.sterneY3 = -4000;
			
			//Startposition Rakete
			Var.x = 400;
			Var.y = 400;
			
			KeyHandler.tempKeyHandler = 0;
			Aktualisierung.tempAktualisierung = 0;
			
			Var.jf1.requestFocus();
		}
	}
}
