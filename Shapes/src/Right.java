
public class Right extends Triangle
	{
	protected double base;
	protected double height;
	
	public Right(double b, double h)
		{
		base = b;
		height = h;
		}	
	
	public double findPerimeter()
		{
		return base + height + (Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2)));
		}
	}
