package package1;

public class D20220930_arc_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A=0.7854;
		double pi=Math.PI;
		double circumference  = A*4;
		double radius=circumference /(2*pi);
		double area=radius*radius;
		System.out.println(pi+" "+radius+" "+area);

	}

}
/*
Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input. Return the result rounded to two decimals.

Graph

Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)

*/