//Задача 4*(не обязательная): Задайте двумерный массив из целых чисел. 
//Напишите программу, которая удалит строку и столбец, на пересечении 
//которых расположен наименьший элемент массива. 
//Под удалением понимается создание нового двумерного массива без строки и столбца
import static java.lang.System.out;

public class Task4 {
	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[] minInMatrixIndex = minInMatrixIndex(matrix);
		int[][] newMatrix = new int[matrix.length - 1][matrix[0].length - 1];
		
		for(int i = 0, a = 0; i < matrix.length; i++) {
			if(i == minInMatrixIndex[0]) {
				continue;
			}
			for(int j = 0, b = 0; j < matrix[0].length; j++) {
				if(j == minInMatrixIndex[1]) {
					continue;
				}
				newMatrix[a][b] = matrix[i][j];
				b++;
			}
			a++;
		}
		
		Task4 myTask4 = new Task4();
		Task4.printMatrix(newMatrix);		
	}
	
	public static int[] minInMatrixIndex (int[][] matrix) { //находим строку и столбец мин значения
		
		int row = 0;
		int column = 0;
		int min = matrix[0][0];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(min > matrix[i][j]) {
					min = matrix[i][j];
					row = i;
					column = j;
				}
			}
		}
		
		int[] array = {row, column};
		return array;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {  
         		for (int j = 0; j < matrix[0].length; j++) {
             			out.print(" " + matrix[i][j] + " "); 
          		}	
         	out.println();
      		}
	}
}
