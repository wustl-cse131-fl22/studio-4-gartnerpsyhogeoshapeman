package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		
		StdDraw.setPenColor(0,80,50);
		
		StdDraw.filledCircle(0.17,0.35,0.1);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.2,0.35,0.1);
		
		StdDraw.setPenColor(0,80,50);
		double[] tailX = {0.1,0.15,0.17};
		double[] tailY = {0.25,0.22,0.28};
		StdDraw.filledPolygon(tailX, tailY);
		
		StdDraw.filledCircle(0.3, 0.55, 0.25);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.15, 0.65, 0.25);
		
		StdDraw.setPenColor(0,80,50);
		StdDraw.filledCircle(0.6, 0.65, 0.18);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.58, 0.8, 0.18);
		StdDraw.filledCircle(0.45, 0.8, 0.15);
		
		StdDraw.setPenColor(0,80,50);
		StdDraw.filledRectangle(0.82, 0.68, 0.05, 0.02);
		StdDraw.filledRectangle(0.82, 0.62, 0.05, 0.02);
		
		StdDraw.setPenColor(184,0,255);
		StdDraw.filledCircle(0.82, 0.68, 0.01);
		
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledCircle(0.85,0.5,0.07);
		double[] bodyX = {0.82,0.87,0.73,0.7};
		double[] bodyY = {0.5,0.46,0.35,0.38};
		
		StdDraw.filledPolygon(bodyX,bodyY);
		
		StdDraw.setPenColor(0,255,255);
		StdDraw.filledCircle(0.83, 0.53, 0.01);
		StdDraw.filledCircle(0.87,0.5,0.01);
		
		
		
		
		
		
		
		
		StdDraw.setPenColor(120,20,30);
		StdDraw.filledRectangle(0.35, 0.65, 0.2, 0.12);
		
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(0.5, 0.9, 0.5, 0.1);
		StdDraw.filledRectangle(0.5, 0.1, 0.5, 0.1);
		
		
		
	}
}