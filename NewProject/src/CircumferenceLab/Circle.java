package CircumferenceLab;

import java.lang.*;
import java.text.NumberFormat;


public class Circle {
	double radius;
	int count;
	
	public Circle (double r) {
		radius = r;
		count = 0;
	}
	
	public double getCircumference(){
		return 2 * (Math.PI * radius);
	}
	
	public String getformattedCircumference() {
		return formatNumber(getCircumference());
	}

	public double getArea(){
		return (Math.PI * radius * radius)
	}
	public String getformattedArea() {
		
	}
	private String formatNumber(double x){
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String formattedNumber = number.format(x);
		return formattedNumber;
	}
	
	public static int getObjectCount(){
	
		String
	
}
}