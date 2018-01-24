/**
 * Name: Timothy Huff
 * Assignment #: Assignment02
 * Due Date: 1-23-18
 * Course / Section / Semester: IT2045C / 001 / Spring 2018
 * Citations: None
 * Description: This Program displays inheritance, by modeling the classification of shapes.
 * Anything Else Relevant: 
 * Last Worked on: 1-23-18 @ 7:01 p.m.
 */
package main;

/**
 *  This class declares and instantiates a Triangle, Square, and Rectangle object with parameters such that they will not throw an
 *  exception. Modifying the any of the parameters will result in an exception being thrown.
 */

import rectangle.Rectangle;
import square.Square;
import triangle.Triangle;

public class Main {

	public static void main(String[] args) {
		// declares and instantiates the objects.
		try
		{
			Square sq = new Square(true, 360, 4, true, true);
			System.out.println(sq.toString());
			
			Rectangle ra = new Rectangle(true, 360, 4, true,7, 4);
			System.out.println(ra.toString());
			
			Triangle tr = new Triangle(true, 180, 3, false);
			System.out.println(tr.toString());
			
		}
		catch(Exception ex)
		{
			System.out.println("An error has occured: " + ex.getLocalizedMessage());
		}
		
	}

}
