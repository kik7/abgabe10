package at.fhj.itm.petrovak15;
import java.awt.Point;

public class Point2d {
	
	private boolean debug;
	private double x;
	private double y;

	/**
	 * 
	 * @param px
	 * @param py
	 */
	public Point2d (double px, double py)
	{ 
		this.x=px;
		this.y=py;
	}

	/**
	 * creates 2 points with the value of 0s
	 */
	public Point2d () 
	{		
		// just create a point of 0/0
	
		x = 0;
		y = 0;
 	}

	/**
	 * making a clone of another point
	 * @param pt
	 */
	public Point2d (Point2d pt) 
	{	
		x = pt.x;
		y = pt.y;
	}

	/**
	 * printing messages if the "debug" is true
	 * @param s - message to be printed
	 */
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	/**
	 * setting the value of debug on true
	 * @param b
	 */
	public void setDebug (boolean b) {
		debug = b;
	}

	/**
	 * setter x
	 * prints a message if debug is true
	 * @param px
	 */
	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		x = px;
	}

	/**
	 * getter x
	 * @return
	 */
	public double getX() {
		return x;
	}

	/**
	 * setter y
	 * prints a message if debug is true
	 */
	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		y = py;
	}

	/**
	 * getter y
	 * @return
	 */
	public double getY() {
		return y;
	}

	/**
	 * setter x & y 
	 * setting them at the same time
	 * @param px
	 * @param py
	 */
	public void setXY(double px, double py) {
		x = px;
		y = py;
	}

	/**
	 * calculating the distance from the points
	 * @param pt
	 * @return
	 */
	public double distanceFrom (Point2d pt) {
		double a = Math.abs(pt.x - this.x) ;
		double b = Math.abs(pt.y - this.y);
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) ;
	}

	/**
	 * calculating the points to origin
	 * @return
	 */
	public double distanceFromOrigin () {
		double a = Math.abs(this.x) ;
		double b = Math.abs(this.y);
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	/**
	 * 
	 */
	public String toString() {
		return "x= " + x + " y = " + y;
	}

}
