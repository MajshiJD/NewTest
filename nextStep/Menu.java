package nextStep;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import TestStack.Square;

public class Menu extends JMenuBar{
	private JMenuBar pasekMenu = new JMenuBar();
	
	JMenu optionsMenu1 = new JMenu("Harambe");
	JMenu optionsMenu2 = new JMenu("Kaligula");
	JMenuItem pasek1opcja1 = new JMenuItem("Goryl");
	
	
	
	public Menu() {
		
		
		
		this.add(optionsMenu1);
		this.add(optionsMenu2);
		
		
		
	}

	
	
	
	
	
	public JMenuBar getPasekMenu() {
		return pasekMenu;
	}
	public void setPasekMenu(JMenuBar pasekMenu) {
		this.pasekMenu = pasekMenu;
	}


	public JMenu getOptionsMenu1() {
		return optionsMenu1;
	}






	public void setOptionsMenu1(JMenu optionsMenu1) {
		this.optionsMenu1 = optionsMenu1;
	}






	public JMenu getOptionsMenu2() {
		return optionsMenu2;
	}






	public void setOptionsMenu2(JMenu optionsMenu2) {
		this.optionsMenu2 = optionsMenu2;
	}






	public JMenuItem getPasek1opcja1() {
		return pasek1opcja1;
	}






	public void setPasek1opcja1(JMenuItem pasek1opcja1) {
		this.pasek1opcja1 = pasek1opcja1;
	}
	
	 
	
}
