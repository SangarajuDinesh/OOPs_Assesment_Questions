package comkn.AssesmentQuestion1;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		switch(name)
		{
		case "Rectangle":
			int base=sc.nextInt();
			int height=sc.nextInt();
			Rectangle r=new Rectangle(base,height); 
			System.out.print(r.calculateArea());
			break;
		case "Circle":
			int radius=sc.nextInt();
			Circle c=new Circle(radius);
			System.out.print(c.calculateArea());
			break;
		case "Triangle":
			int length=sc.nextInt();
			int width=sc.nextInt();
			Triangle tr=new Triangle(length,width);
			System.out.print(tr.calculateArea());
			break;
			
		}
		sc.close();
	}
}
