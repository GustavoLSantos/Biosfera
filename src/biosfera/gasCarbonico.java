package biosfera;

import java.util.Random;

public class gasCarbonico {
	
	static Random random = new Random();
	
	static int[][] pegarGasCarbonico(int[][] matriz) {
		
		for(int i=0; i<matriz.length; i++){
				matriz[i][2] = random.nextInt(600);
		}
		
		return matriz;
	}
}
