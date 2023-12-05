import static java.lang.System.out;

public class Program {
	public static void main(String[] args) {
		
		int[][] matrix = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, 
						  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						  {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
						  {0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
						  {0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
						  {0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
						  {0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},						  
						  {0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},						  
						  {0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},						  
						  {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},						  
						  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},						  
						  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},						  
						  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},						  
						  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},						  
		};
		int[] point = {8,13};
		
		Program myProgram = new Program();
		myProgram.printInMatrix(matrix, point);
		myProgram.dysplayMatrix(matrix);
		}

	
	public static void dysplayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {  //идём по строкам
         		for (int j = 0; j < matrix[0].length; j++) {//идём по столбцам
         			if(matrix[i][j] == 0) {
             			out.print(" " + matrix[i][j] + " "); //вывод элемента
         			}
         			if(matrix[i][j] == 1) {
             			out.print(" " + "*" + " "); //вывод элемента *
         			}
         			
          		}	
         	out.println();//перенос строки
      		}
	}

	public static int[][] printInMatrix(int[][] matrix, int[] point) {
		matrix[point[0]][point[1]] = 1;
		
		boolean allOne = false;
		
		while(allOne == false) {
			if(matrix[point[0] - 1][point[1]] == 0) {
				matrix[point[0] - 1][point[1]] = 1;
				point[0] -= 1;
				continue;
			}
			if(matrix[point[0]][point[1] - 1] == 0) {
				matrix[point[0]][point[1] - 1] = 1;
				point[1] -= 1;
				continue;
			}
			if(matrix[point[0] + 1][point[1]] == 0) {
				matrix[point[0] + 1][point[1]] = 1;
				point[0] += 1;
				continue;
			}
			if(matrix[point[0]][point[1] + 1] == 0) {
				matrix[point[0]][point[1] + 1] = 1;
				point[1] += 1;
				continue;
			}
			if(matrix[point[0] - 1][point[1]] == 1 && matrix[point[0]][point[1] - 1] == 1 &&
			   matrix[point[0] + 1][point[1]] == 1 && matrix[point[0]][point[1] + 1] == 1) {
				allOne = true;
			}
		}
		
		return matrix;
	}

}


