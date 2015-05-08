

public class Circle {
	
	// Instance variable
	private String m_color;
	private double m_radius;
	
	// Main method
	public static void main(String[] args) {
	}

	public Circle(double radius) {
		m_radius = radius;
	}
	
	public Circle(double radius, String color) {
		m_radius = radius;
		m_color = color;
	}
	
	public double calculateArea() {
		double area = 3.14 * m_radius * m_radius;
		return area;
	}
	
	public void printColor() {
		System.out.println("my color is: " + m_color);
	}
}
