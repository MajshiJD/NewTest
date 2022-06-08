package guim;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Menu extends JMenuBar{
	
	private JMenuBar pasekMenu = new JMenuBar();
	
	private JMenu optionsMenu1 = new JMenu("1");
	private JMenu optionsMenu2 = new JMenu("2");
	private JMenuItem pasek1opcja1 = new JMenuItem("1.1");
	
	int a = 0;

	public Menu() {

	}



	public JMenuBar makeMenu() {
		
		JMenuBar zwrot = new JMenuBar();
		zwrot.add(this.getOptionsMenu1());
		this.getPasek1opcja1().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("JD");
				
			}
		});
		this.getOptionsMenu1().add(this.getPasek1opcja1());
		zwrot.add(this.getOptionsMenu2());
		
		return zwrot;
		
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