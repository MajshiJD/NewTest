`package nextStep;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class PanelGlowny extends JPanel{
	private JPanel ramka = new JPanel();
	
	public PanelGlowny() {
		
		ramka.setPreferredSize(new Dimension(800,800));
		ramka.add(new GraphicPanel());
		ramka.setBackground(Color.BLACK);
		
		
	}

}
