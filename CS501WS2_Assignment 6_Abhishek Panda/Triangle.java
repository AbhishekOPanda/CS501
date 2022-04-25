public class Triangle {
	private double side1;
	private double side2;
	private double side3;

	//Construct default Triangle object
	public Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	//Construct a triangle with specified side1, side2 and side3
	public Triangle(double side1, double side2, double side3) 
		throws IllegalTriangleException {
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) 
			throw new IllegalTriangleException(side1, side2, side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	//Return description for the triangle
	@Override
	public String toString() {
		return "Triangle: \nside1: " + side1 + "\nside2: " + side2 +	"\nside3: " + side3;
	}
}