package _05_Pixel_Art;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class GridPanel extends JPanel{

    private static final long serialVersionUID = 1L;
    private int windowWidth;
    private int windowHeight;
    private int pixelWidth;
    private int pixelHeight;
    private int rows;
    private int cols;
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    int[][]pixels;// 1. Create a 2D array of pixels. Do not initialize it yet.

    private Color color;

    public GridPanel(int w, int h, int r, int c) {
    	 Random random = new Random();
        this.windowWidth = w;
        this.windowHeight = h;
        this.rows = r;
        this.cols = c;

        this.pixelWidth = windowWidth / cols;
        this.pixelHeight = windowHeight / rows;

        color = Color.BLACK;

        setPreferredSize(new Dimension(windowWidth, windowHeight));

       pixels= new int[r][c]; // 2. Initialize the pixel array using the rows and cols variables.


       for(int row=0; row<pixels.length;row++) {
    	   
    	   for(int col =0; col<pixels[row].length;col++){
    		   pixels[row][col]=pixels[random.nextInt(pixelHeight)][random.nextInt(pixelWidth)];
    		   // 3. Iterate through the array and initialize each element to a new pixel.
    	   }
       }


    }

    public void setColor(Color c) {
        color = c;
    }

    public void clickPixel(int mouseX, int mouseY) {
        // 5. Use the mouseX and mouseY variables to change the color
        //    of the pixel that was clicked. *HINT* Use the pixel's dimensions.
    	Random r = new Random();
    	
    	for(int row=0;row<pixels.length;row++ ) {
    		for(int col=0; col<pixels[row].length;col++) {
    			Graphics g;setColor(Color.GREEN);
    			 Graphics g1;drawRect(mouseX, mouseY, 1, 1);
    			 
    		}
    	}
    }

 

	private void drawRect(int mouseX, int mouseY, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@Override
    public void paintComponent(Graphics g) {
        // 4. Iterate through the array.
        //    For every pixel in the list, fill in a rectangle using the pixel's color.
        //    Then, use drawRect to add a grid pattern to your display.
for(int row =0;row<pixels.length;row++) {
	
	for(int col = 0; col<pixels[row].length;col++) {
	g.setColor(Color.BLACK);
	g.drawRect(col, row, 1, 1);
	}
}
    }
}
