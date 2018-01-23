/**
 * Name: Timothy Huff
 * Assignment #: Assignment02
 * Due Date: 1-23-18
 * Course / Section / Semester: IT2045C / 001 / Spring 2018
 * Citations: None
 * Description: This Program displays inheritance, by modeling the classification of shapes.
 * Anything Else Relevant: 
 * Last Worked on: 1-23-18
 */
package polygon;

/**
 * This class is a Subclass of Shapes, but is the Super class to Quadrilateral and Triangle. It models a Polygon, which is a shape, 
 * but is a broad classification of different kinds of shapes. It has Properties angleMeasure(int) for the sum of all angles in the 
 * polygon and numOfSides(int) to tell how many side the polygon has. 
 */

import shapes.Shapes;

public class Polygon extends Shapes {
	
	public Polygon(boolean area,int angle, int sides) throws Exception 
	{
		super(area);
		
		this.setAngleMeasure(angle);
		this.setNumOfSides(sides);
	}
	
	// angleMeasure Variable declaration and getter/setter methods
	private int angleMeasure;
	
	public int getAngleMeasure()
	{
		// start
		return angleMeasure;
		// end
	}

	public void setAngleMeasure(int angleMeasure)
	{
		// start
		this.angleMeasure = angleMeasure;
		// end
	}

	// numOfSides Variable declaration and getter/setter methods
	private int numOfSides;

	public int getNumOfSides()
	{
		// start
		return numOfSides;
		// end
	}

	public void setNumOfSides(int numOfSides)
	{
		// start
		this.numOfSides = numOfSides;
		// end
	}
	
}
