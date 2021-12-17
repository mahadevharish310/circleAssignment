package circleAssignment;

public class Circle {

	float radius;
	
	static final double pi = 3.1415;
	
	//default constructor
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	
	//parameterized constructor
	public Circle(float radius) {
		super();
		this.radius = radius;
	}


	//r*2
	public void diameterOfCircle(float radius) {
		float diameter = radius * 2;
		System.out.println("Diameter of Circle: "+diameter);
	}
	
	//pi*r^2
	public void areaOfCircle(float radius) {
		double area = pi*radius*radius;
		System.out.println("Area of Circle: "+area);
	}
	
	//2*pi*r
	public void circumferenceOfCircle(float radius) {
		double circumference =  2*pi*radius;
		System.out.println("Circumference of Circle: "+circumference);
	}
}
