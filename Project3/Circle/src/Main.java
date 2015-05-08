
public class Main {

	public static void main(String[] args) {
		// Make big circle object
		Circle bigCircle = new Circle(10); 
		// Make smallCircle object
		Circle smallCircle = new Circle(5, "red");
	
		System.out.println("The area of bigCircle is: " + bigCircle.calculateArea());
		
		System.out.println("The area of smallCircle is: " + smallCircle.calculateArea());
		
		// Call PrintColor for each circle
		bigCircle.printColor();
		smallCircle.printColor();
	}
	
	
}
