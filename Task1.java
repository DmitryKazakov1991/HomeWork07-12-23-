// Задача 1: Напишите программу, которая на вход принимает позиции элемента 
//в двумерном массиве, и возвращает значение этого элемента или же указание, что такого элемента нет.
import java.util.Scanner;
import static java.lang.System.out;

public class Task1 {
	public static void main(String[] args) {
		
		int[] [] doubleArray = {{1,2,3}, {4,5,6}};
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter the line number: ");
		int line = keyboard.nextInt();
		out.println("Enter the column number: ");
		int column = keyboard.nextInt();
		
		if(line < 3 && column < 2) {
			out.println(doubleArray[line][column]);
		}else {
			out.println("Ellement not found");
		}
	}
}
