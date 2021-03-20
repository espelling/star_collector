package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Aktualisierung {
	Timer aktual;
	static int tempAktualisierung = 0;
	public Aktualisierung() {
		aktual = new Timer();
		aktual.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if (Var.imMenue) {
					if (tempAktualisierung == 0) {
						Var.btnResume.requestFocus();
						Var.btnExit.requestFocus();
						Var.btnReplay.requestFocus();
						tempAktualisierung++;
					}else if (tempAktualisierung == 1) {
						Var.jf1.requestFocus();
					}
				
				}
			}
		}, 0, 50);
	}

}
