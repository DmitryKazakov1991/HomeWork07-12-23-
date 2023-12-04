//Задача 3: Задайте прямоугольный двумерный массив. Напишите программу, 
//которая будет находить строку с наименьшей суммой элементов.
import static java.lang.System.out;

public class Task3 {
	public static void main(String[] args) {
		
		int[] [] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int[] array = new int[matrix.length];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				array[i] += matrix[i][j];
			}
		}
		
		out.print("The row with the minimum amount: " + findMinIndex(array));
	}
	
	public static int findMinIndex(int[] array) {

		int min = array[0];
		int minIndex = 0;
		
		for(int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex; 
	}
}
