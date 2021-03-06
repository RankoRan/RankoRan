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
		System.out.println(fallSpeed(2.5));
		System.out.println(delta(1,10));
		System.out.println(delta(5,1));
		System.out.println(volumeToMass(FluidTable.WATER,1));
		System.out.println(volumeToMass(GasTable.AIR,1));
		System.out.println(volumeToMass(SolidTable.IRON,1));
		System.out.println(svtVelocity(10,5));
		System.out.println(svtDistance(10,5));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(power(1000,2));
		System.out.println(heat(SolidTable.IRON,1,2));
		System.out.println(heat(FluidTable.WATER,1,10));
		System.out.println(heat(GasTable.AIR,1,1));
		System.out.println(velocityToHeight(9.82));
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
	
	public static double fallSpeed(double height) {
		
		double fallSpeed = Math.sqrt((2*height) / g_swe) * g_swe;
		
		return fallSpeed;
	}
	
	public static double delta(double first, double last) {
		
		double delta = last - first;
		
		return delta;
	}
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		
		double volumeToMass = fluid.density * volume;
		
		return volumeToMass;
	}
	
	public static double volumeToMass(GasTable gas, double volume) {
		
		double volumeToMass = gas.density * volume;
		
		return volumeToMass;
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		
		double volumeToMass = solid.density * volume; 
		
		return volumeToMass;
		
	}
	
	public static double svtVelocity(double distance, double time) {
		
		double svtVelocity = distance/time;
		
		return svtVelocity;
	}
	
	public static double svtDistance(double velocity, double time) {
	
		double svtDistance = velocity*time;
		
		return svtDistance;
	}
	
	public static double svtTime(double distance, double velocity) {
	
		double svtTime = distance/velocity;
		
		return svtTime;
	}
	
	public static double work(double force, double distance) {
		
		double work = force*distance;
		
		return work;
	}
	
	public static double power(double work, double time) {
		
		double power = work/time;
		
		return power;
	}
	
	public static double heat(SolidTable solid, double mass, double deltaT) {
		
		double heat = solid.heatCapacity*mass*deltaT;
		
		return heat;
	}
	
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		
		double heat = fluid.heatCapacity*mass*deltaT;
		
		return heat;
	}
	
	public static double heat(GasTable gas, double mass, double deltaT) {
		
		double heat = gas.heatCapacity*mass*deltaT;
		
		return heat;
	}
	
	public static double velocityToHeight(double velocity) {
		
		double velocityToHeight = (Math.pow(Math.sin(1.570596),2)*Math.pow(velocity,2))/(2*g_swe);
		
		return velocityToHeight;
	}
	
}