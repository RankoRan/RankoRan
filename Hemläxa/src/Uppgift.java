import java.util.Scanner;

public class Uppgift {

	static double g_swe = 9.82; 
	static double G = 6.67408*Math.pow(10, -11);
	static double R = 8.3144621;
	static double p_0 = 1000;
	static double c = 299792458;
	
	public static void main(String[] args) {
		
		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));

}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = ((fahrenheit - 32)*5)/9;
		
		return celsius;
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
				
		return celsius;
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double Pressure = 0;
		Pressure = fluid.density*g_swe*deep;
		
		return Pressure;
		
	}
	
	public static double pressureUnderWater(double deep) {
		
		double WaterPressure = FluidTable.WATER.density*g_swe*deep;
		
		return WaterPressure;
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = 0.5 * mass * (Math.pow(velocity, 2));
		
		return kineticEnergy;
	}
	
	public static double potentialEnergy(double mass, double height) {
		
		double potentialEnergy = mass * g_swe * height;
		
		return potentialEnergy;
	}
	
}