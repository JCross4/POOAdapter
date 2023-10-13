package clases;

import interfaces.ConversionUsd;

public class ConverterCRCUSD implements ConversionUsd {
	   MonedaAdapter monedaAdapter; 
	   double tasaCambio = 0.0019;

	   public void convertir(String moneda, int cantidad) {		

	      //ConverterCRCUSD solo es capaz de convertir a dolares
	      if(moneda.equals("Usd")){
	    	 double res = cantidad*tasaCambio;
	    	 String sRes = res+"";
	         System.out.println("El valor en USD es de: $" + sRes);			
	      } 
	      
	      
	      //MonedaAdapter permite convertir a otras monedas
	      else if(moneda.equals("Eur") || moneda.equals("Gbp")){
	         monedaAdapter = new MonedaAdapter(moneda);
	         monedaAdapter.convertir(moneda, cantidad);
	      }
	      
	      else{
	         System.out.println("Inválido. Moneda " + moneda + " no aceptada");
	      }
	   } 
	   public static void main(String[] args) {
		      ConverterCRCUSD converter = new ConverterCRCUSD();

		      converter.convertir("Usd", 3500);
		      converter.convertir("Eur", 1000);
		      converter.convertir("Gbp", 5000);
		      converter.convertir("Chf", 100);
		   }
	}

