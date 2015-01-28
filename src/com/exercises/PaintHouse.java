package com.exercises;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PaintHouse {

	private static final float[][] COORDS = new float[][] {
		{ 10f, 9.7f },
		{ 11.6f, 7f },
		{ 12.5f, 6f },
		{ 12.5f, 14.5f },
		{ 13.13f, 9.15f },
		{ 13.5f, 6.9f },
		{ 15f, 6f },
		{ 15.02f, 4.83f },
		{ 15.11f, 7.01f },
		{ 16.33f, 14.03f },
		{ 16.4f, 5.4f },
		{ 17.5f, 3f },
		{ 17.51f, 4.01f },
		{ 17.5f, 13.5f },
		{ 17.60f, 8.50f },
		{ 17.72f, 9.12f },
		{ 18.6f, 3.9f },
		{ 18.6f, 6f },
		{ 19.693f, 13.4f },
		{ 20f, 6f },
		{ 21f, 7.5f },
		{ 21f, 13.5f },
		{ 21.3f, 5.5f },
		{ 21.45f, 9.7f },
		{ 22f, 14f },
		{ 22.5f, 8.5f },
		{ 23f, 7.5f },
		{ 23.001f, 11.01f },
	};
	
	private static final float STEP = 200 / 2.5f;
	
	public static void main(String[] args) {
		
		// No point in reading the coords from the console since I wouldn't manually type it.
		
		File f = new File("house.html");
		PrintWriter output = null;
		try {
			output = new PrintWriter(f);
			// start drawing
			draw(output);

			output.flush();
		} catch (IOException ex) {

		} finally {
			if (output != null) {
				output.close();
			}
		}

	}

	private static final String TEMPlATE_START =
			"'<svg width='1400px' height='1400px' xmlns='http://www.w3.org/2000/svg'> "
			+ "<defs>"
			+ "<pattern id='grid' width='200' height='200' patternUnits='userSpaceOnUse'>"
			+ " <rect width='200' height='200' fill='rgba(255, 255, 255, 0)'/>"
			+ " <path d='M 200 0 L 0 0 0 200' fill='none' stroke='gray' stroke-width='1'/>"
			+ "</pattern>"
			+ "</defs>"
			+ "<rect width='1400' height='1400' x='0' y='0' fill='url(#grid)' />"
			+ "<rect width='400' height='400' fill='rgba(120, 120, 120, 0.5)' x='400' y='600' stroke='blue' stroke-width='1' />"
			+ "<rect width='200' height='400' fill='rgba(120, 120, 120, 0.5)' x='1000' y='600' stroke='blue' stroke-width='1' />"
			+ "<polygon points='800,200 1200,600 400,600' fill='rgba(120, 120, 120, 0.5)' x='400' y='400' stroke='blue' stroke-width='1' />"
			+ "<text x='180' y='100' style='fill: #000000; stroke: none; font-size: 48px;'>10</text>"
			+ "<text x='380' y='100' style='fill: #000000; stroke: none; font-size: 48px;'>12.5</text>"
			+ "<text x='580' y='100' style='fill: #000000; stroke: none; font-size: 48px;'>15</text>"
			+ "<text x='780' y='100' style='fill: #000000; stroke: none; font-size: 48px;'>17.5</text>"
			+ "<text x='975' y='100' style='fill: #000000; stroke: none; font-size: 48px;'>20</text>"
			+ "<text x='1150' y='100' style='fill: #000000; stroke: none; font-size: 48px;'>22.5</text>"
			+ "<text x='100' y='215' style='fill: #000000; stroke: none; font-size: 48px;'>3.5</text>"
			+ "<text x='100' y='415' style='fill: #000000; stroke: none; font-size: 48px;'>6</text>"
			+ "<text x='100' y='615' style='fill: #000000; stroke: none; font-size: 48px;'>8.5</text>"
			+ "<text x='100' y='815' style='fill: #000000; stroke: none; font-size: 48px;'>11</text>"
			+ "<text x='100' y='1015' style='fill: #000000; stroke: none; font-size: 48px;'>13.5</text>"
			+ "<text x='100' y='1215' style='fill: #000000; stroke: none; font-size: 48px;'>16</text>";
	
	private static String getDarkDot(float inputX, float inputY) {
		int x = Math.round(inputX);
		int y = Math.round(inputY);
		return "<circle cx='" + x + "' cy='" + y + "' r='10' fill='black' />";
	}
	
	private static String getLightDot(float inputX, float inputY) {
		int x = Math.round(inputX);
		int y = Math.round(inputY);
		return "<circle cx='" + x + "' cy='" + y + "' r='10' fill='gray' stroke='black' stroke-width='1' />";
	}
	
	private static final String TEMPLATE_END = "</svg>'";
	
	private static final boolean isInHouse(float x, float y) {
		return true;
	}
	
	private static void draw(PrintWriter writer) {
		
		writer.append("<!DOCTYPE html>\n");
		writer.append("<html>\n");
		writer.append("<head>\n");
		writer.append("<body>\n");
		writer.append("<div style='zoom: 0.5'>\n");
		writer.append(TEMPlATE_START);
		
		for(float[] coord : COORDS) {
			float x = coord[0] * STEP - 7.5f * STEP;
			float y = coord[1] * STEP - 1 * STEP;
			if (isInHouse(x, y))
				writer.append(getDarkDot(x, y));	
			else
				writer.append(getLightDot(x, y));	
		}
		
		writer.append(TEMPLATE_END);
		writer.append("</div>\n");
		writer.append("</body>\n");
		writer.append("</html>\n");
	}
}