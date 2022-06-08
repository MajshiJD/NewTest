package nextStep;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.JFrame;

import nextStep.Square;

public class Ramka extends JFrame{
	private JFrame rama = new JFrame();
	private int xLoc=100;
	private int yLoc=100;
	public Ramka() {
		
		Menu pasek = new Menu();
		
		GraphicPanel graf = new GraphicPanel();
		
		pasek.getPasek1opcja1().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color color = new Color(0, 0, 0);
                
				graf.getSquares().add(new Square(xLoc, yLoc, color));
                graf.setBackground(Color.CYAN);
				graf.repaint();
              
                xLoc += 20;
                yLoc += 20;
				
			}
		});
		pasek.getOptionsMenu1().add(pasek.getPasek1opcja1());
		
		rama.add(graf);
		rama.setLayout(new GridLayout(1,3));
		rama.add(new PanelGlowny());
		rama.setJMenuBar(pasek);
		rama.setPreferredSize(new Dimension(850,850));
		rama.setDefaultCloseOperation(EXIT_ON_CLOSE);
		rama.setVisible(true);
		rama.pack();
	}


	
}
