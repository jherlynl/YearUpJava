/* 1. get the radius of the circle from the terminal
   2.compute the area of a circle with this radius
   3. print the area in the terminal
*/

public class circleRadius{
	public static void main(String[] args)
	{
	double area = 0.0;
	double radius = Double.parseDouble(args[0]);
	area = radius * radius * 3.14;
	System.out.println("What is the radius?");
	System.out.println("the area is " + area);

	}
}