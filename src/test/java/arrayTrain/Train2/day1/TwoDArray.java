package arrayTrain.Train2.day1;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of row:");
        int row = sc.nextInt();

        System.out.print("Enter no of col:");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter the array elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //print array
        System.out.println("The array is");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}