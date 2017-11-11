/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie_de_taylor;

/**
 *
 * @author LENOVO1
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;



public class Serie_de_taylor {
	public static void main (String[]args) throws NumberFormatException, IOException 
	{
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );
		
			bw.write( "Serie de Taylor "+ serie_taylor(90)  + "\n");
			bw.write( "Serie de Taylor "+ serie_taylor (2) + "\n");
			bw.flush() ;
		
	}
	
	private static double serie_taylor (int x ) 
	{
		double acum = 0.0;
	
		
		for (int i = 0 ; i <= 50 ; i ++ ) 
		{
			
			int potencia = 0;
			acum += ( potencia ((-1),i) * potencia (x,(2*i)+1)) / factorial((2*i) + 1);
		}
		
		return acum; 
	}

	                                                                                                                                                              
	private static int factorial(int i)
	{
		return ((2*i) + 1);
	}

	private static int potencia(double x, int i) {
		double potencia = 1;
		for(int j = 0; j< i ; j++)
		{
			potencia *= x;
		}
		return (int) potencia;
	}



}

