package comkn.AssesmentQuestion1;

public class Rectangle extends Shape 
{
	int base;
	int height;
	public Rectangle(int base, int height) 
	{
		this.base=base;
		this.height=height;
	}
	public double calculateArea()
	{
		return base*height;
	}

}
