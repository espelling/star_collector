package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {
	Timer movement;
	private int temp = 0;
	
	public GegnerMovement() {
		
		//Standardposition der Gegner
		for (int i = 0; i <= 4; i++) {
			Var.gegnerX[i]= 20 + temp;
			Var.gegnerY[i]= -100 - temp;
			temp += 160;
		}
		
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			
		@Override
		public void run() {
			
			if(Var.imSpiel) {
				
				for (int i = 0; i <= 4; i++) {
					Var.gegnerY[i] += Var.gegnerspeed[i];
					
					if (Var.gegnerY[i] >= Var.screenheight) {
						Var.gegnerY[i] = -100;
					}
				}	
			}
		}
		}, 0, 9);
		
		
	}

}
