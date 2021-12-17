package circleAssignment;

public class TestCircle {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(5);
		
		System.out.println("Circle 1 Details:");
		
//		circle1.radius = 5;
		circle1.diameterOfCircle(5);
		circle1.areaOfCircle(5);
		circle1.circumferenceOfCircle(5);
		
		Circle circle2 = new Circle(12);
		
		System.out.println("Circle2 Details:");
		
//		circle2.radius = 12;
		circle2.diameterOfCircle(circle2.radius);
		circle2.areaOfCircle(circle2.radius);
		circle2.circumferenceOfCircle(circle2.radius);
		
		
	}

}
