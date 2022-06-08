package nextStep;

import java.awt.Color;
import java.awt.Graphics;

public class Square {
    int x = 0; 
    int y = 0;
    Color color;

    public Square(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void drawSquare(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, 75 ,75);
    }
}