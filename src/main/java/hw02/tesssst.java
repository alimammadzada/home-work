package hw02;

import java.util.Random;
import java.util.Scanner;

public class tesssst {
    public static void main(String[] args) {
        //decleration/creation
        System.out.println("All set. Get ready to rumble!");
        Random rand1 = new Random();
        Random rand2 = new Random();
        int HEIGHT = rand1.nextInt(5);
        int WIDTH = rand2.nextInt(5);
        int rowMax = 5 + 1;
        int colMax = 5 + 1;
        int guessHeight;
        int guessWidth;
        boolean won = false;
        Scanner scan = new Scanner(System.in);
        int [][] a = new int[rowMax][colMax];
        char [][] c = new char[rowMax][colMax];
        int[] line = new int[a.length];

        //calculation
        for (int row = 0; row < rowMax; row++) {
            for (int col = 0; col < colMax; col++) {
                guessWidth = scan.nextInt();
                guessHeight = scan.nextInt();
                a[row][col] = row + col;
                if(row == 0 || col == 0){
                    System.out.print(a[row][col] + " ");
                }
                else if(guessHeight == HEIGHT && guessWidth == WIDTH){
                    c[row][col]= '*';
                    System.out.print(c[row][col] + " ");
                }
                else if(row == HEIGHT && col == WIDTH){
                    c[row][col]= 'X';
                    System.out.println("Congratulations,");
                    System.out.print(c[row][col] + " ");
                }
                else{
                    System.out.print("- ");
                }
            }
            System.out.println("Congratulations");
        }

        //print

    }
}
