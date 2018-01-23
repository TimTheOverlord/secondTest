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
package quadrilateral;

/**
 * This Class is meant to model a Quadrilateral, a shape and polygon with 4 sides and an angle sum for 360 degrees. It has Properties
 * isConvex(boolean) to determine if the quadrilateral is convex or not. If the shape is not convex, it will throw an exception since
 * no non-convex quadrialterals were modeled in this program. If the number of sides isn't 4 or the angle measure isn't 360 degrees
 * it will throw an exception declaring any object at fault to not be a quadtrilateral.
 */

import polygon.Polygon;

public class Quadrilateral extends Polygon {

	public Quadrilateral(boolean area, int angle, int sides, boolean convex) throws Exception
	{
		super(area, angle, sides);
		
		this.setConvex(convex);
		notConvex();
		numOfSides();
	}
	
	// isConvex Variable declaration and getter/setter methods
	private boolean isConvex;

	public boolean isConvex()
	{
		// start
		return isConvex;
		// end
	}

	public void setConvex(boolean isConvex) 
	{
		// start
		this.isConvex = isConvex;
		// end
	}

	// Checks to make sure the shape has 4 sides and the angles add up to 360. If not, throws an exception
	public void numOfSides() throws Exception
	{
		// start
		if((this.getNumOfSides() != 4) || (this.getAngleMeasure() != 360))
		{
			throw new Exception("This shape is not a Quadrilateral, its angles either don't add to 360 degrees or it doesn't have 4 sides.");
		}
		// end
	}
	
	// Checks to make sure the Shape is a convex. If not, throws an exception
	public void notConvex() throws Exception
	{
		// start
		if(this.isConvex() != true)
		{
			throw new Exception("The shape is not convex, there are no corresponding shapes.");
		}
		// end
	}
}
