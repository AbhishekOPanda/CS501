/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 4.3 <br />
 * Description: Geography: estimate areas <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import static javax.swing.JOptionPane.showMessageDialog;

public class C4E3EstimateAreas {
	public static void main(String[] args) {
		
		// Fixing Radius of earth to constant value
		final double RADIUS = 6371.01;
		
		// Program description 
		System.out.println("The following program uses the GPS location of four cities to compute the area enclosed by them.\n"
				+ "It finds the distance between the two cities using the great circle distance formula used in Exercise 4.2.\n"
				+ "Using the same distance we find the area of triangle using Exercise 2.19 formula. Then combines them to find the toal area.\n"
				+ "User doesn.t have to enter any data. The GPS location are already given.\n");
		// GPS location(latitude and longitude) of  Atlanta, Orlando,  Savannah and Charlotte. And converting the value to radians
		double atlanta_x = Math.toRadians(33.7489954), atlanta_y = Math.toRadians(-84.3879824);
		double orlando_x = Math.toRadians(28.5383355), orlando_y = Math.toRadians(-81.3792365);
		double savannah_x = Math.toRadians(32.0835407), savannah_y = Math.toRadians(-81.0998342);
		double charlotte_x = Math.toRadians(35.2270869), charlotte_y = Math.toRadians(-80.8431267);
		
		// Calculating the distance between two cities using Exercise 4.2 formula.
		double distance_a_o = RADIUS * Math.acos(Math.sin(atlanta_x) * Math.sin(orlando_x) + 
				Math.cos(atlanta_x) * Math.cos(orlando_x) * Math.cos(atlanta_y - orlando_y));
		double distance_o_s = RADIUS * Math.acos(Math.sin(orlando_x) * Math.sin(savannah_x) + 
				Math.cos(orlando_x) * Math.cos(savannah_x) * Math.cos(orlando_y - savannah_y));
		double distance_s_c = RADIUS * Math.acos(Math.sin(savannah_x) * Math.sin(charlotte_x) + 
				Math.cos(savannah_x) * Math.cos(charlotte_x) * Math.cos(savannah_y - charlotte_y));
		double distance_c_a = RADIUS * Math.acos(Math.sin(atlanta_x) * Math.sin(charlotte_x) + 
				Math.cos(atlanta_x) * Math.cos(charlotte_x) * Math.cos(charlotte_y - atlanta_y));
		double distance_a_s = RADIUS * Math.acos(Math.sin(atlanta_x) * Math.sin(savannah_x) + 
				Math.cos(atlanta_x) * Math.cos(savannah_x) * Math.cos(atlanta_y - savannah_y));
		
		// Printing the distance between cities
		System.out.println("The distance between the cities are:");
		System.out.printf("City 1\t\tCity 2\t\tDistance(km)\n"
				+ "Atlanta\t\tOrlando\t\t%f\n"
				+ "Orlando\t\tSavannah\t%f\n"
				+ "Savannah\tCharlotte\t%f\n"
				+ "Charlotte\tAtlanta\t\t%f\n"
				+ "Atlanta\t\tSavannah\t%f\n", distance_a_o, distance_o_s, distance_s_c, distance_c_a, distance_a_s);
		
		//Calculating the area enclosed by 4 cities by dividing into two triangles
		double s1 = (distance_a_o + distance_o_s + distance_a_s)/2;
		double triangle1 = Math.sqrt(s1 * (s1 - distance_a_o) * (s1 - distance_o_s) * (s1 - distance_a_s));
		double s2 = (distance_s_c + distance_c_a + distance_a_s)/2;
		double triangle2 = Math.sqrt(s2 * (s2 - distance_s_c) * (s2 - distance_c_a) * (s2 - distance_a_s));

		// Printing area enclosed by 2 triangles
		System.out.println("\nThe area enclosed by two triangles are:\n"
				+ "Triangle  Side 1   Side 2   Side3    Area\n"
				+ "           (km)     (km)     (km)   (sq km)");
        System.out.printf("1\t  %.2f   %.2f   %.2f   %.2f\n", distance_a_o, distance_o_s, distance_a_s, triangle1);
        System.out.printf("2\t  %.2f   %.2f   %.2f   %.2f\n", distance_s_c, distance_c_a, distance_a_s, triangle2);
        
		// Adding both the triangle area to find the area enclosed by cities
		double area = triangle1 + triangle2;
		
		showMessageDialog(null,"\nThe Area enclosed by four cities\n"
				+ "Atlanta -- (33.7489954, -84.3879824)\n"
				+ "Orlando -- (28.5383355, -81.3792365)\n"
				+ "Savannah -- (32.0835407, -81.0998342)\n"
				+ "Charlotte -- (35.2270869, -80.8431267)\n"
				+ "is: " + area + " Square Kilometer");
	}

}
