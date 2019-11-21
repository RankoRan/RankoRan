import java.util.Scanner;

public class Uppgift {

	static double g_swe = 9.82; 
	static double G = 6.67408*Math.pow(10, -11);
	static double R = 8.3144621;
	static double p_0 = 1000;
	static double c = 299792458;
	
	public static void main(String[] args) {
		
		System.out.println(kelvinToCelsius(0));

}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = ((fahrenheit - 32)*5)/9;
		
		return celsius;
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
				
		return celsius;
	}
	
	public static double fluidPressure(Fluidtable fluid, double deep) {
		
		double Pressure = 0;
		Pressure = fluid.density*g_swe*deep;
		
		return Pressure;
		
	}
	
}