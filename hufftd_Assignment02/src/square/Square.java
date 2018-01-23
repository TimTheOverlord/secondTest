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
package square;

/**
 * This class models a Square which is a Shape, Polygon, and Quadrilateral. It has Properties isSidesEqual(boolean) to help
 * determine the difference between a Square and a Rectangle. If isSidesEqual is false, it will throw an exception declaring that
 * the object is not a square since side lengths are not equal.
 */

import quadrilateral.Quadrilateral;

public class Square extends Quadrilateral{

	public Square(boolean area, int angle, int sides, boolean convex, boolean sidesEqual) throws Exception
	{
		super(area, angle, sides, convex);
		
		this.setSidesEqual(sidesEqual);
		sidesNotEqual();
	}
	
	// sidesEqual Variable declaration and getter/setter methods
	private boolean sidesEqual;
		
	public boolean isSidesEqual()
	{
		// start
		return sidesEqual;
		// end
	}

	public void setSidesEqual(boolean sidesEqual)
	{
		// start
		this.sidesEqual = sidesEqual;
		// end
	}
	
	// Checks to make sure the sides are equal. If not, throws an exception
	public void sidesNotEqual() throws Exception
	{
		// start
		if(this.isSidesEqual() != true)
		{
			throw new Exception("This is not a square since the sides are not equal.");
		}
		// end
	}
	
	// Meant to override the default toString method. I was unable to make it as detailed as I wanted from the Base Class, so I moved it.
	public String toString()
	{
		// start
		String str;
		str = "" + this.hasArea() + " " + this.getAngleMeasure() + " " + this.getNumOfSides() + " " + this.isConvex() + " " + this.isSidesEqual() + "";
		return str;
		// end
	}
}
