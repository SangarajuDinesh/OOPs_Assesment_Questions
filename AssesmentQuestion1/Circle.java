package comkn.AssesmentQuestion1;

public class Circle extends Shape {

	int radius;
	public Circle(int radius2)
	{
		radius=radius2;
	}
	public double calculateArea()
	{
		return Math.PI*(radius*radius);
	}

}
