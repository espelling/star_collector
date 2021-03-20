package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class GUI {
	
	public GUI() {
		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenwith, Var.screenheight);
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);
		Var.jf1.setTitle("Sternensammler");
		Var.jf1.setResizable(false);
		
		Var.jf1.addKeyListener(new KeyHandler());
		
		Var.jf1.requestFocus();
		Var.jf1.setVisible(true);
		
		Var.lbl1 = new Label();
		Var.lbl1.setBounds(0,0,Var.screenwith, Var.screenheight);
		Var.lbl1.setVisible(true);
		Var.jf1.add(Var.lbl1);
		
		//Button Resume
		Var.btnResume = new JButton();
		Var.btnResume.setText("Fortsetzen");
		Var.btnResume.setBounds(40, 50, 725, 50);
		Var.btnResume.setVisible(false);
		Var.btnResume.addActionListener(new ActionHandler());
		Var.btnResume.setBackground(Color.BLACK);
		Var.btnResume.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btnResume.setForeground(Color.WHITE);
		Var.btnResume.setBorder(null);
		Var.btnResume.setFocusPainted(false);
		Var.btnResume.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnResume.setBackground(new Color(0,230,115));
				Var.btnResume.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent evt) {
				Var.btnResume.setBackground(Color.BLACK);
				Var.btnResume.setForeground(Color.WHITE);
			}
		});
		Var.jf1.add(Var.btnResume);
				
		//Button Exit
		Var.btnExit = new JButton();
		Var.btnExit.setText("Beenden");
		Var.btnExit.setBounds(30, 150, 725, 50);
		Var.btnExit.setVisible(false);
		Var.btnExit.addActionListener(new ActionHandler());
		Var.btnExit.setBackground(Color.BLACK);
		Var.btnExit.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btnExit.setForeground(Color.WHITE);
		Var.btnExit.setBorder(null);
		Var.btnExit.setFocusPainted(false);
		Var.btnExit.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnExit.setBackground(new Color(0,230,115));
				Var.btnExit.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent evt) {
				Var.btnExit.setBackground(Color.BLACK);
				Var.btnExit.setForeground(Color.WHITE);
			}
		});
		Var.jf1.add(Var.btnExit);
				
		//Button Replay
		Var.btnReplay = new JButton();
		Var.btnReplay.setText("Neu starten");
		Var.btnReplay.setBounds(30, 250, 725, 50);
		Var.btnReplay.setVisible(false);
		Var.btnReplay.addActionListener(new ActionHandler());
		Var.btnReplay.setBackground(Color.BLACK);
		Var.btnReplay.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btnReplay.setForeground(Color.WHITE);
		Var.btnReplay.setBorder(null);
		Var.btnReplay.setFocusPainted(false);
		Var.btnReplay.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnReplay.setBackground(new Color(0,230,115));
				Var.btnReplay.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent evt) {
				Var.btnReplay.setBackground(Color.BLACK);
				Var.btnReplay.setForeground(Color.WHITE);
			}
		});
		Var.jf1.add(Var.btnReplay);
	}
	

}
