package studio4;

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
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = 0;
		double parameterTwo = 0;
		double parameterThree = 0;
		double parameterFour = 0;
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double x3 = 0;
		double y3 = 0;
		
		
		if (shapeType.equals("triangle")) {
			x1 = in.nextDouble();
			y1 = in.nextDouble();
			x2 = in.nextDouble();
			y2 = in.nextDouble();
			x3 = in.nextDouble();
			y3 = in.nextDouble();
		} else {
			parameterOne = in.nextDouble();
			parameterTwo = in.nextDouble();
			parameterThree = in.nextDouble();
			parameterFour = in.nextDouble();
		}
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		if (shapeType.equals("ellipse")) {
			StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			if (isFilled)
			{
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		
		if (shapeType.equals("rectangle")) {
			StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			if (isFilled)
			{
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		
		if (shapeType.equals("triangle")) {
			double[] xs = {x1, x2, x3};
			double[] ys = {y1, y2, y3};
			StdDraw.polygon(xs, ys);
			if (isFilled)
			{
				StdDraw.filledPolygon(xs, ys);
			}
		}
		
		
		
		
		
		
		
		
	}
}
