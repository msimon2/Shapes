
public class Quadrilateral extends Shape
	{
	protected double length;
	protected double width;
	
	public Quadrilateral(double l, double w)
		{
		length = l;
		width = w;
		}
	
	public double findArea()
		{
		return length * width;
		}
	public double findPerimeter()
		{
		return (length*2) + (width*2);
		}
	}
