package clases;

import interfaces.ConversionEurGbp;

public class ConverterEur implements ConversionEurGbp{
	   double tasaCambio = 0.0018;
	   
	   //Método para convertir a euros
	   public void convertirEur(int cantidad) {
		  double res = cantidad*tasaCambio;
	      String sRes = res+""; 
	      System.out.println("El valor en Eur es de: €"+ sRes);		
	   }

	   
	   public void convertirGbp(int cantidad) {
	      
	   }
	}