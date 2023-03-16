package swingConverter;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Moneda{
	
	static double divisa; 
	
	static double tipoCambioM(String deM, String paM){
		
		switch (deM) {
		
		case "GTQ - Quetzales":
			switch (paM) {
			case "GTQ - Quetzales":					
				divisa = 1;
				break;
			case "USD - Dolares":
				divisa = 0.13;
				break;
			case "EUR - Euro":
				divisa = 0.12;
				break;
			case "GBP - Libra Esterlina":
				divisa = 0.11;
				break;
			case "JPY - Yen Japones":
				divisa = 17.25;
				break;
			case "KRW - Won Surcoreano":
				divisa = 167.14;
				break;
			default:
				break;
			}			
			break;
			
			case "USD - Dolares":
			switch (paM) {
			case "GTQ - Quetzales":					
				divisa = 7.78;
				break;
			case "USD - Dolares":
				divisa = 1;
				break;
			case "EUR - Euro":
				divisa = 0.93;
				break;
			case "GBP - Libra Esterlina":
				divisa = 0.82;
				break;
			case "JPY - Yen Japones":
				divisa = 134.49;
				break;
			case "KRW - Won Surcoreano":
				divisa = 1302.36;
				break;
			default:
				break;
			}			
			break;
			
			case "EUR - Euro":
			switch (paM) {
			case "GTQ - Quetzales":					
				divisa = 8.36;
				break;
			case "USD - Dolares":
				divisa = 1.07;
				break;
			case "EUR - Euro":
				divisa = 1;
				break;
			case "GBP - Libra Esterlina":
				divisa = 0.88;
				break;
			case "JPY - Yen Japones":
				divisa = 144.49;
				break;
			case "KRW - Won Surcoreano":
				divisa = 1398.83;
				break;
			default:
				break;
			}			
			break;
			case "GBP - Libra Esterlina":
			switch (paM) {
			case "GTQ - Quetzales":					
				divisa = 9.46;
				break;
			case "USD - Dolares":
				divisa = 1.22;
				break;
			case "EUR - Euro":
				divisa = 1.13;
				break;
			case "GBP - Libra Esterlina":
				divisa = 1;
				break;
			case "JPY - Yen Japones":
				divisa = 163.61;
				break;
			case "KRW - Won Surcoreano":
				divisa = 1583.27;
				break;
			default:
				break;
			}			
			break;
			case "JPY - Yen Japones":
			switch (paM) {
			case "GTQ - Quetzales":					
				divisa = 0.058;
				break;
			case "USD - Dolares":
				divisa = 0.0074;
				break;
			case "EUR - Euro":
				divisa = 0.0069;
				break;
			case "GBP - Libra Esterlina":
				divisa = 0.0061;
				break;
			case "JPY - Yen Japones":
				divisa = 1;
				break;
			case "KRW - Won Surcoreano":
				divisa = 9.67;
				break;
			default:
				break;
			}			
			break;
			case "KRW - Won Surcoreano":
			switch (paM) {
			case "GTQ - Quetzales":					
				divisa = 0.0060;
				break;
			case "USD - Dolares":
				divisa = 0.00077;
				break;
			case "EUR - Euro":
				divisa = 0.00071;
				break;
			case "GBP - Libra Esterlina":
				divisa = 0.00063;
				break;
			case "JPY - Yen Japones":
				divisa = 0.10;
				break;
			case "KRW - Won Surcoreano":
				divisa = 1;
				break;
			default:
				break;
			}			
			break;
			
		default:
			break;
		}
		return divisa;
		
	}
}
