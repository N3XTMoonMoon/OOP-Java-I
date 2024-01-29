package temperaturConverter;

public class TemperaturConverter {

	public TemperaturConverter() {
		
	}
	
	public void convert(int temperature, char unit) {
		
		int result;
		
		switch(unit) {
			case('F'):
				result = convertCelsiusToFarenheit(temperature);
			
				System.out.println("Convertet "+temperature+" Celsius to "+result+" Fahrenheit");
				break;
			case('C'):
				result = convertFahrenheitToCelsius(temperature);
				
				System.out.println("Convertet "+temperature+" Fahrenheit to "+result+" Celsius");
				break;
			default:
				result=-999999999;
				
				System.out.println();
				break;
		}
		
	}
	
	private int convertCelsiusToFarenheit(int temperature) {
		return temperature*9/5+32;
	}
	
	private int convertFahrenheitToCelsius(int temperature) {
		return (temperature -32)*5/9;
	}
}
