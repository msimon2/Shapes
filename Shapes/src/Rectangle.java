
public class Rectangle extends Quadrilateral
	{
		protected double length;
		protected double width;
	public Rectangle(double l, double w)
		{
		length = l;
		width = w;
		}
	public double findArea()
		{
		return length*width;	
		}
	}
