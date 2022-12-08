package biosfera;

import java.util.Random;

public class umidade {
	
	static Random random = new Random();
	
	static int[][] pegarUmidade(int[][] matriz) {
		
		for(int i=0; i<matriz.length; i++){
				matriz[i][1] = random.nextInt(90);
		}
		
		return matriz;
	}
}
