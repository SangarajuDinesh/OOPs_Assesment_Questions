package comkn.AssesmentQuestion1;

public class Triangle extends Shape 
{
	int length;
	int width;
	public Triangle(int length, int width)
	{
		this.length=length;
		this.width=width;
	}
	public double calculateArea() 
	{
		return (0.5*length*width);
	}

}
