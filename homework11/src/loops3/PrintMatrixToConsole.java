package loops3;

public class PrintMatrixToConsole {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};

				for (int i = 0; i < matrix.length; i++) {
					int[] line = matrix[i];
					for (int j = 0; j < line.length; j++) {
						System.out.print(line[j] + " ");
					}
					System.out.println();
			
				}
			}
			
		}

