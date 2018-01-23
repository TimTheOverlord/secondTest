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
package shapes;

/**
 *  This Class is the Super Class. It models a generic shape, with properties hasArea(boolean).
 *  It checks to make sure any object created using the constructor is a shape by throwing an exception if hasArea is false.
 * @author Timothy Huff
 *
 */

public class Shapes {
	
	public Shapes( boolean area) throws Exception
	{
		this.setHasArea(area);
		isShape();
	}	
	
	// hasArea Variable declaration and getter/setter methods
	private boolean hasArea;
	
	public boolean hasArea()
	{
		// start
		return hasArea;
		// end
	}

	public void setHasArea(boolean hasArea)
	{
		// start
		this.hasArea = hasArea;
		// end
	}
	
	// Checks to make sure the declared object is actually a shape by determining whether or not the object has area.
	public void isShape() throws Exception
	{
		// start
		if(this.hasArea() != true)
		{
			throw new Exception("Object has no area, it is not a shape.");
		}
		// end
	}
	
}
