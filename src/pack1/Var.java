package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Var {
	static JFrame jf1;
	
	static boolean spielNeuStarten = false;
	
	//Background Space
	static int screenwith = 800, screenheight = 600;
	static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed = 9;
	
	//Rakete
	static int x = 400, y = 400;
	static int speedup = 3, speeddown = 2, speedleft = 4, speedright = 4;
	
	//Flamme
	static int flammeAnimation;
	
	//Sterne
	static int sterne = 0, leben = 2, maxLeben = 2;
	
	//Buttons
	static JButton btnResume, btnShop, btnExit, btnReplay;
	
	//Gegner
	static int[] gegnerX = new int[5], gegnerY = new int[5];
	static int gegnerspeed[] = new int[5];
	
	//Collectables Sterne
	static int[] sterneX1 = new int[5], sterneY1 = new int[5];
	static int[] sterneX2 = new int[5], sterneY2 = new int[5];
	static int sterneX3, sterneY3;
	
	static int[] sterneSpeed1 = new int[5], sterneSpeed2 = new int[2];
	static int sterneSpeed3;
	
	//Explosion Animation
	static int expAnimation;
	
	
	//Steuerung	
	static boolean moveup=false, movedown=false, moveleft=false, moveright=false;
	
	//Variablen für Kollision
	static boolean kollidiert = false, verloren = false;
	static boolean imSpiel = true, imMenue = false, inOptionen = false;
	static Label lbl1;
	
	static BufferedImage ib1, ib2;
	static BufferedImage iRakete, iFlamme1, iFlamme2;
	static BufferedImage igegner1;
	static BufferedImage iSterne1, iSterne2, iSterne3;
	static BufferedImage[] iExplosion = new BufferedImage[16];
	
	public Var() {
		
		//Bilder laden
		try {
			//Background
			ib1 = ImageIO.read(new File("rsc/B1.png"));
			ib2 = ImageIO.read(new File("rsc/B1.png"));
			
			//Rakete
			iRakete = ImageIO.read(new File("rsc/rocket.png"));
			//Flamme
			iFlamme1 = ImageIO.read(new File("rsc/flame1.1.png"));
			iFlamme2 = ImageIO.read(new File("rsc/flame1.2.png"));
			//Gegner
			igegner1 = ImageIO.read(new File("rsc/gegner1.png"));
			//Sterne
			iSterne1 = ImageIO.read(new File("rsc/stern_bronze.png"));
			iSterne2 = ImageIO.read(new File("rsc/stern_silber.png"));
			iSterne3 = ImageIO.read(new File("rsc/stern_gold.png"));
			//Explosion
			for (int i = 0; i < iExplosion.length; i++) {
				iExplosion[i] = ImageIO.read(new File("rsc/exp"+(i+1)+".gif"));
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}
			
		gegnerspeed[0] = 3;
		gegnerspeed[1] = 4;
		gegnerspeed[2] = 3;
		gegnerspeed[3] = 4;
		gegnerspeed[4] = 3;
		
		sterneSpeed1[0] = 2;
		sterneSpeed1[1] = 3;
		sterneSpeed1[2] = 2;
		sterneSpeed1[3] = 3;
		sterneSpeed1[4] = 3;
		
		sterneSpeed2[0] = 4;
		sterneSpeed2[1] = 5;
		
		sterneSpeed3 = 6;
	}

}
