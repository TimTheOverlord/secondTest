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
package triangle;

/**
 * This class models a Triangle which is a shape and a polygon with 3 sides and an angle sum of 180 degrees. It has
 * Properties isAngleBased(boolean), which was intended to be infrastructure to allow further Triangle Classification between 
 * side based classifications and angle based classifications. If the angle sum isn't 180 degrees or the number of sides isn't 3
 * it will throw an exception declaring that the object isn't a Triangle.
 */

import polygon.Polygon;

public class Triangle extends Polygon{

	public Triangle(boolean area, int angle, int sides, boolean angleBased) throws Exception
	{
		super(area, angle, sides);
		 this.setAngleBased(angleBased);
		 isTriangle();
	}
	
	// isAngleBased Variable declaration and getter/setter methods
	private boolean isAngleBased;
	
	public boolean isAngleBased()
	{
		// start
		return isAngleBased;
		// end
	}

	public void setAngleBased(boolean isAngleBased)
	{
		// start
		this.isAngleBased = isAngleBased;
		// end
	}
	
	// Checks to make sure any object created using this class is a triangle by checking the number of sides and angle measure.
	public void isTriangle() throws Exception
	{
		// start
		if(this.getAngleMeasure() != 180 || this.getNumOfSides() != 3)
		{
			throw new Exception("This shape is not a Triangle as it either doesn't have 3 sides or doesn't have an angle sum of 180 degrees.");
		}
		// end
	}
	
	// Meant to override the default toString method. I was unable to make it as detailed as I wanted from the Base Class, so I moved it.
	public String toString()
	{
		// start
		String str;
		str = "" + this.hasArea() + " " + this.getAngleMeasure() + " " + this.getNumOfSides() + " " + this.isAngleBased() + " ";
		return str;
		// end
	}
	
}
