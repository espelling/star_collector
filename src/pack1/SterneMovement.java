package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class SterneMovement {
	Timer movement;
	private int temp = 0;
	public SterneMovement() {
		
		//Standardposition der Sterne
		for (int i = 0; i <= 4; i++) {
			Var.sterneX1[i] = 20 + temp;
			Var.sterneY1[i] = -200 - temp;
			
			temp += 160;
		}
		
		Var.sterneX2[0] = 266;
		Var.sterneX2[1] = 532;
		Var.sterneY2[0] = -1000;
		Var.sterneY2[1] = -1500;
		
		Var.sterneX3 = 375;
		Var.sterneY3 = -4000;
		
		
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Var.imSpiel) {
					
				for (int i = 0; i <= 4; i++) {
					Var.sterneY1[i] += Var.sterneSpeed1[i];
					
					if(Var.sterneY1[i] >= Var.screenheight) {
						Var.sterneY1[i] = -350;
					}
				}
				
				for (int i = 0; i <= 1; i++) {
					Var.sterneY2[i] += Var.sterneSpeed2[i];
					
					if(Var.sterneY2[i] >= Var.screenheight) {
						Var.sterneY2[i] = -1500;
					}
				}
				
				Var.sterneY3 += Var.sterneSpeed3;
				if (Var.sterneY3 >= Var.screenheight) {
					Var.sterneY3 = -4000;
				}
			}
			}
			
		}, 0, 9);

	}
}
