//Задача 2: Задайте двумерный массив. Напишите программу, которая поменяет местами первую и последнюю строку массива.
import static java.lang.System.out;

public class Task2 {
	public static void main(String[] args) {
		
		int[] [] matrix = {{1,2,3,4}, {4,5,6,7}, {7,8,9,10}};
		matrix = changeMatrix(matrix);
		
		Task2 myTask = new Task2();
		myTask.printMatrix(matrix);
	}
	
	public static int[][] changeMatrix(int[][] matrix) {
		
		int change;
		for(int i = 0; i < matrix[0].length; i++) {  
			change = matrix[0][i];
			matrix[0][i] = matrix[matrix.length - 1][i];
			matrix[matrix.length - 1][i] = change;
		}
		return matrix;
	}
	
	public void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {  //идём по строкам
         		for (int j = 0; j < matrix[0].length; j++) {//идём по столбцам
             			out.print(" " + matrix[i][j] + " "); //вывод элемента
          		}	
         	out.println();//перенос строки
      		}
	}
}
