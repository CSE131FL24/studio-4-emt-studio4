package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color col = new Color(00, 00, 128); 
		StdDraw.setPenColor(col);
		StdDraw.filledRectangle(0.5, 0.5, 0.75, 0.25);
		Color pink= new Color(255,0,255);
		StdDraw.setPenColor(pink);
		StdDraw.filledCircle(0.5,0.5,0.2);
		Color lime= new Color(0,255,0);
		StdDraw.setPenColor(lime);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		Color teal = new Color (0,128,128);
		StdDraw.setPenColor(teal);
		StdDraw.filledCircle(0.45, 0.6, 0.03);
		StdDraw.filledCircle(0.55, 0.6, 0.03);
		Color white= new Color (255,255,255);
		StdDraw.setPenColor(white);
		StdDraw.setPenRadius(0.02);
		StdDraw.arc(0.5, 0.5, 0.1, 180, 360);
		
	}
}