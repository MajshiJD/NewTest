package TestStack;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class AddSquares {

    private int R = 0;
    private int G = 0;
    private int B = 0;
    private int xLoc = 0;
    private int yLoc = 0;

    
    private JButton addSquare = new JButton("Add Square");
    private RectsPanel panel = new RectsPanel();

    public AddSquares() {

        addSquare.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = new Color(R, G, B);
                panel.getSquares().add(new Square(xLoc, yLoc, color));
                panel.repaint();
              
                xLoc += 20;
                yLoc += 20;

            }
        });

        JFrame frame = new JFrame("Draw Squares");
        frame.add(panel, BorderLayout.CENTER);
        frame.add(addSquare, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


