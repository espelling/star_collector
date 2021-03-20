package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel{
	private static final long serialVersionUID = 1L;

	protected void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		//Code für Anti-Aliasing
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		if(Var.imSpiel) {
		
		//Background wird gezeichnet
		g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
		g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
		
		
		//Gegner werden gezeichnet
		for(int i = 0; i<5; i++) {
			g.drawImage(Var.igegner1, Var.gegnerX[i], Var.gegnerY[i], 80, 60, null);
		}
		
		//Flamme wird gezeichnet
		if(Var.flammeAnimation == 0) {
			g.drawImage(Var.iFlamme1, Var.x, Var.y+55, 50, 50, null);
		}else if (Var.flammeAnimation == 1) {
			g.drawImage(Var.iFlamme2, Var.x, Var.y+55, 50, 50, null);
		}
					
		//Bronze Stern
		for (int i = 0; i <= 4; i++) {
			g.drawImage(Var.iSterne1, Var.sterneX1[i], Var.sterneY1[i], 40, 40, null);
		}
		//Silber Stern
		for (int i = 0; i <= 1; i++) {
			g.drawImage(Var.iSterne2, Var.sterneX2[i], Var.sterneY2[i], 40, 40, null);
		}
		//Gold Stern
		g.drawImage(Var.iSterne3, Var.sterneX3, Var.sterneY3, 40, 40, null);
				
		//Rakete wird gezeichnet
		g.drawImage(Var.iRakete, Var.x, Var.y, 50, 70, null);
		
		//wenn verloren
		if (Var.verloren) {
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Du hast verloren!", 250, 100);
			g.drawString("Sterne: " + Var.sterne, 310, 200);
			g.setColor(new Color(100,100,100,128));
			g.fillRect(0, 0, Var.screenwith, Var.screenheight);
			
			Var.btnReplay.setVisible(true);
			Var.btnReplay.requestFocus();
			Var.jf1.requestFocus();
			
			repaint();
		}else {
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Sterne: " + Var.sterne, 20, 50);
			repaint();
		}
		
		//wenn von Asteroid getroffen
		if (Var.kollidiert) {
			for (int i = 0; i <= 16; i++) {
				if (Var.expAnimation == i) {
					g.drawImage(Var.iExplosion[i], Var.x-10, Var.y-10, 73, 100, null);
				}
			}
			
			if (Var.expAnimation > 1 && Var.expAnimation <= 4) {
				g.setColor(new Color(230, 0, 0, 45));
				g.fillRect(0, 0, Var.screenwith, Var.screenheight);
			}else if (Var.expAnimation >= 6 && Var.expAnimation <= 9){
				g.setColor(new Color(230, 0, 0, 45));
				g.fillRect(0, 0, Var.screenwith, Var.screenheight);
			}
		}
		
		repaint();
		
		}else if (Var.imMenue) {
			
			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
			
			if(Var.flammeAnimation == 0) {
				g.drawImage(Var.iFlamme1, Var.x, Var.y+55, 50, 50, null);
			}else if (Var.flammeAnimation == 1) {
				g.drawImage(Var.iFlamme2, Var.x, Var.y+55, 50, 50, null);
			}
			
			g.drawImage(Var.iRakete, Var.x, Var.y, 50, 70, null);
			
			for(int i = 0; i<5; i++) {
				g.drawImage(Var.igegner1, Var.gegnerX[i], Var.gegnerY[i], 80, 60, null);
			}
			
			g.setColor(new Color(100,100,100,128));
			g.fillRect(0, 0, Var.screenwith, Var.screenheight);
			
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Sterne: " + Var.sterne, 310, 200);
	
		}
	}
	
}
