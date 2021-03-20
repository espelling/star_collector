package pack1;

import java.util.Timer;
import java.util.TimerTask;


public class Explosion {
	Timer explosion = new Timer();
	private int temp = 0;
	public Explosion() {
		explosion = new Timer();
		explosion.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Var.imSpiel) {
				
				if (Var.kollidiert) {
					if (temp < 15) {
						Var.expAnimation = temp;
						temp++;
					}else if (temp == 15) {
						Var.expAnimation = 15;
						temp = 0;
						Var.kollidiert = false;
					}
				}
				
			}
			}
		}, 0, 50);
	}

}
