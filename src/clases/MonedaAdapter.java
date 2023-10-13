package clases;

import interfaces.ConversionEurGbp;
import interfaces.ConversionUsd;

public class MonedaAdapter implements ConversionUsd {

	   ConversionEurGbp converterEurGbp;

	   public MonedaAdapter(String moneda){
	   
	      if(moneda.equals("Eur") ){
	         converterEurGbp = new ConverterEur();			
	         
	      }else if (moneda.equals("Gbp")){
	         converterEurGbp = new ConverterGbp();
	      }	
	   }

	   
	   public void convertir(String moneda, int cantidad) {
	   
	      if(moneda.equals("Eur")){
	         converterEurGbp.convertirEur(cantidad);
	      }
	      else if(moneda.equals("Gbp")){
	    	  converterEurGbp.convertirGbp(cantidad);
	      }
	   }
	}