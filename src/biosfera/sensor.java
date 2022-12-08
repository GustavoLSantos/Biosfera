package biosfera;

import java.util.Date;

public class sensor {
	
	public static void main (String[] args) {
			
		int[][] mat;
		Date date = new Date();
		mat = new int [48][3];
		
		
		temperatura.pegarTemperaturas(mat);
		umidade.pegarUmidade(mat);
		gasCarbonico.pegarGasCarbonico(mat);
	
		int[][] arrayFinal = organizacaoDaMatriz.NormalizacaoDaMatriz(mat, mat.length, mat[0].length);
		
		for(int j=0; j< mat.length; j++) {
				date = new Date(date.getTime()+ 30*60*1000);
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=");
		        System.out.printf("Temperatura: " + arrayFinal[j][0] + "ºC");
		        System.out.printf(" - Data e Hora: " + date);
		        System.out.println("");
		        System.out.printf("Umidade: " + arrayFinal[j][1] + "ºg/m³");
		        System.out.printf(" - Data e Hora: " + date);
		        System.out.println("");
		        System.out.printf("Gás Carbônico: " + arrayFinal[j][2] + " ppm");
			    System.out.printf(" - Data e Hora: " + date); 
			    System.out.println("");
			}
		}		
	}	

