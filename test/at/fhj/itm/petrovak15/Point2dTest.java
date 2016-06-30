package at.fhj.itm.petrovak15;


import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import at.fhj.itm.petrovak15.Point2d;

public class Point2dTest {
	

	
	/**
	 * Set some Point2d for testing their functionality
	 */
	
	private Point2d pt = new Point2d();
	private Point2d pta = new Point2d();


	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		pt.setX(1.0);
		
		assertEquals(1.0, pt.getX(), 0.001);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		
		pt.setY(1.0);
		
		assertEquals(1.0, pt.getY(), 0.001);
		
	}
	

	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		
		Point2d ptc = new Point2d(1.0, 1.0);
		
		Point2d pta = new Point2d(2.0, 3.0);
		
		double distan = ptc.distanceFrom(pta);
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){	
		Point2d ptd = new Point2d(1.0,1.0);
				
		double distan = Math.sqrt(Math.pow(1.0, 1.0) + Math.pow(1.0, 3.0));
		assertEquals(1.414, distan, 0.001);
		
	}
}
