/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 9.1 <br />
 * Description: Welcome <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

public class Rectangle {

	    private double width = 1.0;
	    private double height = 1.0;
	    private String error = "";
	    
	    public Rectangle() {}

	    public Rectangle(double width, double height) throws Exception {
	    	if(width > 0 && height > 0){
	    		setWidth(width);
	    		setHeight(height);
	    	}
	    	else {
	    		setWidth(0);
	    		setHeight(0);
	       	}
	    }

	    // Returns area of rectangle
	    public double getArea() {
	        return getWidth() * getHeight();
	    }
	    
	    // Returns perimeter  of rectangle
	    public double getPerimeter() {
	        return getWidth() * 2 + getHeight() * 2;
	    }	

	    //Getter for error message
		public String getError() { 
			return error; 
		}
		
		//Getter for Width
		public double getWidth() {
			return width;
		}
		
		//Setter for Width
		public void setWidth(double width) throws Exception {
			if(!isValidWidth(width))
				throw new Exception(error);
			this.width = width;
		}
		
		//Getter for height
		public double getHeight() {
			return height;
		}

		//Setter for height
		public void setHeight(double height) throws Exception {
			if(!isValidHeight(height))
				throw new Exception(error);
			this.height = height;
		}
		
		//Checking for valid Width
		public boolean isValidWidth(double width)
		{
			if(width > 0) return true;
			else
			{
				error = "Width length must be greater than 0";
				return false;
			}
		}
		
		//Checking for valid Height
		public boolean isValidHeight(double height)
		{
			if(height > 0) return true;
			else
			{
				error = "Height length must be greater than 0";
				return false;
			}
		}
}