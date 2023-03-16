package swingConverter;

import javax.swing.JFormattedTextField;

public class Temperatura {

	static double convertir;
	static double datoTemperatura;
	
	
	static double tipoTemperatura(String deT, String paT, JFormattedTextField tfDatoTemperatura) {
		datoTemperatura = ((Number) tfDatoTemperatura.getValue()).doubleValue();
		switch (deT) {
		case "°F - Fahrenheit":
			switch (paT) {
			case "°F - Fahrenheit":
					convertir = datoTemperatura;
				break;
			case "°C - Celsius":
					convertir = (datoTemperatura - 32) * 5/9;
				break;
			case "K - Kelvin":
					convertir = ((datoTemperatura - 32) * 5/9) + 273.15;
				break;
			default:
				break;
			}			
			break;
		case "°C - Celsius":
			switch (paT) {
			case "°F - Fahrenheit":
					convertir = (datoTemperatura * 9/5) + 32;
				break;
			case "°C - Celsius":
					convertir = datoTemperatura;
				break;
			case "K - Kelvin":
					convertir = datoTemperatura + 273.15;
				break;
			default:
				break;
			}			
			break;
		case "K - Kelvin":
			switch (paT) {
			case "°F - Fahrenheit":
					convertir = ((datoTemperatura - 273.15) * 9/5) + 32;
				break;
			case "°C - Celsius":
					convertir = datoTemperatura - 273.15;
				break;
			case "K - Kelvin":
					convertir = datoTemperatura;
				break;
			default:
				break;
			}			
			break;

		default:
			break;
		}
		return convertir;
	}
	
}
