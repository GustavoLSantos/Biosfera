package biosfera;

import java.util.Arrays;

public class organizacaoDaMatriz {
	static void ReverterLinha(int a[], int n) {
        int i, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }
	
	static int[][] InversaoDeArray(int[][] mat, int linha, int coluna){

		int[][] arrayInvertido = new int[coluna][linha];
		for(int i = 0; i < linha; i++){
			for(int j = 0; j < coluna; j++){
				arrayInvertido[j][i] = mat[i][j];
			}
		}
		return arrayInvertido;
	}

	static void OrdenacaoDaMatriz(int[][] matriz){
		Arrays.sort(matriz[0]);
		Arrays.sort(matriz[1]);
		ReverterLinha(matriz[1], matriz[1].length);
		Arrays.sort(matriz[2]);
	}
	
	static int[][] NormalizacaoDaMatriz(int[][] mat, int N, int M){
		
		int[][] MatrizTemporaria = InversaoDeArray(mat, N, M);
		OrdenacaoDaMatriz(MatrizTemporaria);
		mat = InversaoDeArray(MatrizTemporaria, M, N);

		return mat;
	}
	 
}
