public class IllegalTriangleException extends Exception {
	private double side1;
	private double side2;
	private double side3;

	//Construct an IllegalTriangleException
	public IllegalTriangleException(double side1, double side2, double side3) {
		super("Below mentioned sides do not form a Triangle:\nside1: " + side1 + "\nside2: " + side2 +	"\nside3: " + side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

}