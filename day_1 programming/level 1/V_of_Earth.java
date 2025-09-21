package Bridgelbz;
public class V_of_Earth{
	public static void main(String[] args) {
		int radius=6378;
		double r=Math.pow(radius, 3);
		double volume_in_km=4/3 * Math.PI * r;
		double volume_in_miles=volume_in_km*0.6;
		System.out.println("The volume of earth cubic kilometers is "+volume_in_km+" and cubic miles is "+volume_in_miles);
	}
}