import java.util.ArrayList;

public class Country implements StatsComputeable {
	private String countryName;
	double[] provinceAreas = new double[100];
	ArrayList<Double> statesAreas = new ArrayList<>();
	private double countryArea;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public double getCountryArea() {
		return countryArea;
	}
	public void setCountryArea(double countryArea) {
		if(countryArea == 0) {
			throw new ArithmeticException("Invalid Country Area Value");
		}
		this.countryArea = countryArea;
	}
	
	public Country(String countryName, int countryArea) {
		setCountryName(countryName);
		setCountryArea(countryArea);
		setArea();
	}
	
	public void setArea() {
		for(int i = 0; i < provinceAreas.length; i++) {
			provinceAreas[i] = ((getCountryArea()/2)/provinceAreas.length);
		}
		
		for(int j = 0; j < provinceAreas.length; j++) {
			statesAreas.add(j, ((getCountryArea()/2)/provinceAreas.length));
		}
	}
	
	public Country() {
		this(null, 0);
	}
	
	@Override
	public void computeStats() {
		double totalProvinceArea = 0;
		double totalStatesArea = 0;
		double totalArea = 0;
		
		for(double provinceArea: provinceAreas ) {
			totalProvinceArea += provinceArea;
		}
		
		for(double stateArea: statesAreas ) {
			totalStatesArea += stateArea;
		}
		
		totalArea = totalStatesArea + totalProvinceArea;
		setCountryArea(totalArea);
	}
	
	@Override
	public void reset() {
		setCountryArea(0);
	}
	
	public String toString() {
		return ("Country Name: " + getCountryName() + "\nArea: " + getCountryArea() + this.UNITS);
	}
}
