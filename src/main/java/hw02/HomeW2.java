package hw02;

import java.util.Random;
import java.util.Scanner;

public class HomeW2 {
    public static void main(String[] args) {
        //decleration/creation
        System.out.println("All set. Get ready to rumble!");
        System.out.println("enter the numbers of column and raw");
        Random rand1 = new Random();
        Random rand2 = new Random();
        int HEIGHT = rand1.nextInt(4) + 1;
        int WIDTH = rand2.nextInt(4) +1;
        int rowMax = 5 + 1;
        int colMax = 5 + 1;
        int guessHeight;
        int guessWidth;
        boolean won = false;
        Scanner scan = new Scanner(System.in);
        int [][] a = new int[rowMax][colMax];
        String [][] c = new String[rowMax][colMax];
        int[] line = new int[a.length];

        //calculation
        while(won == false){
            guessWidth = scan.nextInt();
            guessHeight = scan.nextInt();
            if(guessWidth == WIDTH && guessHeight == HEIGHT){
                for (int row = 0; row < rowMax; row++) {
                    for (int col = 0; col < colMax; col++) {
                        a[row][col] = row + col;
                        if(row == 0 || col == 0){
                            System.out.print(a[row][col] + " ");
                        }
                        else if(row == guessHeight && col == guessWidth){
                            c[row][col]= "*";
                            System.out.print(c[row][col] + " ");
                        }
                        else if(row == WIDTH && col == HEIGHT){
                            c[row][col]= "X";
                            System.out.print(c[row][col] + " ");
                        }
                        else{
                            c[row][col] = "-";
                            System.out.print(c[row][col] + " ");
                        }
                    }
                    System.out.println();
                }
                won = true;
            }
            else {
                for (int row = 0; row < rowMax; row++) {
                    for (int col = 0; col < colMax; col++) {
                        a[row][col] = row + col;
                        if(row == 0 || col == 0){
                            System.out.print(a[row][col] + " ");
                        }
                        else if(row == guessHeight && col == guessWidth){
                            c[row][col]= "*";
                            System.out.print(c[row][col] + " ");
                        }
                        else{
                            c[row][col] = "-";
                            System.out.print(c[row][col] + " ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("enter the numbers of column and raw again");
            }
        }

        //print
        System.out.println("Congratulations,");
        System.out.println();
    }
}
