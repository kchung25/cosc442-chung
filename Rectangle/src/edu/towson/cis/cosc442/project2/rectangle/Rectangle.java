package edu.towson.cis.cosc442.project2.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The p2. */
	private Point p1, p2;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the p1
	 * @param p2 the p2
	 */
	public Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public double getArea() {
		return Math.abs((p2.getX() - p1.getX()) * (p2.getY() - p1.getY()));
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public double getDiagonal() {
		return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
	}
}
