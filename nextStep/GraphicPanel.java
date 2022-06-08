package nextStep;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;



public class GraphicPanel extends JPanel {
	 ArrayList<Square> squares = new ArrayList<>();
	 @Override
     protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.drawRect(0, 0, 100, 100);
         for (Square square : squares) {
             square.drawSquare(g);
         }
     }

     @Override
     public Dimension getPreferredSize() {
         return new Dimension(250, 250);
     }
     public GraphicPanel() {
    	 this.setPreferredSize(getPreferredSize());
    	 this.setBackground(Color.BLUE);
     }

	public List<Square> getSquares() {
		return squares;
	}

	public void setSquares(ArrayList<Square> squares) {
		this.squares = squares;
	}
     
}