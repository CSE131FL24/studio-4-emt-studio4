package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next(); //finds what shape it is
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		Color col = new Color(red, green, blue); 
		
		StdDraw.setPenColor(col);
		if (in.nextBoolean() == true) {
			if (shape .equals("ellipse")) { //draws a filled ellipse
				StdDraw.filledEllipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else if (shape .equals("rectangle")) { //draws a filled rectangle
				StdDraw.filledRectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else if (shape .equals("triangle")) { //draws a filled triangle
				double[] x = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
				double[] y = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
				StdDraw.filledPolygon(x, y);
			}
		}
		
		else {
			if (shape .equals("ellipse")) { //draws a filled ellipse
				StdDraw.ellipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else if (shape .equals("rectangle")) { //draws a filled rectangle
				StdDraw.rectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else if (shape .equals("triangle")) { //draws a filled triangle
				double[] x = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
				double[] y = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
				StdDraw.polygon(x, y);
			}
		}
	}
}
