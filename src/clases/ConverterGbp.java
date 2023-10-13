package clases;

import interfaces.ConversionEurGbp;

public class ConverterGbp implements ConversionEurGbp{

	   double tasaCambio = 0.0015;
	   public void convertirEur(int cantidad) {
	      
	   }

	   //Metodo para convertir a Libras esterlinas
	   public void convertirGbp(int cantidad) {
		  double res = cantidad*tasaCambio;
		  String sRes = res+""; 
	      System.out.println("El valor en Gbp es de: £"+ sRes);		
	   }
	}