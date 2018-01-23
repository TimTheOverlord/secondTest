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
package rectangle;

/**
 * This class models a rectangle which is a Shape, Polygon, and Quadrilateral. It has Properties sideLength(int) and sideWidth(int)
 * to define the rectangle's length and width. This class does not throw an exception, or have checking capabilities since the super
 * classes have them and since a Rectangle can be a square, with the length and width equal. Alternatively, a square must have all sides equal.
 */

import quadrilateral.Quadrilateral;

public class Rectangle extends Quadrilateral{

	public Rectangle(boolean area, int angle, int sides, boolean convex, int sideLength, int SideWidth) throws Exception
	{
		super(area, angle, sides, convex);
		
		this.setSideLength(sideLength);
		this.setSideWidth(SideWidth);
	}
	
	// sideLength Variable declaration and getter/setter methods
	private int sideLength;
	
	public int getSideLength()
	{
		// start
		return sideLength;
		// end
	}

	public void setSideLength(int sideLength)
	{
		// start
		this.sideLength = sideLength;
		//end
	}
	
	// sideWidth Variable declaration and getter/setter methods
	private int sideWidth;
	
	public int getSideWidth()
	{
		// start
		return sideWidth;
		//end
	}

	public void setSideWidth(int sideWidth)
	{
		// start
		this.sideWidth = sideWidth;
		// end
	}
	
	// Meant to override the default toString method. I was unable to make it as detailed as I wanted from the Base Class, so I moved it.
	public String toString()
	{
		// start
		String str;
		str = "" + this.hasArea() + " " + this.getAngleMeasure() + " " + this.getNumOfSides() + " " + this.isConvex() + " " +this.getSideLength() + " " +this.getSideWidth() + "";
		return str;
		// end
	}
	
}
