package pr1;
import java.util.*;
abstract class shapes {
	int x,y;
	public abstract void printArea();
}
class Rectangle extends shapes{ 
	
	public void printArea() {
		int area=x*y;
		System.out.println("THe area of rectangle"+ area);
	}
}
class Triangle extends shapes{ 
	float area2=(x*y)/2  ;
		public void printArea() {
		System.out.println("THe area of triangle"+ area2);
	}
}
class Circle extends shapes{ 
	int area=(22*x*x)/7;
	public void printArea() {
		System.out.println("THe area of circle"+ area);
	}
}

public class Myshapes{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y values");
		int x1,y1;
		x1=sc.nextInt();
		y1=sc.nextInt();
		Rectangle r=new Rectangle();
		r.x=x1;
		r.y=y1;
		r.printArea();
		Triangle t=new Triangle();
		t.x=x1;
		t.y=y1;
		t.printArea();
		Circle c=new Circle();
		c.x=x1;
		c.printArea();
		
		
	}

}
