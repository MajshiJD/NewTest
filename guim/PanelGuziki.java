package guim;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelGuziki extends JPanel{
	
	//JPanel glowny = new JPanel(); 
	JButton guzik = new JButton();
	int r;
	int g;
	int b;
	
	public PanelGuziki() {
		
		
	}
	public JPanel makePanel() {
		JPanel zwrot = new JPanel();
		zwrot.setBackground(Color.GREEN);
		zwrot.setSize(new Dimension(300,300));
		zwrot.add(new JLabel("IDK"));
		
		guzik.setBounds(50,50,50,50);
		guzik.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				zwrot.setBackground(new Color(r,g,b));
				r+=50;
				b+=50;
				g+=50;
				
			}
		}
		);
		zwrot.add(guzik);
		return zwrot;
		
	}
	
	
}
