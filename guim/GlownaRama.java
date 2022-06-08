package guim;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.*;

public class GlownaRama extends JFrame{
	
	
	JFrame mainFrame = new JFrame("Cos");
	
	
	public GlownaRama() {
		
		mainFrame.setLayout(new BorderLayout());
		
		PanelGuziki guziki = new PanelGuziki();
		Menu menu = new Menu();
		
		
		
		JMenuItem kd = new JMenuItem("Hallah");
		
		kd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				guziki.setBackground(Color.BLUE);
				
				
				
			}
		});
		menu.getOptionsMenu2().add(kd);
		mainFrame.setJMenuBar(menu.makeMenu());
		mainFrame.add(guziki.makePanel());
		
		mainFrame.setVisible(true);
		mainFrame.setPreferredSize(new Dimension(400,400));
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		mainFrame.pack();
		
	}
}