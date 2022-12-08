package biosfera;

import java.util.Random;

public class temperatura {
	
	static Random random = new Random();
	
	static int[][] pegarTemperaturas(int[][] matriz) {
		
		for(int i=0; i<matriz.length; i++){
				matriz[i][0] = random.nextInt(80);
		}
		
		return matriz;
	}
}
