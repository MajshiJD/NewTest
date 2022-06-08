package TestStack;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;



public class RectsPanel extends JPanel {
	 List<Square> squares = new ArrayList<>();
	 @Override
     protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         for (Square square : squares) {
             square.drawSquare(g);
         }
     }

     @Override
     public Dimension getPreferredSize() {
         return new Dimension(250, 250);
     }
     public RectsPanel() {
    	 this.setPreferredSize(getPreferredSize());
    	 
     }

	public List<Square> getSquares() {
		return squares;
	}

	public void setSquares(List<Square> squares) {
		this.squares = squares;
	}
     
}
