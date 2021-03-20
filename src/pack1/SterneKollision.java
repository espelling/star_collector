package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class SterneKollision {
	Timer kollision;
	public SterneKollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if (Var.imSpiel && Var.verloren == false) {
				
				//Bronze
				for (int i = 0; i <= 4; i++) {
					if (Var.x >= Var.sterneX1[i]-50 && Var.x <= Var.sterneX1[i] + 70 &&
							Var.y >= Var.sterneY1[i]-50 && Var.y <= Var.sterneY1[i] + 50) {
							
							Var.sterne += 1;			//Punkte pro eingefangenen Stern
							Var.sterneY1[i] = -200;		//Stern bekommt neue position von Oben
					}
				}
				
				//Silber
				for (int i = 0; i <= 1; i++) {
					if (Var.x >= Var.sterneX2[i]-50 && Var.x <= Var.sterneX2[i] + 70 &&
							Var.y >= Var.sterneY2[i]-50 && Var.y <= Var.sterneY2[i] + 50) {
							
							Var.sterne += 5;				//Punkte pro eingefangenen Stern
							Var.sterneY2[i] = -1500;		//Stern bekommt neue position von Oben
					}
				}
				
				//Gold		
				if (Var.x >= Var.sterneX3-50 && Var.x <= Var.sterneX3 + 70 &&
						Var.y >= Var.sterneY3-50 && Var.y <= Var.sterneY3 + 50) {
						
						Var.sterne += 10;			//Punkte pro eingefangenen Stern
						Var.sterneY3 = -4000;		//Stern bekommt neue position von Oben
				}
				}
		
			}
		}, 0, 15);
	}

}
